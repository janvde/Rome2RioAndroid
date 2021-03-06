package com.getroadmap.r2rlib.models

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by jan on 11/07/16.
 */

data class SurfaceLineName(val name: String?) : Parcelable {
    constructor(parcel: Parcel) : this(parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<SurfaceLineName> {
        override fun createFromParcel(parcel: Parcel): SurfaceLineName {
            return SurfaceLineName(parcel)
        }

        override fun newArray(size: Int): Array<SurfaceLineName?> {
            return arrayOfNulls(size)
        }
    }
}
