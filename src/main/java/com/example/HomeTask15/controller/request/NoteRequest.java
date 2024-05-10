package com.example.HomeTask15.controller.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class NoteRequest {

	private String title;
	private String content;
}
