package com.khelo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "sports")
public class Sport {

	@Id
	@Field(name="sport_id")
	private int id;
	@Field(name="name")
	private String name;
	@Field(name="icon_url")
	private String iconUrl;
}
