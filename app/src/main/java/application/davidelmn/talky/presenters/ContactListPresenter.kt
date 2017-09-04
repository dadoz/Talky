package application.davidelmn.talky.presenters

import application.davidelmn.talky.models.Contact

/**
 * Created by davide-syn on 8/30/17.
 */

class ContactListPresenter(view: ContactListView<Contact>) {
    init {
        //retrieve data
        val list: ArrayList<Contact> = ArrayList()
        list.add(Contact("Davide", "http://blalalallala.icon.en"))
        list.add(Contact("Frank", "http://bluuuuu.icon.en"))
        list.add(Contact("Mary", "http://bliiii.icon.en"))
        view.setData(list)
    }
}

