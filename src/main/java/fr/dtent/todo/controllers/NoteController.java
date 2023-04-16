package fr.dtent.todo.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.dtent.todo.models.Notes;
import fr.dtent.todo.services.NoteService;

@RestController
@RequestMapping("/notes")
public class NoteController {

    private static NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        noteService.deleteById(id);
    }

    @GetMapping("")
    public Iterable<Notes> findAll() {
        return noteService.findAll();
    }

    @GetMapping("/{id}")
    public Notes findById(@PathVariable Long id) {
        return noteService.findById(id);
    }

    @PostMapping("")
    public Notes save(@RequestBody Notes note) {
        return noteService.save(note);
    }

    
    
}
