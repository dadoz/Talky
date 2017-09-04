package application.davidelmn.talky.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import application.davidelmn.talky.R

/**
 * Created by davide-syn on 9/4/17.
 */
class ContactsRecyclerViewAdapter(val items: List<String>): RecyclerView.Adapter<ContactsRecyclerViewAdapter.ViewHolder>() {
    override fun getItemCount(): Int  = items.size

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ContactsRecyclerViewAdapter.ViewHolder = ViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.abc_action_bar_title_item, parent))

    override fun onBindViewHolder(holder: ContactsRecyclerViewAdapter.ViewHolder?, position: Int) {
        val item = items[position]
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        init {
        }
    }
}