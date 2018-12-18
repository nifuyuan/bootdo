package com.bootdo.marketing.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-12-17 11:03:08
 */
public class OpportunityDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//
	private String source;
	//
	private String name;
	//
	private Integer probability;
	//
	private String summary;
	//
	private String contact;
	//
	private String tel;
	//
	private String opportunityDescribe;
	//
	private String creater;
	//
	private Date createTime;

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setSource(String source) {
		this.source = source;
	}
	/**
	 * 获取：
	 */
	public String getSource() {
		return source;
	}
	/**
	 * 设置：
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：
	 */
	public void setProbability(Integer probability) {
		this.probability = probability;
	}
	/**
	 * 获取：
	 */
	public Integer getProbability() {
		return probability;
	}
	/**
	 * 设置：
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}
	/**
	 * 获取：
	 */
	public String getSummary() {
		return summary;
	}
	/**
	 * 设置：
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}
	/**
	 * 获取：
	 */
	public String getContact() {
		return contact;
	}
	/**
	 * 设置：
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}
	/**
	 * 获取：
	 */
	public String getTel() {
		return tel;
	}
	/**
	 * 设置：
	 */
	public void setOpportunityDescribe(String opportunityDescribe) {
		this.opportunityDescribe = opportunityDescribe;
	}
	/**
	 * 获取：
	 */
	public String getOpportunityDescribe() {
		return opportunityDescribe;
	}
	/**
	 * 设置：
	 */
	public void setCreater(String creater) {
		this.creater = creater;
	}
	/**
	 * 获取：
	 */
	public String getCreater() {
		return creater;
	}
	/**
	 * 设置：
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：
	 */
	public Date getCreateTime() {
		return createTime;
	}
}
