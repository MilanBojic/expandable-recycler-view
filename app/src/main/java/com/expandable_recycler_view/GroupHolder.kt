package com.expandable_recycler_view


import android.view.View
import android.view.animation.Animation.RELATIVE_TO_SELF
import android.view.animation.RotateAnimation
import android.widget.ImageView
import android.widget.TextView
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup
import com.thoughtbot.expandablerecyclerview.sample.Group
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder


class GroupHolder(itemView: View) : GroupViewHolder(itemView) {

    private val groupIcon: ImageView
    private val groupName: TextView
    private val arrow: ImageView

    init {
        groupIcon = itemView.findViewById(R.id.group_item_icon) as ImageView
        groupName = itemView.findViewById(R.id.group_item_name) as TextView
        arrow = itemView.findViewById(R.id.group_item_arrow) as ImageView
    }

    fun setGroupTitle(group: ExpandableGroup<*>) {
        if (group is Group) {
            groupName.setText(group.title)
        }
    }

    fun setIcon(group: ExpandableGroup<*>) {
        groupIcon.setImageResource((group as Group).iconResId)
    }


    override fun expand() {
        animateExpand()
    }

    override fun collapse() {
        animateCollapse()
    }

    private fun animateExpand() {
        val rotate = RotateAnimation(360f, 180f, RELATIVE_TO_SELF, 0.5f, RELATIVE_TO_SELF, 0.5f)
        rotate.duration = 300
        rotate.fillAfter = true
        arrow.animation = rotate
    }

    private fun animateCollapse() {
        val rotate = RotateAnimation(180f, 360f, RELATIVE_TO_SELF, 0.5f, RELATIVE_TO_SELF, 0.5f)
        rotate.duration = 300
        rotate.fillAfter = true
        arrow.animation = rotate
    }
}


