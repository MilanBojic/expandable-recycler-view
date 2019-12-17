package com.thoughtbot.expandablerecyclerview.sample

import com.expandable_recycler_view.Person
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup

class Group(title: String, items: List<Person>, val iconResId: Int) :
    ExpandableGroup<Person>(title, items) {

    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o !is Group) return false
        return false
    }

    override fun hashCode(): Int {
        return 0
    }
}

