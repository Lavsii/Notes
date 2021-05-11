package ru.geekbrains.notes.domain;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;

public class Note implements Parcelable {

    @DrawableRes
    private final int drawableRes;

    @StringRes
    private final int title;
    private final int desc;

    private final int createDate;

    public Note(int title, int desc, int drawableRes, int createDate) {
        this.drawableRes = drawableRes;
        this.title = title;
        this.desc = desc;
        this.createDate = createDate;
    }

    protected Note(Parcel in) {
        drawableRes = in.readInt();
        title = in.readInt();
        desc = in.readInt();
        createDate = in.readInt();
    }

    public static final Creator<Note> CREATOR = new Creator<Note>() {
        @Override
        public Note createFromParcel(Parcel in) {
            return new Note(in);
        }

        @Override
        public Note[] newArray(int size) {
            return new Note[size];
        }
    };

    public int getTitle() {
        return title;
    }

    public int getDesc() {
        return desc;
    }

    public int getDrawableRes() {
        return drawableRes;
    }

    public int getCreateDate() {
        return createDate;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(drawableRes);
        dest.writeInt(title);
        dest.writeInt(desc);
        dest.writeInt(createDate);
    }
}
