package com.citymunchdemoapp.note.note.noteobject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Note {

	@Id
	private String noteId;
	private String noteTopic;
	private String noteDescription;

	public Note() {

	}

	public Note(String noteId, String noteTopic, String noteDescription) {
		super();
		this.noteId = noteId;
		this.noteTopic = noteTopic;
		this.noteDescription = noteDescription;
	}

	public String getNoteId() {
		return noteId;
	}

	public void setNoteId(String noteId) {
		this.noteId = noteId;
	}

	public String getNoteTopic() {
		return noteTopic;
	}

	public void setNoteTopic(String noteTopic) {
		this.noteTopic = noteTopic;
	}

	public String getNoteDescription() {
		return noteDescription;
	}

	public void setNoteDescription(String noteDescription) {
		this.noteDescription = noteDescription;
	}

}
