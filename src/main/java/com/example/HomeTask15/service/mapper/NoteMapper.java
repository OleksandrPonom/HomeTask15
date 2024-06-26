package com.example.HomeTask15.service.mapper;

import com.example.HomeTask15.controller.request.CreateNoteRequest;
import com.example.HomeTask15.controller.request.UpdateNoteRequest;
import com.example.HomeTask15.controller.response.NoteResponse;
import com.example.HomeTask15.data.entity.NoteEntity;
import com.example.HomeTask15.service.dto.NoteDto;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
public class NoteMapper {

	public List<NoteEntity> toNoteEntities(Collection<NoteDto> dtos) {
		return dtos.stream()
				.map(this::toNoteEntity)
				.collect(Collectors.toList());
	}

	public NoteEntity toNoteEntity(NoteDto dto) {
		NoteEntity entity = new NoteEntity();
		entity.setId(dto.getId());
		entity.setTitle(dto.getTitle());
		entity.setContent(dto.getContent());
		entity.setLastUpdateDate(dto.getLastUpdatedDate());
		return entity;
	}

	public List<NoteDto> toNoteDtos(Collection<NoteEntity> entities) {
		return entities.stream()
				.map(this::toNoteDto)
				.collect(Collectors.toList());
	}

	public NoteDto toNoteDto(NoteEntity entity) {
		NoteDto dto = new NoteDto();
		dto.setId(entity.getId());
		dto.setTitle(entity.getTitle());
		dto.setContent(entity.getContent());
		dto.setCreatedDate(entity.getCreateDate());
		dto.setLastUpdatedDate(entity.getLastUpdateDate());
		return dto;
	}

	public List<NoteResponse> toNoteResponses(Collection<NoteDto> dtos) {
		return dtos.stream()
				.map(this::toNoteResponse)
				.collect(Collectors.toList());
	}

	public NoteResponse toNoteResponse(NoteDto dto) {
		NoteResponse response = new NoteResponse();
		response.setId(dto.getId());
		response.setTitle(dto.getTitle());
		response.setContent(dto.getContent());
		return response;
	}

	public List<NoteDto> requestsToNoteDtos(Collection<CreateNoteRequest> requests) {
		return requests.stream()
				.map(this::toNoteDto)
				.collect(Collectors.toList());
	}

	public NoteDto toNoteDto(CreateNoteRequest request) {
		NoteDto dto = new NoteDto();
		dto.setTitle(request.getTitle());
		dto.setContent(request.getContent());
		return dto;
	}

	public NoteDto toNoteDto(UUID id, UpdateNoteRequest request) {
		NoteDto dto = new NoteDto();
		dto.setId(id);
		dto.setTitle(request.getTitle());
		dto.setContent(request.getContent());
		return dto;
	}
}
