package com.cris.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "state_master")
public class StateMaster implements Serializable  {
		
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="state_index")
		private Integer stateIndex;
		@Column(name="state_code")
		private String stateCode;
		@Column(name="state_name")
		private String stateName;
		@Column(name="state_category")
		private String stateCategory;
		@Column(name="state_tin")
		private Integer stateTin;		
		@Column(name="state_gstin")
		private String stateGstin;
	    @Column(name="principal_office_zone_id")
		private Integer principalOfficeZoneId;
	    @Column(name="ir_principal_office_address")
		private String irPrincipalOfficeAddress;
	    
	    
	    public StateMaster() {}
		public Integer getStateIndex() {
			return stateIndex;
		}
		public void setStateIndex(Integer stateIndex) {
			this.stateIndex = stateIndex;
		}
		public String getStateCode() {
			return stateCode;
		}
		public void setStateCode(String stateCode) {
			this.stateCode = stateCode;
		}
		public String getStateName() {
			return stateName;
		}
		public void setStateName(String stateName) {
			this.stateName = stateName;
		}
		public String getStateCategory() {
			return stateCategory;
		}
		public void setStateCategory(String stateCategory) {
			this.stateCategory = stateCategory;
		}
		public Integer getStateTin() {
			return stateTin;
		}
		public void setStateTin(Integer stateTin) {
			this.stateTin = stateTin;
		}
		public String getStateGstin() {
			return stateGstin;
		}
		public void setStateGstin(String stateGstin) {
			this.stateGstin = stateGstin;
		}
		public Integer getPrincipalOfficeZoneId() {
			return principalOfficeZoneId;
		}
		public void setPrincipalOfficeZoneId(Integer principalOfficeZoneId) {
			this.principalOfficeZoneId = principalOfficeZoneId;
		}
		public String getIrPrincipalOfficeAddress() {
			return irPrincipalOfficeAddress;
		}
		public void setIrPrincipalOfficeAddress(String irPrincipalOfficeAddress) {
			this.irPrincipalOfficeAddress = irPrincipalOfficeAddress;
		}
		public StateMaster(Integer stateIndex, String stateCode, String stateName, String stateCategory,
				Integer stateTin, String stateGstin, Integer principalOfficeZoneId, String irPrincipalOfficeAddress) {
			super();
			this.stateIndex = stateIndex;
			this.stateCode = stateCode;
			this.stateName = stateName;
			this.stateCategory = stateCategory;
			this.stateTin = stateTin;
			this.stateGstin = stateGstin;
			this.principalOfficeZoneId = principalOfficeZoneId;
			this.irPrincipalOfficeAddress = irPrincipalOfficeAddress;
		}
		@Override
		public String toString() {
			return "StateMaster [stateIndex=" + stateIndex + ", stateCode=" + stateCode + ", stateName=" + stateName
					+ ", stateCategory=" + stateCategory + ", stateTin=" + stateTin + ", stateGstin=" + stateGstin
					+ ", principalOfficeZoneId=" + principalOfficeZoneId + ", irPrincipalOfficeAddress="
					+ irPrincipalOfficeAddress + "]";
		}}
	    
		