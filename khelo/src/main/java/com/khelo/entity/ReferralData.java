package com.khelo.entity;

import java.util.List;
import java.util.Map;

import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Repository
@Builder
@NoArgsConstructor
public class ReferralData {
	@DBRef
	private Player referredBy;
	private List<Map<String, RewardsData>> rewards;
	private List<Player> your_referrals;

}
