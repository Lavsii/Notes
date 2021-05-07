package ru.geekbrains.notes.domain;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;

import java.util.Date;

public class Note {

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
}
