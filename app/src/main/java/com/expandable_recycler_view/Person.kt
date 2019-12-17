package com.expandable_recycler_view

import android.os.Parcel
import android.os.Parcelable


class Person : Parcelable {

    var name: String? = null
        private set


    constructor(name: String) {
        this.name = name
    }

    protected constructor(`in`: Parcel) {
        name = `in`.readString()
    }

    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o !is Person) return false

        val contact = o as Person?

        return if (name != null) name == contact?.name else contact?.name == null

    }

    override fun hashCode(): Int {
        val result = if (name != null) name!!.hashCode() else 0
        return result
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeString(name)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Person> {
        override fun createFromParcel(parcel: Parcel): Person {
            return Person(parcel)
        }

        override fun newArray(size: Int): Array<Person?> {
            return arrayOfNulls(size)
        }
    }


}

