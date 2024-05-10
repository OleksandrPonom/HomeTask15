package com.example.HomeTask15.service.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NoteDto {

	private UUID id;
	private String title;
	private String content;
	private LocalDate lastUpdatedDate;
	private LocalDate createdDate;

}
