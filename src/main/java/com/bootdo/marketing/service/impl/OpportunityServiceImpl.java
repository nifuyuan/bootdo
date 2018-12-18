package com.bootdo.marketing.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.marketing.dao.OpportunityDao;
import com.bootdo.marketing.domain.OpportunityDO;
import com.bootdo.marketing.service.OpportunityService;



@Service
public class OpportunityServiceImpl implements OpportunityService {
	@Autowired
	private OpportunityDao opportunityDao;
	
	@Override
	public OpportunityDO get(Integer id){
		return opportunityDao.get(id);
	}
	
	@Override
	public List<OpportunityDO> list(Map<String, Object> map){
		return opportunityDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return opportunityDao.count(map);
	}
	
	@Override
	public int save(OpportunityDO opportunity){
		return opportunityDao.save(opportunity);
	}
	
	@Override
	public int update(OpportunityDO opportunity){
		return opportunityDao.update(opportunity);
	}
	
	@Override
	public int remove(Integer id){
		return opportunityDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return opportunityDao.batchRemove(ids);
	}
	
}
