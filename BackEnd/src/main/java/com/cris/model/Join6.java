package com.cris.model;
import java.util.Date;

public class Join6 {
	
	//pos trml details
	private Integer posTrmlUid;
	private Integer terminalId;
	private Integer terminalTypeId;
	private Integer locationId;
	private Date validFrom;
    private Date validUpto;
	private Integer validStatus;
	private String updatedBy;
	private Date updatedOn;
	
	//pos details
	
	private Integer posKey;
	private String mid;
	private String posTid;
	private String posMac;
	private String posMake;
    private String posBankCode;
	private String serviceProviderCode;
	
	//terminal
	
	private String terminalCode;
	private Integer trmlSrvNumber;
	private Integer windowNumber;		
	private String adminId;
	private String terminalIp;
	private String trmlSrvType;
	private Date commissionDate;
	
	//terminal timing
	private Integer terminalTimingUid;
	private Integer appId;
	private String usageFrequencyType;
	private String usageFrequencyValue;
	private Date startDate;
	private Date endDate;
	private String startTime;
	private String endTime;
	
	//trml app loc param
	
	private Integer trmlAppLocParamUid;
	private Integer terminalParameterUid;
	
	
	//master terminal param
	
    private String paramType;
	private String name;
	private String value;
	private String description;
	private Integer serialNumber;
	
	public Integer getPosTrmlUid() {
		return posTrmlUid;
	}
	public void setPosTrmlUid(Integer posTrmlUid) {
		this.posTrmlUid = posTrmlUid;
	}
	public Integer getTerminalId() {
		return terminalId;
	}
	public void setTerminalId(Integer terminalId) {
		this.terminalId = terminalId;
	}
	public Integer getTerminalTypeId() {
		return terminalTypeId;
	}
	public void setTerminalTypeId(Integer terminalTypeId) {
		this.terminalTypeId = terminalTypeId;
	}
	public Integer getLocationId() {
		return locationId;
	}
	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
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
	public Integer getValidStatus() {
		return validStatus;
	}
	public void setValidStatus(Integer validStatus) {
		this.validStatus = validStatus;
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
	public String getServiceProviderCode() {
		return serviceProviderCode;
	}
	public void setServiceProviderCode(String serviceProviderCode) {
		this.serviceProviderCode = serviceProviderCode;
	}
	public String getTerminalCode() {
		return terminalCode;
	}
	public void setTerminalCode(String terminalCode) {
		this.terminalCode = terminalCode;
	}
	public Integer getTrmlSrvNumber() {
		return trmlSrvNumber;
	}
	public void setTrmlSrvNumber(Integer trmlSrvNumber) {
		this.trmlSrvNumber = trmlSrvNumber;
	}
	public Integer getWindowNumber() {
		return windowNumber;
	}
	public void setWindowNumber(Integer windowNumber) {
		this.windowNumber = windowNumber;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getTerminalIp() {
		return terminalIp;
	}
	public void setTerminalIp(String terminalIp) {
		this.terminalIp = terminalIp;
	}
	public String getTrmlSrvType() {
		return trmlSrvType;
	}
	public void setTrmlSrvType(String trmlSrvType) {
		this.trmlSrvType = trmlSrvType;
	}
	public Date getCommissionDate() {
		return commissionDate;
	}
	public void setComissionDate(Date commissionDate) {
		this.commissionDate = commissionDate;
	}
	public Integer getTerminalTimingUid() {
		return terminalTimingUid;
	}
	public void setTerminalTimingUid(Integer terminalTimingUid) {
		this.terminalTimingUid = terminalTimingUid;
	}
	public Integer getAppId() {
		return appId;
	}
	public void setAppId(Integer appId) {
		this.appId = appId;
	}
	public String getUsageFrequencyType() {
		return usageFrequencyType;
	}
	public void setUsageFrequencyType(String usageFrequencyType) {
		this.usageFrequencyType = usageFrequencyType;
	}
	public String getUsageFrequencyValue() {
		return usageFrequencyValue;
	}
	public void setUsageFrequencyValue(String usageFrequencyValue) {
		this.usageFrequencyValue = usageFrequencyValue;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public Integer getTrmlAppLocParamUid() {
		return trmlAppLocParamUid;
	}
	public void setTrmlAppLocParamUid(Integer trmlAppLocParamUid) {
		this.trmlAppLocParamUid = trmlAppLocParamUid;
	}
	public Integer getTerminalParameterUid() {
		return terminalParameterUid;
	}
	public void setTerminalParameterUid(Integer terminalParameterUid) {
		this.terminalParameterUid = terminalParameterUid;
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
	public Integer getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	
		public Join6(Integer posTrmlUid, Integer terminalId, Integer terminalTypeId, Integer locationId, Date validFrom,
			Date validUpto, Integer validStatus, String updatedBy, Date updatedOn, Integer posKey, String mid, String posTid,
			String posMac, String posMake, String posBankCode, String serviceProviderCode, String terminalCode,
			Integer trmlSrvNumber, Integer windowNumber, String adminId, String terminalIp, String trmlSrvType, Date commissionDate,
			Integer terminalTimingUid, Integer appId, String usageFrequencyType, String usageFrequencyValue,
			Date startDate, Date endDate, String startTime, String endTime, Integer trmlAppLocParamUid,
			Integer terminalParameterUid, String paramType, String name, String value, String description,
			Integer serialNumber) {
		super();
		this.posTrmlUid = posTrmlUid;
		this.terminalId = terminalId;
		this.terminalTypeId = terminalTypeId;
		this.locationId = locationId;
		this.validFrom = validFrom;
		this.validUpto = validUpto;
		this.validStatus = validStatus;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
		this.posKey = posKey;
		this.mid = mid;
		this.posTid = posTid;
		this.posMac = posMac;
		this.posMake = posMake;
		this.posBankCode = posBankCode;
		this.serviceProviderCode = serviceProviderCode;
		this.terminalCode = terminalCode;
		this.trmlSrvNumber = trmlSrvNumber;
		this.windowNumber = windowNumber;
		this.adminId = adminId;
		this.terminalIp = terminalIp;
		this.trmlSrvType = trmlSrvType;
		this.commissionDate = commissionDate;
		this.terminalTimingUid = terminalTimingUid;
		this.appId = appId;
		this.usageFrequencyType = usageFrequencyType;
		this.usageFrequencyValue = usageFrequencyValue;
		this.startDate = startDate;
		this.endDate = endDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.trmlAppLocParamUid = trmlAppLocParamUid;
		this.terminalParameterUid = terminalParameterUid;
		this.paramType = paramType;
		this.name = name;
		this.value = value;
		this.description = description;
		this.serialNumber = serialNumber;
	}
	@Override
	public String toString() {
		return "Join6 [posTrmlUid=" + posTrmlUid + ", terminalId=" + terminalId + ", terminalTypeId=" + terminalTypeId
				+ ", locationId=" + locationId + ", validFrom=" + validFrom + ", validUpto=" + validUpto
				+ ", validStatus=" + validStatus + ", updatedBy=" + updatedBy + ", updatedOn=" + updatedOn + " posKey=" + posKey + ", mid="
				+ mid + ", posTid=" + posTid + ", posMac=" + posMac + ", posMake=" + posMake + ", posBankCode="
				+ posBankCode + ", serviceProviderCode=" + serviceProviderCode + ", terminalCode=" + terminalCode
				+ ", trmlSrvNumber=" + trmlSrvNumber + ", windowNumber=" + windowNumber + ", adminId=" + adminId
				+ ", terminalIp=" + terminalIp + ", trmlSrvType=" + trmlSrvType + " commissionDate =" + commissionDate + ", terminalTimingUid="
				+ terminalTimingUid + ", appId=" + appId + ", usageFrequencyType=" + usageFrequencyType
				+ ", usageFrequencyValue=" + usageFrequencyValue + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", startTime=" + startTime + ", endTime=" + endTime + ", trmlAppLocParamUid=" + trmlAppLocParamUid
				+ ", terminalParameterUid=" + terminalParameterUid + ", paramType=" + paramType + ", name=" + name
				+ ", value=" + value + ", description=" + description + ", serialNumber=" + serialNumber + "]";
	}
}
	