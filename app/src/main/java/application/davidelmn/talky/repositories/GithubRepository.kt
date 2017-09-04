package application.davidelmn.talky.repositories

import application.davidelmn.talky.models.Contact
import application.davidelmn.talky.services.RetrofitService
import io.reactivex.Observable

/**
 * Created by davide-syn on 9/4/17.
 */
class GithubRepository: RepositoryInterface {
    private val retrofitService :RetrofitService by lazy { RetrofitService.init() }

    override fun getContacts(): Observable<List<Contact>> {
        return retrofitService.users()
    }

}

interface RepositoryInterface {
    fun getContacts(): Observable<List<Contact>>
}
