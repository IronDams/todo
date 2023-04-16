package fr.dtent.todo.services;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import fr.dtent.todo.models.Notes;
import fr.dtent.todo.repositories.NoteRepository;

@Service
public class NoteService {
    private static NoteRepository noteRepository;
    
    public NoteService (NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public void deleteById(Long id) {
        noteRepository.deleteById(id);
    }

    public Iterable<Notes> findAll() {
        return noteRepository.findAll();
    }

    public Notes findById(Long id) {
        return noteRepository.findById(id).orElseThrow(() -> {new ResponseStatusException(HttpStatus.NOT_FOUND, "Elément non trouvé");});
    }

    public Notes save(Notes note) {
        return noteRepository.save(note);
    }
}
