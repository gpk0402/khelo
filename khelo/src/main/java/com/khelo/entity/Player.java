package com.khelo.entity;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Player {
	
	@Field(name="user_id")
	private String id;
	@Field(name="name")
	private List<Map<String, String>> name;
	@Field(name="phone_number")
	private String phoneNumber;
	@Field(name="email")
	private String email;
	@Field(name="date_of_birth")
	private Date dateOfBirth;
	@Field(name="gender")
	private int gender;
	@Field(name="khe_elo_rating")
	private List<Map<String, Integer>> kheEloRating ;
	@Field(name="communities")
	private List<Map<String, String>> communities;
	@Field(name="device_token_id")
	private String deviceTokenId;
	@Field(name="profile_picture_url")
	private String profilePictureUrl;
	@Field(name="location")
	private Map<String, Integer> location;
	@Field(name="referral_details")
	private Map<String, ?> referralDetails;
	
}
