package com.khelo.entity;

import java.util.List;
import java.util.Map;

import org.springframework.data.mongodb.core.mapping.DBRef;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GameData {
	private String gameId;
	private int gameNumber;
	private List<Map<String, Integer>> scores;
	@DBRef
	private Player winner;

}
