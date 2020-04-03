package com.cris.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "terminal_timing")
public class TerminalTiming {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="terminal_timing_uid")
		private Integer terminalTimingUid;
	    @Column(name="terminal_id")
	    private Integer terminalId;
		@Column(name="app_id")
		private Integer appId;
		@Column(name="usage_frequency_type")
		private String usageFrequencyType;
		@Column(name="usage_frequency_value")
		private String usageFrequencyValue;
		@Column(name="start_date")
		private Date startDate;
	    @Column(name="end_date")
		private Date endDate;
	    @Column(name="start_time")
		private String startTime;
	    @Column(name="end_time")
		private String endTime;
		public Integer getTerminalTimingUid() {
			return terminalTimingUid;
		}
		public void setTerminalTimingUid(Integer terminalTimingUid) {
			this.terminalTimingUid = terminalTimingUid;
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
		public TerminalTiming() {}
		public TerminalTiming(Integer terminalTimingUid, Integer terminalId, Integer appId, String usageFrequencyType,
				String usageFrequencyValue, Date startDate, Date endDate, String startTime, String endTime) {
			super();
			this.terminalTimingUid = terminalTimingUid;
			this.terminalId = terminalId;
			this.appId = appId;
			this.usageFrequencyType = usageFrequencyType;
			this.usageFrequencyValue = usageFrequencyValue;
			this.startDate = startDate;
			this.endDate = endDate;
			this.startTime = startTime;
			this.endTime = endTime;
		}
		@Override
		public String toString() {
			return "TerminalTiming [terminalTimingUid=" + terminalTimingUid + ", terminalId=" + terminalId + ", appId="
					+ appId + ", usageFrequencyType=" + usageFrequencyType + ", usageFrequencyValue="
					+ usageFrequencyValue + ", startDate=" + startDate + ", endDate=" + endDate + ", startTime="
					+ startTime + ", endTime=" + endTime + "]";
		}
	    
}
	   