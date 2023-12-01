package com.khelo.entity;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "players")
@Repository
public class Player {
	
	@Id
	private String id;
	@Field(name="name")
	private Map<String, String> name;
	@Field(name="phone_number")
	@Indexed(unique = true)
	private String phoneNumber;
	@Indexed(unique = true)
	@Field(name="email")
	private String email;
	@Field(name="date_of_birth")
	private LocalDate dateOfBirth;
	@Field(name="gender")
	private int gender;
	@Field(name="khe_elo_rating")
	private List<Map<String, Integer>> kheEloRating ;
	@Field(name="communities")
	private List<Map<String, CommunityData>> communities;
	@Field(name="device_token_id")
	private String deviceTokenId;
	@Field(name="profile_picture_url")
	private String profilePictureUrl;
	@Field(name="location")
	private Map<String, Integer> location;
	@Field(name="referral_details")
	private ReferralData referralDetails;
	
}
