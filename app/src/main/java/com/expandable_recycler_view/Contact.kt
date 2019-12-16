package com.expandable_recycler_view

import android.annotation.SuppressLint
import android.os.Parcel
import android.os.Parcelable


class Contact : Parcelable {

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
        if (o !is Contact) return false

        val contact = o as Contact?

        return if (name != null) name == contact?.name else contact?.name == null

    }

    override fun hashCode(): Int {
        var result = if (name != null) name!!.hashCode() else 0
        return result
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeString(name)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object {

        @SuppressLint("ParcelCreator")
        val CREATOR: Parcelable.Creator<Contact> = object : Parcelable.Creator<Contact> {
            override fun createFromParcel(`in`: Parcel): Contact {
                return Contact(`in`)
            }

            override fun newArray(size: Int): Array<Contact?> {
                return arrayOfNulls(size)
            }
        }
    }


}

