package com.department.serviceName.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.department.serviceName.vo.UserVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AbstractDAO {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	protected void selectList(String statement) {
		log.info(statement + " is called.");
		List<UserVO> testData = sqlSessionTemplate.selectList(statement);
		log.info(testData.toString());
	}
}
