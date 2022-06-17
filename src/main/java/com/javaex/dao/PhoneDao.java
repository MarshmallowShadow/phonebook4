package com.javaex.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.PersonVo;

@Repository
public class PhoneDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public int personInsert(PersonVo pVo) {
		//System.out.println(pVo);
		int count = sqlSession.insert("phonebook.personInsert", pVo);
		return count;
	}
	
	public int personInsert2(Map<String, String> pMap) {
		//System.out.println(pMap.toString());
		int count = sqlSession.insert("phonebook.personInsert2", pMap);
		return count;
	}
	
	
	public int personUpdate(PersonVo pVo) {
		//System.out.println(pVo);
		int count = sqlSession.update("phonebook.personUpdate", pVo);
		return count;
	}
	
	
	public int personDelete(int personId) {
		//System.out.println(personId);
		int count = sqlSession.delete("phonebook.personDelete", personId);
		return count;
	}
	
	public List<PersonVo> personSelect() {
		List<PersonVo> pList = sqlSession.selectList("phonebook.personSelect");
		//System.out.println(pList);
		return pList;
	}
	
	
	public PersonVo getPerson(int personId) {
		PersonVo pVo = sqlSession.selectOne("phonebook.getPerson", personId);
		//System.out.println(pVo);
		return pVo;
	}
	
	public Map<String, Object> getPerson2(int personId) {
		Map<String, Object> pMap = sqlSession.selectOne("phonebook.getPerson2", personId);
		//System.out.println(pVo);
		return pMap;
	}
}
