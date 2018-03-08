package com.bitcamp.app.mapperImpl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.controller.PhoneController;
import com.bitcamp.app.domain.MobileDTO;
import com.bitcamp.app.mapper.MobileMapper;

@Repository
public class MobileMapperImpl implements MobileMapper{
	private static final Logger logger = LoggerFactory.getLogger(PhoneController.class);
	@Autowired SqlSessionTemplate sqlSession;
	String ns="com.bitcamp.app.mapperImpl.MobileMapperImpl.";
	
	@Override
	public List<MobileDTO> selectALL() {
		logger.info("MobileMapperImpl seq {}","");
		return sqlSession.selectList(ns+"selectALL");
	}

	@Override
	public void insertMobile(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateMobile(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMobile(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<MobileDTO> selectByNAME(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MobileDTO selectByid(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}


}
