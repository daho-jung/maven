package com.mycom.domain;

import lombok.Data;

@Data
public class PatientVO {
	private String ID;
	private String PW;
	private String name;
	private long age;
	private long weight;
	private long height;
	private double temper;
	private String rash;
	private String sex;
	private String medicheck;
}
