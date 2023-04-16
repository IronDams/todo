package fr.dtent.todo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.dtent.todo.models.Notes;

@Repository
public interface NoteRepository extends CrudRepository<Notes, Long> {

}