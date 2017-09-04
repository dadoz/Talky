package application.davidelmn.talky.adapter

import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import application.davidelmn.talky.R
import application.davidelmn.talky.models.Contact

/**
 * Created by davide-syn on 9/4/17.
 */
class ContactsRecyclerViewAdapter(val items: List<Contact>): RecyclerView.Adapter<ContactsRecyclerViewAdapter.ViewHolder>() {
    override fun getItemCount(): Int  = items.size

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ContactsRecyclerViewAdapter.ViewHolder =
            ViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.contact_item, parent))

    override fun onBindViewHolder(holder: ContactsRecyclerViewAdapter.ViewHolder?, position: Int) {
        val item = items[position]
        holder?.contactIcon?.background = ContextCompat.getDrawable(holder?.itemView?.context, R.color.colorAccent)
        holder?.contactName?.text = item.login
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var contactIcon: ImageView = itemView.findViewById(R.id.contactIconImageViewId)
        var contactName: TextView= itemView.findViewById(R.id.contactNameTextViewId)
    }
}