package ru.geekbrains.notes.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ru.geekbrains.notes.R;

public class NotesRepository {

    public List<Note> getNotes() {
        ArrayList<Note> notes = new ArrayList<>();
        notes.add(new Note(R.string.note1, R.string.desc1, R.drawable.recyclerbin, R.string.createDate1));
        notes.add(new Note(R.string.note2, R.string.desc2, R.drawable.recyclerbin, R.string.createDate2));
        notes.add(new Note(R.string.note3, R.string.desc3, R.drawable.recyclerbin, R.string.createDate3));
        return notes;
    }
}
