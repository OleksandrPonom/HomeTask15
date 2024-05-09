package com.example.HomeTask15.controller.response;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
public class NoteResponse {

	private UUID id;
	private String title;
	private String content;
}
