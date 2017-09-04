package application.davidelmn.talky.presenters

import application.davidelmn.talky.models.Contact
import application.davidelmn.talky.repositories.GithubRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by davide-syn on 8/30/17.
 */

class ContactListPresenter(view: ContactListView<Contact>) {
    private val githubRepository: GithubRepository by lazy { GithubRepository() }
    init {
        githubRepository.getContacts()
                .filter({list -> !list.isEmpty()})
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ list -> view.setData(list) }, { error -> view.onError(error) })
    }
}

