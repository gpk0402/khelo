package com.khelo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Milestone {
	private int achieved;
	private int required;
}
