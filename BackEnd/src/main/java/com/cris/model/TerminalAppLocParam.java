package com.cris.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "terminal_app_loc_param")
public class TerminalAppLocParam implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="trml_app_loc_param_uid")
	private Integer trmlAppLocParamUid;
	@Column(name="terminal_id")
	private Integer terminalId;
	@Column(name="app_id")
	private Integer appId;
	@Column(name="location_id")
    private Integer locationId;
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="terminal_parameter_uid")
	private Integer terminalParameterUid;
	@Column(name="valid_status")
	private Integer validStatus;
	@Column(name="valid_from")
	private Date validFrom;
	@Column(name="valid_upto")
	private Date validUpto;
	@Column(name="updated_by")
	private String updatedBy;
	@Column(name="updated_on")
	private Date updatedOn;
	
	public Integer getTrmlAppLocParamUid() {
		return trmlAppLocParamUid;
	}
	public void setTrmlAppLocParamUid(Integer trmlAppLocParamUid) {
		this.trmlAppLocParamUid = trmlAppLocParamUid;
	}
	public Integer getTerminalId() {
		return terminalId;
	}
	public void setTerminalId(Integer terminalId) {
		this.terminalId = terminalId;
	}
	public Integer getAppId() {
		return appId;
	}
	public void setAppId(Integer appId) {
		this.appId = appId;
	}
	public Integer getLocationId() {
		return locationId;
	}
	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}
	public Integer getTerminalParameterUid() {
		return terminalParameterUid;
	}
	public void setTerminalParameterUid(Integer terminalParameterUid) {
		this.terminalParameterUid = terminalParameterUid;
	}
	public Integer getValidStatus() {
		return validStatus;
	}
	public void setValidStatus(Integer validStatus) {
		this.validStatus = validStatus;
	}
	public Date getValidFrom() {
		return validFrom;
	}
	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}
	public Date getValidUpto() {
		return validUpto;
	}
	public void setValidUpto(Date validUpto) {
		this.validUpto = validUpto;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public TerminalAppLocParam() {}
	public TerminalAppLocParam(Integer trmlAppLocParamUid, Integer terminalId, Integer appId, Integer locationId,
			Integer terminalParameterUid, Integer validStatus, Date validFrom, Date validUpto, String updatedBy,
			Date updatedOn) {
		super();
		this.trmlAppLocParamUid = trmlAppLocParamUid;
		this.terminalId = terminalId;
		this.appId = appId;
		this.locationId = locationId;
		this.terminalParameterUid = terminalParameterUid;
		this.validStatus = validStatus;
		this.validFrom = validFrom;
		this.validUpto = validUpto;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
	}
	@Override
	public String toString() {
		return "TerminalAppLocParam [trmlAppLocParamUid=" + trmlAppLocParamUid + ", terminalId=" + terminalId
				+ ", appId=" + appId + ", locationId=" + locationId + ", terminalParameterUid=" + terminalParameterUid
				+ ", validStatus=" + validStatus + ", validFrom=" + validFrom + ", validUpto=" + validUpto
				+ ", updatedBy=" + updatedBy + ", updatedOn=" + updatedOn + "]";
	}
	
	
	
	
}
