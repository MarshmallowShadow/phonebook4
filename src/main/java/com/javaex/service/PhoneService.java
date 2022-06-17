package com.javaex.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.PhoneDao;
import com.javaex.vo.PersonVo;

@Service
public class PhoneService {
	
	@Autowired
	private PhoneDao pDao;
	
	public int personInsert(PersonVo pVo) {
		int count = pDao.personInsert(pVo);
		return count;
	}
	
	public int personInsert2(PersonVo pVo) {
		Map<String, String> pMap = new HashMap<>();
		pMap.put("name", pVo.getName());
		pMap.put("hp", pVo.getHp());
		pMap.put("company", pVo.getCompany());
		
		//int count = pDao.personInsert2(pMap);
		int count = pDao.personInsert2(pMap);
		
		return count;
	}
	
	public int personDelete(int personId) {
		int count = pDao.personDelete(personId);
		return count;
	}
	
	public int personUpdate(PersonVo pVo) {
		int count = pDao.personUpdate(pVo);
		return count;
	}
	
	public List<PersonVo> personSelect(){
		List<PersonVo> pList = pDao.personSelect();
		return pList;
	}
	
	public PersonVo getPerson(int personId) {
		PersonVo pVo = pDao.getPerson(personId);
		return pVo;
	}
	
	public Map<String, Object> getPerson2(int personId) {
		Map<String, Object> pMap = pDao.getPerson2(personId);
		return pMap;
	}
}
