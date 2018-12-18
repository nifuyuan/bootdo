package com.bootdo.marketing.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.marketing.domain.OpportunityDO;
import com.bootdo.marketing.service.OpportunityService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-12-17 11:03:08
 */
 
@Controller
@RequestMapping("/marketing/opportunity")
public class OpportunityController {
	@Autowired
	private OpportunityService opportunityService;
	
	@GetMapping()
	@RequiresPermissions("marketing:opportunity:opportunity")
	String Opportunity(){
	    return "marketing/opportunity/opportunity";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("marketing:opportunity:opportunity")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<OpportunityDO> opportunityList = opportunityService.list(query);
		int total = opportunityService.count(query);
		PageUtils pageUtils = new PageUtils(opportunityList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("marketing:opportunity:add")
	String add(){
	    return "marketing/opportunity/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("marketing:opportunity:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		OpportunityDO opportunity = opportunityService.get(id);
		model.addAttribute("opportunity", opportunity);
	    return "marketing/opportunity/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("marketing:opportunity:add")
	public R save( OpportunityDO opportunity){
		if(opportunityService.save(opportunity)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("marketing:opportunity:edit")
	public R update( OpportunityDO opportunity){
		opportunityService.update(opportunity);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("marketing:opportunity:remove")
	public R remove( Integer id){
		if(opportunityService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("marketing:opportunity:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		opportunityService.batchRemove(ids);
		return R.ok();
	}
	
}
