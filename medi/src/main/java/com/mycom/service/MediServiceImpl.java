package com.mycom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycom.mapper.MediMapper;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class MediServiceImpl implements MediService{

	@Setter(onMethod_ = @Autowired)
	private MediMapper mapper;

	@Override
	public void register() {
		// TODO Auto-generated method stub
		
	}
	
//	@Override
//	public void register() {
//		mapper.insert();
//	}	

}
