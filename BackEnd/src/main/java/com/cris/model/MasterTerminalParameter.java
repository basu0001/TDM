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
@Table(name = "master_terminal_parameter")
public class MasterTerminalParameter implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="terminal_parameter_uid")
	private Integer terminalParameterUid;
    @Column(name="app_id")
	private Integer appId;
    @Column(name="param_type")
    private String paramType;
    @Column(name="name")
	private String name;
	@Column(name="value")
	private String value;
	@Column(name="description")
	private String description;
	@Column(name="valid_status")
	private Integer validStatus;
	@Column(name="valid_from")
	private Date validFrom;
	@Column(name="valid_upto")
	private Date validUpto;
	@Column(name="serial_number")
	private Integer serialNumber;
	@Column(name="updated_by")
	private String updatedBy;
	@Column(name="updated_on")
	private Date updatedOn;
	
	public Integer getTerminalParameterUid() {
		return terminalParameterUid;
	}
	public void setTerminalParameterUid(Integer terminalParameterUid) {
		this.terminalParameterUid = terminalParameterUid;
	}
	public Integer getAppId() {
		return appId;
	}
	public void setAppId(Integer appId) {
		this.appId = appId;
	}
	public String getParamType() {
		return paramType;
	}
	public void setParamType(String paramType) {
		this.paramType = paramType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public Integer getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
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
	public MasterTerminalParameter() {}
	public MasterTerminalParameter(Integer terminalParameterUid, Integer appId, String paramType, String name,
			String value, String description, Integer validStatus, Date validFrom, Date validUpto, Integer serialNumber,
			String updatedBy, Date updatedOn) {
		super();
		this.terminalParameterUid = terminalParameterUid;
		this.appId = appId;
		this.paramType = paramType;
		this.name = name;
		this.value = value;
		this.description = description;
		this.validStatus = validStatus;
		this.validFrom = validFrom;
		this.validUpto = validUpto;
		this.serialNumber = serialNumber;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
	}
	@Override
	public String toString() {
		return "MasterTerminalParameter [terminalParameterUid=" + terminalParameterUid + ", appId=" + appId
				+ ", paramType=" + paramType + ", name=" + name + ", value=" + value + ", description=" + description
				+ ", validStatus=" + validStatus + ", validFrom=" + validFrom + ", validUpto=" + validUpto
				+ ", serialNumber=" + serialNumber + ", updatedBy=" + updatedBy + ", updatedOn=" + updatedOn + "]";
	}
	
	
    

}
