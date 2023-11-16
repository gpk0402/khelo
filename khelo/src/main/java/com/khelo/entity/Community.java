package com.khelo.entity;

import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Community {
	
	@Id
	@Field(name="community_id")
	private String id;
	@Field(name="community_name")
	private String name;
	@Field(name="community_type")
	private String communityType;
	@Field(name="location")
	private Map<String, Integer> location;
	@Field(name="community_icon")
	private String communityIcon;
	@Field(name="admin") //yet to write relation
	private Player admin;
	@Field(name="members")
	private List<Map<String, ?>> members;
	@Field(name="player_details_type")
	private String playerDetailsType;
	

}
