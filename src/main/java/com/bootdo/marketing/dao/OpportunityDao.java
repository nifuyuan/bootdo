package com.bootdo.marketing.dao;

import com.bootdo.marketing.domain.OpportunityDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-12-17 11:03:08
 */
@Mapper
public interface OpportunityDao {

	OpportunityDO get(Integer id);
	
	List<OpportunityDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(OpportunityDO opportunity);
	
	int update(OpportunityDO opportunity);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
