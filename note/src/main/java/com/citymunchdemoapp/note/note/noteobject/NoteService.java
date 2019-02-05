package com.citymunchdemoapp.note.note.noteobject;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteService {

	@Autowired
	private NoteRepository noteRepository;

	// jpa methods
	public List<Note> getNotes() {
		List<Note> notes = new ArrayList<>();
		noteRepository.findAll().forEach(notes::add);
		return notes;
	}

	public Optional<Note> getNoteById(String id) {
		return noteRepository.findById(id);
	}

	public void addNote(Note noteModel) {
		noteRepository.save(noteModel);
	}

	public void updateNote(String Id, Note noteModel) {
		noteRepository.save(noteModel);
	}

	public void removeNote(String Id) {
		noteRepository.deleteById(Id);
	}

}
