
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.expandable_recycler_view.R
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder

class PersonViewHolder(itemView: View) : ChildViewHolder(itemView) {

    private val childTextView: TextView
    val avatar: ImageView

    init {
        childTextView = itemView.findViewById(R.id.list_item_contact_name) as TextView
        avatar = itemView.findViewById(R.id.avatar) as ImageView
    }

    fun setContactName(name: String) {
        childTextView.text = name
    }


}
