package com.example.HomeTask15.controller.request;

import lombok.Data;

@Data
public class CreateNoteRequest {

	private String title;

	private String content;

	public CreateNoteRequest() {
	}

	public CreateNoteRequest(String title, String content) {
		this.title = title;
		this.content = content;
	}

	public boolean isValidateContent() {
		return (title.length() == 5 && content.length() == 5);
	}
}
