package application.davidelmn.talky

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import application.davidelmn.talky.adapter.ContactsRecyclerViewAdapter
import application.davidelmn.talky.models.Contact
import application.davidelmn.talky.presenters.ContactListPresenter
import application.davidelmn.talky.presenters.ContactListView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ContactListView<Contact> {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onInitView()
    }

    private fun onInitView() {
        ContactListPresenter(this)
    }

    override fun onStop() {
        super.onStop()
    }

    override fun setData(list: List<Contact>) {
        contactsRecyclerViewId.adapter = ContactsRecyclerViewAdapter(list)
    }
}
