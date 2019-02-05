package com.citymunchdemoapp.note.note.noteobject;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.citymunchdemoapp.note.note.noteobject.constants.NoteConstants;
import com.citymunchdemoapp.note.note.noteobject.exceptions.NoteException;

@RestController
public class NoteController {

	@Autowired
	private NoteService noteService;

	@RequestMapping(value = NoteConstants.endpoint)
	public List<Note> helloWorld() throws NoteException {
		try {
			return noteService.getNotes();
		}
		catch (Exception e) {	
			throw new NoteException();
		}
	}

	@RequestMapping(NoteConstants.endpoint + "/{id}")
	public Optional<Note> getNoteById(@PathVariable String id) throws NoteException {
		try {
		return noteService.getNoteById(id);
		}
		catch (Exception e) {	
			throw new NoteException();
		}
	}

	@RequestMapping(method = RequestMethod.POST, value = NoteConstants.endpoint)
	public void addNote(@RequestBody Note noteModel) throws NoteException {
		try {
		noteService.addNote(noteModel);
		}
		catch (Exception e) {	
			throw new NoteException();
		}
	}

	@RequestMapping(method = RequestMethod.PUT, value = NoteConstants.endpoint + "/{id}")
	public void updateNote(@PathVariable String id, @RequestBody Note noteModel) throws NoteException {
		try {
		noteService.updateNote(id, noteModel);}
		catch (Exception e) {	
			throw new NoteException();
		}
	}

	@RequestMapping(method = RequestMethod.DELETE, value = NoteConstants.endpoint + "/{id}")
	public void deleteNote(@PathVariable String id) throws NoteException {
		try {
		noteService.removeNote(id);
		}
		catch (Exception e) {	
			throw new NoteException();
		}
		
	}

}
