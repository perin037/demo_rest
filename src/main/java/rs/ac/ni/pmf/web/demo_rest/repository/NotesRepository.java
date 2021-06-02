package rs.ac.ni.pmf.web.demo_rest.repository;

import rs.ac.ni.pmf.web.demo_rest.model.Note;

import java.util.ArrayList;
import java.util.List;

public class NotesRepository {
    public static final List<Note> NOTES = new ArrayList<>();

    static{
        NOTES.add(Note.builder().id(1).title("Naslov 1").content("Sadrzaj 1").build());
        NOTES.add(Note.builder().id(2).title("Naslov 2").content("Sadrzaj 2").build());
    }
}
