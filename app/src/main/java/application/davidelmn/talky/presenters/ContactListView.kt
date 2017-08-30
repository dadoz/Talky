package application.davidelmn.talky.presenters

/**
 * Created by davide-syn on 8/30/17.
 */
public interface ContactListView<T> {
    fun setData(list: List<T>)
}