package com.cris.model;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "terminal")
public class Terminal implements Serializable  {
		
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="terminal_id")
		private Integer terminalId;
		@Column(name="terminal_code")
		private String terminalCode;
		@Column(name="location_id")
		private Integer locationId;
		@Column(name="trml_srv_number")
		private Integer trmlSrvNumber;
		@Column(name="window_number")
		private Integer windowNumber;		
	    @Column(name="valid_status")
		private Integer validStatus;
	    @Column(name="admin_id")
		private String adminId;
	    @Column(name="terminal_ip")
		private String terminalIp;
	    @Column(name="trml_srv_type")
		private String trmlSrvType;
		@Column(name="updated_by")
		private String updatedBy;
		@Column(name="commission_date")
		private Date commissionDate;
		@Column(name="updated_on")
		private Date updatedOn;
		public Integer getTerminalId() {
			return terminalId;
		}
		public void setTerminalId(Integer terminalId) {
			this.terminalId = terminalId;
		}
		public String getTerminalCode() {
			return terminalCode;
		}
		public void setTerminalCode(String terminalCode) {
			this.terminalCode = terminalCode;
		}
		public Integer getLocationId() {
			return locationId;
		}
		public void setLocationId(Integer locationId) {
			this.locationId = locationId;
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
		public Integer getValidStatus() {
			return validStatus;
		}
		public void setValidStatus(Integer validStatus) {
			this.validStatus = validStatus;
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
		public String getUpdatedBy() {
			return updatedBy;
		}
		public void setUpdatedBy(String updatedBy) {
			this.updatedBy = updatedBy;
		}
		public Date getCommissionDate() {
			return commissionDate;
		}
		public void setCommissionDate(Date commissionDate) {
			this.commissionDate = commissionDate;
		}
		public Date getUpdatedOn() {
			return updatedOn;
		}
		public void setUpdatedOn(Date updatedOn) {
			this.updatedOn = updatedOn;
		}
		@Override
		public String toString() {
			return "Terminal [terminalId=" + terminalId + ", terminalCode=" + terminalCode + ", locationId="
					+ locationId + ", trmlSrvNumber=" + trmlSrvNumber + ", windowNumber=" + windowNumber
					+ ", validStatus=" + validStatus + ", adminId=" + adminId + ", terminalIp=" + terminalIp
					+ ", trmlSrvType=" + trmlSrvType + ", updatedBy=" + updatedBy + ", commissionDate=" + commissionDate
					+ ", updatedOn=" + updatedOn + "]";
		}
		public Terminal(){}
		public Terminal(Integer terminalId, String terminalCode, Integer locationId, Integer trmlSrvNumber,
				Integer windowNumber, Integer validStatus, String adminId, String terminalIp, String trmlSrvType,
				String updatedBy, Date commissionDate, Date updatedOn) {
			super();
			this.terminalId = terminalId;
			this.terminalCode = terminalCode;
			this.locationId = locationId;
			this.trmlSrvNumber = trmlSrvNumber;
			this.windowNumber = windowNumber;
			this.validStatus = validStatus;
			this.adminId = adminId;
			this.terminalIp = terminalIp;
			this.trmlSrvType = trmlSrvType;
			this.updatedBy = updatedBy;
			this.commissionDate = commissionDate;
			this.updatedOn = updatedOn;
		}
		
		
		
}