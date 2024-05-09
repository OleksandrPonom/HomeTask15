package com.example.HomeTask15.data.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
public class NoteEntity {
	private UUID id;
	private String title;
	private String content;
}
