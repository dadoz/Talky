package application.davidelmn.talky

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import application.davidelmn.talky.presenters.ContactListView

class MainActivity : AppCompatActivity(), ContactListView<String> {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStop() {
        super.onStop()
    }

    override fun setData(list: List<String>) {

    }
}
