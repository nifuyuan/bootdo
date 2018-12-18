package com.bootdo.marketing.service;

import com.bootdo.marketing.domain.OpportunityDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-12-17 11:03:08
 */
public interface OpportunityService {
	
	OpportunityDO get(Integer id);
	
	List<OpportunityDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(OpportunityDO opportunity);
	
	int update(OpportunityDO opportunity);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
