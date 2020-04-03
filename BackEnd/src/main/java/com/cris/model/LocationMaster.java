package com.cris.model;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "location_master")
public class LocationMaster implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="location_id")
    private Integer locationId;
	@Column(name="loc_code")
	private String locCode;
	@Column(name="loc_name")
	private String locName;
	@Column(name="loc_type")
	private Integer locType;
	@Column(name="division_id")
	private Integer divisionId;
	@Column(name="zone_id")
	private Integer zoneId;
    @Column(name="state_index")
	private Integer stateIndex;
    @Column(name="commision_date")
	private Date commisionDate;
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
	
	public LocationMaster() {}

	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
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
	public LocationMaster(Integer locationId, String locCode, String locName, Integer locType, Integer divisionId,
			Integer zoneId, Integer stateIndex, Date commisionDate, Integer validStatus, Date validFrom, Date validUpto,
			String updatedBy, Date updatedOn) {
		super();
		this.locationId = locationId;
		this.locCode = locCode;
		this.locName = locName;
		this.locType = locType;
		this.divisionId = divisionId;
		this.zoneId = zoneId;
		this.stateIndex = stateIndex;
		this.commisionDate = commisionDate;
		this.validStatus = validStatus;
		this.validFrom = validFrom;
		this.validUpto = validUpto;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
	}

	@Override
	public String toString() {
		return "LocationMaster [locationId=" + locationId + ", locCode=" + locCode + ", locName=" + locName
				+ ", locType=" + locType + ", divisionId=" + divisionId + ", zoneId=" + zoneId + ", stateIndex="
				+ stateIndex + ", commisionDate=" + commisionDate + ", validStatus=" + validStatus + ", validFrom="
				+ validFrom + ", validUpto=" + validUpto + ", updatedBy=" + updatedBy + ", updatedOn=" + updatedOn
				+ "]";
	}
	
	
	
}
	