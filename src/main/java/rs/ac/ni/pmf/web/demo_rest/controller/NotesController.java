package rs.ac.ni.pmf.web.demo_rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import rs.ac.ni.pmf.web.demo_rest.exception.ExceptionNotFound;
import rs.ac.ni.pmf.web.demo_rest.model.Note;
import rs.ac.ni.pmf.web.demo_rest.repository.NotesRepository;

import java.util.List;

@RestController
public class NotesController {


    @GetMapping("/notes")
    public List<Note> allNotes(){
        return NotesRepository.NOTES;
    }

    @GetMapping("/notes/{id}")
    public Note getNoteById(@PathVariable final long id){
        for(final Note note : NotesRepository.NOTES){
            if(note.getId() == id){
                return note;
            }
        }
        throw  new ExceptionNotFound(id);
    }
}
