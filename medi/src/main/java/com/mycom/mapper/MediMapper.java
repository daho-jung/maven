package com.mycom.mapper;

import java.util.List;

//import com.mycom.domain.PatientVO;
import com.mycom.domain.tempvo;

public interface MediMapper {
	public List<tempvo> getList();
	public void insert(tempvo temp);
	public int delete(String s);
	public int modi(String s);
	
}
