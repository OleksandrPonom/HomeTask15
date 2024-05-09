package com.example.HomeTask15;

import com.example.HomeTask15.data.entity.NoteEntity;
import com.example.HomeTask15.service.dto.NoteDto;
import com.example.HomeTask15.service.exeption.NoteNotFoundException;
import com.example.HomeTask15.service.service.NoteService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NoteServiceTests {
	@Autowired private NoteService noteService;

	@Test
	void testGetAllNote(){
		NoteDto note = new NoteDto();
		note.setTitle("Test");
		note.setContent("Test");
		noteService.add(note);
		noteService.listAll();
	}

	@Test
	void testAddNote() {
		NoteDto note = new NoteDto();
		note.setTitle("Test");
		note.setContent("Test");
		noteService.add(note);
	}

	@Test
	void testGetNoteById() throws NoteNotFoundException {
		NoteDto note = new NoteDto();
		note.setTitle("Test");
		note.setContent("Test");
		noteService.add(note);
		noteService.getById(note.getId());
	}

	@Test
	void testDeleteNoteById() throws NoteNotFoundException {
		NoteDto note = new NoteDto();
		note.setTitle("Test");
		note.setContent("Test");
		noteService.add(note);
		noteService.deleteById(note.getId());
	}

	@Test
	void testUpdateNoteById() throws NoteNotFoundException {
		NoteDto note = new NoteDto();
		note.setTitle("Test");
		note.setContent("Test");
		noteService.add(note);
		noteService.update(note);
	}
}
