package com.citymunchdemoapp.note.note.noteobject;

import org.springframework.data.repository.CrudRepository;

public interface NoteRepository extends CrudRepository<Note, String> {

}