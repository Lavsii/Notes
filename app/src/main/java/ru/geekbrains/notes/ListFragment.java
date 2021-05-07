package ru.geekbrains.notes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import java.util.List;
import ru.geekbrains.notes.domain.Note;
import ru.geekbrains.notes.domain.NotesRepository;


public class ListFragment extends Fragment {

    public ListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        List<Note> notes = new NotesRepository().getNotes();

        LinearLayout notesList = (LinearLayout) view;

        for (Note note : notes) {

            View noteView = LayoutInflater.from(requireContext()).inflate(R.layout.item_notes_2, notesList, false );

            TextView title = noteView.findViewById(R.id.notes_name);
            title.setText(note.getTitle());

            ImageButton btn2 = noteView.findViewById(R.id.delBtn);
            btn2.setBottom(note.getDrawableRes());

            TextView desc = noteView.findViewById(R.id.desc);
            desc.setText(note.getDesc());

            TextView createDate = noteView.findViewById(R.id.create_date);
            createDate.setText(note.getCreateDate());

            notesList.addView(noteView);

        }
    }
}