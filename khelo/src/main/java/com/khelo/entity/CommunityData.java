package com.khelo.entity;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.stereotype.Repository;

import lombok.Data;
@Repository
@Data
public class CommunityData {
	@DBRef
	private String communityId;
	private int status;
	private String playerDetails;

}
