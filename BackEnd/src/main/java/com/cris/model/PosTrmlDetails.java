package com.cris.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "pos_trml_details")
public class PosTrmlDetails {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name="pos_trml_uid")
	    private Integer posTrmlUid; 
		@Column(name="pos_key")
		private Integer posKey;
		@Column(name="terminal_id")
		private Integer terminalId;
		@Column(name="terminal_type_id")
		private Integer terminalTypeId;
		@Column(name="location_id")
		private Integer locationId;
		@Column(name="valid_from")
		private Date validFrom;
		@Column(name="valid_upto")
	    private Date validUpto;
		@Column(name="valid_status")
		private Integer validStatus;
		@Column(name="updated_by")
		private String updatedBy;
		@Column(name="updated_on")
		private Date updatedOn;
		public Integer getPosTrmlUid() {
			return posTrmlUid;
		}
		public void setPosTrmlUid(Integer posTrmlUid) {
			this.posTrmlUid = posTrmlUid;
		}
		public Integer getPosKey() {
			return posKey;
		}
		public void setPosKey(Integer posKey) {
			this.posKey = posKey;
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
		@Override
		public String toString() {
			return "PosTrmlDetails [posTrmlUid=" + posTrmlUid + ", posKey=" + posKey + ", terminalId=" + terminalId
					+ ", terminalTypeId=" + terminalTypeId + ", locationId=" + locationId + ", validFrom=" + validFrom
					+ ", validUpto=" + validUpto + ", validStatus=" + validStatus + ", updatedBy=" + updatedBy
					+ ", updatedOn=" + updatedOn + "]";
		}
		public PosTrmlDetails() {}
		public PosTrmlDetails(Integer posTrmlUid, Integer posKey, Integer terminalId, Integer terminalTypeId,
				Integer locationId, Date validFrom, Date validUpto, Integer validStatus, String updatedBy,
				Date updatedOn) {
			super();
			this.posTrmlUid = posTrmlUid;
			this.posKey = posKey;
			this.terminalId = terminalId;
			this.terminalTypeId = terminalTypeId;
			this.locationId = locationId;
			this.validFrom = validFrom;
			this.validUpto = validUpto;
			this.validStatus = validStatus;
			this.updatedBy = updatedBy;
			this.updatedOn = updatedOn;
		}
		
}