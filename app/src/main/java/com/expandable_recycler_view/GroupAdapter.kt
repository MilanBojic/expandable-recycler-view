package com.thoughtbot.expandablerecyclerview.sample.expand

import PersonViewHolder
import android.view.LayoutInflater
import android.view.ViewGroup
import com.expandable_recycler_view.GroupHolder
import com.expandable_recycler_view.R
import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup
import com.thoughtbot.expandablerecyclerview.sample.Group

class GroupAdapter(groups: List<ExpandableGroup<*>>) : ExpandableRecyclerViewAdapter<GroupHolder, PersonViewHolder>(groups) {

    override fun onCreateGroupViewHolder(parent: ViewGroup, viewType: Int): GroupHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.group_layout_item, parent, false)
        return GroupHolder(view)
    }

    override fun onCreateChildViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.contact_child_item, parent, false)
        return PersonViewHolder(view)
    }

    override fun onBindChildViewHolder(
        holder: PersonViewHolder, flatPosition: Int,
        group: ExpandableGroup<*>, childIndex: Int
    ) {

        val contact = (group as Group).getItems().get(childIndex)
        holder.setContactName(contact.name.toString())
        holder.avatar.setImageResource(R.drawable.default_avatar)

    }

    override fun onBindGroupViewHolder(
        holder: GroupHolder, flatPosition: Int,
        group: ExpandableGroup<*>
    ) {
        holder.setGroupTitle(group)
        holder.setIcon(group)
    }


}
