package com.example.HomeTask15.service.service;


import com.example.HomeTask15.service.dto.NoteDto;
import com.example.HomeTask15.service.exeption.NoteNotFoundException;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface NoteService {

	List<NoteDto> listAll();

	NoteDto add(NoteDto note);

	void deleteById(UUID id) throws NoteNotFoundException;

	void update(NoteDto note) throws NoteNotFoundException;

	NoteDto getById(UUID id) throws NoteNotFoundException;

	NoteDto getByTitle(String title) throws NoteNotFoundException;
}