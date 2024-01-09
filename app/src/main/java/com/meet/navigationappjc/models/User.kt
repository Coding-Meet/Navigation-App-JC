package com.meet.navigationappjc.models

import android.os.Parcel
import android.os.Parcelable
import java.io.Serializable

/**
 * @author Coding Meet
 * Created 07-01-2024 at 02:37 pm
 */

data class User(
    val name: String = "",
    val age: Int = 0,
)
//    :Parcelable {
//    constructor(parcel: Parcel) : this(
//        parcel.readString()!!,
//        parcel.readInt()
//    ) {
//    }
//
//    override fun writeToParcel(parcel: Parcel, flags: Int) {
//        parcel.writeString(name)
//        parcel.writeInt(age)
//    }
//
//    override fun describeContents(): Int {
//        return 0
//    }
//
//    companion object CREATOR : Parcelable.Creator<User> {
//        override fun createFromParcel(parcel: Parcel): User {
//            return User(parcel)
//        }
//
//        override fun newArray(size: Int): Array<User?> {
//            return arrayOfNulls(size)
//        }
//    }
//}
