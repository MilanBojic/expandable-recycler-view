
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.expandable_recycler_view.R
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder

class ContactViewHolder(itemView: View) : ChildViewHolder(itemView) {

    private val childTextView: TextView
    private val dialImageView: ImageView

    init {
        childTextView = itemView.findViewById(R.id.list_item_contact_name) as TextView
        dialImageView = itemView.findViewById(R.id.list_item_contact_dial) as ImageView
    }

    fun setContactName(name: String) {
        childTextView.text = name
        dialImageView.setOnClickListener(View.OnClickListener { v ->Log.i("XXX","dial")})
    }


}
