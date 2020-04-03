package com.cris.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pos_details")
public class PosDetails {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="pos_key")
    private Integer posKey; 
	@Column(name="mid")
	private String mid;
	@Column(name="pos_tid")
	private String posTid;
	@Column(name="pos_mac")
	private String posMac;
	@Column(name="pos_make")
	private String posMake;
	@Column(name="pos_bank_code")
    private String posBankCode;
	@Column(name="valid_status")
	private Integer validStatus;
	@Column(name="service_provider_code")
	private String serviceProviderCode;
	@Column(name="updated_by")
	private String updatedBy;
	@Column(name="updated_on")
	private Date updatedOn;
	
	public Integer getPosKey() {
		return posKey;
	}
	public void setPosKey(Integer posKey) {
		this.posKey = posKey;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getPosTid() {
		return posTid;
	}
	public void setPosTid(String posTid) {
		this.posTid = posTid;
	}
	public String getPosMac() {
		return posMac;
	}
	public void setPosMac(String posMac) {
		this.posMac = posMac;
	}
	public String getPosMake() {
		return posMake;
	}
	public void setPosMake(String posMake) {
		this.posMake = posMake;
	}
	public String getPosBankCode() {
		return posBankCode;
	}
	public void setPosBankCode(String posBankCode) {
		this.posBankCode = posBankCode;
	}
	public Integer getValidStatus() {
		return validStatus;
	}
	public void setValidStatus(Integer validStatus) {
		this.validStatus = validStatus;
	}
	public String getServiceProviderCode() {
		return serviceProviderCode;
	}
	public void setServiceProviderCode(String serviceProviderCode) {
		this.serviceProviderCode = serviceProviderCode;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	@Override
	public String toString() {
		return "PosDetails [posKey=" + posKey + ", mid=" + mid + ", posTid=" + posTid + ", posMac=" + posMac
				+ ", posMake=" + posMake + ", posBankCode=" + posBankCode + ", validStatus=" + validStatus
				+ ", serviceProviderCode=" + serviceProviderCode + ", updatedBy=" + updatedBy + "]";
	}
	public PosDetails() {}
	public PosDetails(Integer posKey, String mid, String posTid, String posMac, String posMake, String posBankCode,
			Integer validStatus, String serviceProviderCode, String updatedBy, Date updatedOn) {
		super();
		this.posKey = posKey;
		this.mid = mid;
		this.posTid = posTid;
		this.posMac = posMac;
		this.posMake = posMake;
		this.posBankCode = posBankCode;
		this.validStatus = validStatus;
		this.serviceProviderCode = serviceProviderCode;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
	}
	
}