package com.khelo.entity;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Match {
	
	@Id
	@Field(name="match_id")
	private String id;
	@DBRef
	@Field(name="sport_id")
	private Sport sportId;
	@Field(name="games")
	private List<Map<String, GameData>> games;
	@DBRef
	@Field(name="players")
	private List<Player> players;
	@DBRef
	@Field(name="winner")
	private Player winner;
	@Field(name="played_at")
	private Map<String, Integer> playedAt;
	@Field(name="date_time")
	private Date dateTime;
	@DBRef
	@Field(name="created_by")
	private Player createdBy;
	@Field(name="created_at")
	private Date createdAt;
}
