package com.example.HomeTask15.service.service.impl;

import com.example.HomeTask15.data.entity.NoteEntity;
import com.example.HomeTask15.data.repository.NoteFakeRepository;
import com.example.HomeTask15.service.dto.NoteDto;
import com.example.HomeTask15.service.exeption.NoteNotFoundException;
import com.example.HomeTask15.service.mapper.NoteMapper;
import com.example.HomeTask15.service.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

@Service
public class NoteServiceImplement implements NoteService {

	@Autowired
	private NoteFakeRepository noteFakeRepository;
	@Autowired
	private NoteMapper noteMapper;

	@Override
	public List<NoteDto> listAll() {
		return noteMapper.toNoteDtos(noteFakeRepository.listAllNotes());
	}

	@Override
	public NoteDto add(NoteDto note) {
		NoteEntity entity = noteMapper.toNoteEntity(note);
		entity.setId(null);
		return noteMapper.toNoteDto(noteFakeRepository.addNote(entity));
	}

	@Override
	public void deleteById(UUID id) throws NoteNotFoundException {
		getById(id);
		noteFakeRepository.deleteByIdNote(id);
	}

	@Override
	public void update(NoteDto note) throws NoteNotFoundException {
		if (Objects.isNull(note.getId())) {
			throw new NoteNotFoundException();
		}
		getById(note.getId());
		noteFakeRepository.updateNote(noteMapper.toNoteEntity(note));
	}

	@Override
	public NoteDto getById(UUID id) throws NoteNotFoundException {
		Optional<NoteEntity> optionalNote = noteFakeRepository.getByIdNote(id);
		if (optionalNote.isPresent()) {
			return noteMapper.toNoteDto(optionalNote.get());
		} else {
			throw new NoteNotFoundException(id);
		}
	}
}
