package com.example.HomeTask15.service.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
public class NoteDto {

	private UUID id;
	private String title;
	private String content;
}
