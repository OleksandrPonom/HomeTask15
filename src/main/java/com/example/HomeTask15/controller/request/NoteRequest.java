package com.example.HomeTask15.controller.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class NoteRequest {

	private String title;
	private String content;
}
