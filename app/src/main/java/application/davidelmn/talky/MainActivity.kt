package application.davidelmn.talky

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import application.davidelmn.talky.adapter.ContactsRecyclerViewAdapter
import application.davidelmn.talky.presenters.ContactListView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ContactListView<String> {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onInitView()
    }

    private fun onInitView() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onStop() {
        super.onStop()
    }

    override fun setData(list: List<String>) {
        contactsRecyclerViewId.adapter = ContactsRecyclerViewAdapter(ArrayList())
    }
}
