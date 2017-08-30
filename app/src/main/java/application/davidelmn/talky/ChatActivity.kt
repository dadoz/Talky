package application.davidelmn.talky

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by davide-syn on 8/30/17.
 */

class ChatActivity : AppCompatActivity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStop() {
        super.onStop()
    }
}
