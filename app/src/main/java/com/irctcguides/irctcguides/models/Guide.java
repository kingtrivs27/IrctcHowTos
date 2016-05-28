package com.irctcguides.irctcguides.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Ram on 26/05/16.
 */

public class Guide implements Parcelable{
    public final int id;
    public final String title;
    public final String image;
    public final String content;

    public Guide(int id, String title, String image, String content) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.content = content;
    }

    protected Guide(Parcel in) {
        id = in.readInt();
        title = in.readString();
        image = in.readString();
        content = in.readString();
    }

    public static final Creator<Guide> CREATOR = new Creator<Guide>() {
        @Override
        public Guide createFromParcel(Parcel in) {
            return new Guide(in);
        }

        @Override
        public Guide[] newArray(int size) {
            return new Guide[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(title);
        dest.writeString(image);
        dest.writeString(content);
    }
}
