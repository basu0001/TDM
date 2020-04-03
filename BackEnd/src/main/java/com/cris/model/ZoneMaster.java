package com.cris.model;
import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "zone_master")
public class ZoneMaster implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="zone_id")
    private Integer zoneId;
	@Column(name="zone_name")
	private String zoneName;
	@Column(name="valid_status")
	private Integer validStatus;
	@Column(name="updated_by")
	private String updatedBy;
	@Column(name="updated_on")
	private Date updatedOn;
	@Column(name="zone_code")
	private String zoneCode;
	
	public Integer getZoneId() {
		return zoneId;
	}
	public void setZoneId(Integer zoneId) {
		this.zoneId = zoneId;
	}
	public String getZoneName() {
		return zoneName;
	}
	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
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
	public String getZoneCode() {
		return zoneCode;
	}
	public void setZoneCode(String zoneCode) {
		this.zoneCode = zoneCode;
	}
	public ZoneMaster() {}
	public ZoneMaster(Integer zoneId, String zoneName, Integer validStatus, String updatedBy, Date updatedOn,
			String zoneCode) {
		super();
		this.zoneId = zoneId;
		this.zoneName = zoneName;
		this.validStatus = validStatus;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
		this.zoneCode = zoneCode;
	}
	@Override
	public String toString() {
		return "ZoneMaster [zoneId=" + zoneId + ", zoneName=" + zoneName + ", validStatus=" + validStatus
				+ ", updatedBy=" + updatedBy + ", updatedOn=" + updatedOn + ", zoneCode=" + zoneCode + "]";
	}
	
	
}
