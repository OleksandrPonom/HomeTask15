package com.example.HomeTask15.controller.request;

import lombok.Data;

@Data
public class UpdateNoteRequest extends NoteRequest {

	public UpdateNoteRequest() {
	}

	public UpdateNoteRequest(String title, String content) {
		super();
	}
}
