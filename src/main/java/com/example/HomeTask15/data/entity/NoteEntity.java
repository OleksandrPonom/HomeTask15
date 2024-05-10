package com.example.HomeTask15.data.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;


@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "note")
public class NoteEntity extends BaseEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID id;

	@Column
	private String title;

	@Column
	private String content;
}
