package com.cris.model;

import java.time.LocalDate;
import java.util.Date;

public class ParameterJoinLocation {
	
	private Integer terminalParameterUid;
   	private Integer terminalId;
	private Integer appId;
	private String name;
	private String value;
	private String description;
	private Integer validStatus;
	private LocalDate validUpto;
	private LocalDate validFrom;
	private Integer serialNumber;
	private String updatedBy;
	private LocalDate updatedOn;
	private Integer parameterId;
	
	private String locCode;
	private String locName;
	private Integer locType;
	private Integer divisionId;
	private Integer zoneId;
	private Integer stateIndex;
	private Date commisionDate;
	
	
	public Integer getTerminalParameterUid() {
		return terminalParameterUid;
	}
	public void setTerminalParameterUid(Integer terminalParameterUid) {
		this.terminalParameterUid = terminalParameterUid;
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
	public LocalDate getValidUpto() {
		return validUpto;
	}
	public void setValidUpto(LocalDate validUpto) {
		this.validUpto = validUpto;
	}
	public LocalDate getValidFrom() {
		return validFrom;
	}
	public void setValidFrom(LocalDate validFrom) {
		this.validFrom = validFrom;
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
	public LocalDate getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(LocalDate updatedOn) {
		this.updatedOn = updatedOn;
	}
	public Integer getParameterId() {
		return parameterId;
	}
	public void setParameterId(Integer parameterId) {
		this.parameterId = parameterId;
	}
	public String getLocCode() {
		return locCode;
	}
	public void setLocCode(String locCode) {
		this.locCode = locCode;
	}
	public String getLocName() {
		return locName;
	}
	public void setLocName(String locName) {
		this.locName = locName;
	}
	public Integer getLocType() {
		return locType;
	}
	public void setLocType(Integer locType) {
		this.locType = locType;
	}
	public Integer getDivisionId() {
		return divisionId;
	}
	public void setDivisionId(Integer divisionId) {
		this.divisionId = divisionId;
	}
	public Integer getZoneId() {
		return zoneId;
	}
	public void setZoneId(Integer zoneId) {
		this.zoneId = zoneId;
	}
	public Integer getStateIndex() {
		return stateIndex;
	}
	public void setStateIndex(Integer stateIndex) {
		this.stateIndex = stateIndex;
	}
	public Date getCommisionDate() {
		return commisionDate;
	}
	public void setCommisionDate(Date commisionDate) {
		this.commisionDate = commisionDate;
	}
	public ParameterJoinLocation(Integer terminalParameterUid, Integer terminalId, Integer appId, String name,
			String value, String description, Integer validStatus, LocalDate validUpto, LocalDate validFrom,
			Integer serialNumber, String updatedBy, LocalDate updatedOn, Integer parameterId, String locCode,
			String locName, Integer locType, Integer divisionId, Integer zoneId, Integer stateIndex,
			Date commisionDate) {
		super();
		this.terminalParameterUid = terminalParameterUid;
		this.terminalId = terminalId;
		this.appId = appId;
		this.name = name;
		this.value = value;
		this.description = description;
		this.validStatus = validStatus;
		this.validUpto = validUpto;
		this.validFrom = validFrom;
		this.serialNumber = serialNumber;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
		this.parameterId = parameterId;
		this.locCode = locCode;
		this.locName = locName;
		this.locType = locType;
		this.divisionId = divisionId;
		this.zoneId = zoneId;
		this.stateIndex = stateIndex;
		this.commisionDate = commisionDate;
	}
	@Override
	public String toString() {
		return "ParameterJoinLocation [terminalParameterUid=" + terminalParameterUid + ", terminalId=" + terminalId
				+ ", appId=" + appId + ", name=" + name + ", value=" + value + ", description=" + description
				+ ", validStatus=" + validStatus + ", validUpto=" + validUpto + ", validFrom=" + validFrom
				+ ", serialNumber=" + serialNumber + ", updatedBy=" + updatedBy + ", updatedOn=" + updatedOn
				+ ", parameterId=" + parameterId + ", locCode=" + locCode + ", locName=" + locName + ", locType="
				+ locType + ", divisionId=" + divisionId + ", zoneId=" + zoneId + ", stateIndex=" + stateIndex
				+ ", commisionDate=" + commisionDate + "]";
	}
	
	
}
