package com.thoughtbot.expandablerecyclerview.sample.expand

import ContactViewHolder
import android.view.LayoutInflater
import android.view.ViewGroup
import com.expandable_recycler_view.GroupViewHolderMy
import com.expandable_recycler_view.R
import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup
import com.thoughtbot.expandablerecyclerview.sample.Group

class GroupAdapter(groups: List<ExpandableGroup<*>>) : ExpandableRecyclerViewAdapter<GroupViewHolderMy, ContactViewHolder>(groups) {

    override fun onCreateGroupViewHolder(parent: ViewGroup, viewType: Int): GroupViewHolderMy {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.group_layout_item, parent, false)
        return GroupViewHolderMy(view)
    }

    override fun onCreateChildViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.contact_child_item, parent, false)
        return ContactViewHolder(view)
    }

    override fun onBindChildViewHolder(
        holder: ContactViewHolder, flatPosition: Int,
        group: ExpandableGroup<*>, childIndex: Int
    ) {

        val contact = (group as Group).getItems().get(childIndex)
        holder.setContactName(contact.name.toString())
    }

    override fun onBindGroupViewHolder(
        holder: GroupViewHolderMy, flatPosition: Int,
        group: ExpandableGroup<*>
    ) {

        holder.setGroupTitle(group)
    }


}
