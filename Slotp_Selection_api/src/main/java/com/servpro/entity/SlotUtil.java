package com.servpro.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="Slot")
public class SlotUtil {
    
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="srNo")
	private int sId;
	
	@Column(name="userId",nullable = false,updatable = false,length=50,columnDefinition="varchar(60) default 'admin'")
	private String userId="admin";
	
	@Column(name="orgId",nullable = false, columnDefinition="INT NOT NULL DEFAULT 1")
	private int orgId=1;
	
	@Column(name="sName",length=50)
	private String slotName;
	
	@Column(name="sTiming",length=50)
	private String slotTiming;
	
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date lastModifiedDate;
	
	@Column(name="sStatus")
	private boolean slotStatus;
	
	
	
	public int getSrNo() {
		return sId;
	}
	public void setSrNo(int srNo) {
		this.sId = srNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getOrgId() {
		return orgId;
	}
	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}
	public String getSlotName() {
		return slotName;
	}
	public void setSlotName(String slotName) {
		this.slotName = slotName;
	}
	public String getSlotTiming() {
		return slotTiming;
	}
	public void setSlotTiming(String slotTiming) {
		this.slotTiming = slotTiming;
	}
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	public boolean isSlotStatus() {
		return slotStatus;
	}
	public void setSlotStatus(boolean slotStatus) {
		this.slotStatus = slotStatus;
	}
	

}
