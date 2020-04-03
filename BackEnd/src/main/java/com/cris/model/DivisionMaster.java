package com.cris.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "division_master")
public class DivisionMaster {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="division_id")
	private Integer divisionId;
	@Column(name="division_name")
	private String divisionName;
	@Column(name="valid_status")
	private Integer validStatus;
	@Column(name="updated_by")
	private String updatedBy;
	@Column(name="updated_on")
	private Date updatedOn;
	@Column(name="division_code")
	private String divisionCode;
	
	public Integer getDivisionId() {
		return divisionId;
	}
	public void setDivisionId(Integer divisionId) {
		this.divisionId = divisionId;
	}
	public String getDivisionName() {
		return divisionName;
	}
	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
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
	public String getDivisionCode() {
		return divisionCode;
	}
	public void setDivisionCode(String divisionCode) {
		this.divisionCode = divisionCode;
	}
	@Override
	public String toString() {
		return "DivisionMaster [divisionId=" + divisionId + ", divisionName=" + divisionName + ", validStatus="
				+ validStatus + ", updatedBy=" + updatedBy + ", updatedOn=" + updatedOn + ", divisionCode="
				+ divisionCode + "]";
	}
	public DivisionMaster() {}
	public DivisionMaster(Integer divisionId, String divisionName, Integer validStatus, String updatedBy,
			Date updatedOn, String divisionCode) {
		super();
		this.divisionId = divisionId;
		this.divisionName = divisionName;
		this.validStatus = validStatus;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
		this.divisionCode = divisionCode;
	}
	

	

}
