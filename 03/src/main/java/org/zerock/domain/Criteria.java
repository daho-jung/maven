package org.zerock.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Criteria {
	private int pageNum;
	private int amount;
	
	private String type;
	private String keyword;
	
	public Criteria() {
		this(1,10);
	}
	
	public Criteria(int pn,int am) {
		this.pageNum = pn;
		this.amount = am;
	}
	
	public String[] getTypeArr() {
		return type==null? new String[] {}: type.split("");
	}
}
