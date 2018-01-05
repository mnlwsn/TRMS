package com.revature.beans;


import java.sql.Timestamp;

public class Event {
	private Integer empid;
	private Integer formid;
	private String status;
	private String type;
	private String location;
	private String description;
	private Double cost;
	private Timestamp submitted;
	private Timestamp occur;
	private Timestamp timeStart;
	private String justification;
	private String gradeFormat;
	private String gradeCutOff;
	private String gradeReceived;
	private Integer workHrMissed;

	public Event() {
		super();
	}

	public Event(Integer empid, String type, String location, String description, Double cost, Timestamp occur, Timestamp timeStart,
			String justification, String gradeFormat, String gradeCutOff) {
		this.empid = empid;
		this.type = type;
		this.location = location;
		this.description = description;
		this.cost = cost;
		this.occur = occur;
		this.timeStart = timeStart;
		this.justification = justification;
		this.gradeFormat = gradeFormat;
		this.gradeCutOff = gradeCutOff;
	}

	public String getGradeReceived() {
		return gradeReceived;
	}

	public void setGradeReceived(String gradeReceived) {
		this.gradeReceived = gradeReceived;
	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public Integer getFormid() {
		return formid;
	}

	public void setFormid(Integer formid) {
		this.formid = formid;
	}

	public String getJustification() {
		return justification;
	}

	public void setJustification(String justification) {
		this.justification = justification;
	}

	public Integer getWorkHrMissed() {
		return workHrMissed;
	}

	public void setWorkHrMissed(Integer workHrMissed) {
		this.workHrMissed = workHrMissed;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGradeFormat() {
		return gradeFormat;
	}

	public void setGradeFormat(String gradeFormat) {
		this.gradeFormat = gradeFormat;
	}

	public String getGradeCutOff() {
		return gradeCutOff;
	}

	public void setGradeCutOff(String gradeCutOff) {
		this.gradeCutOff = gradeCutOff;
	}

	public Timestamp getSubmitted() {
		return submitted;
	}

	public void setSubmitted(Timestamp submitted) {
		this.submitted = submitted;
	}

	public Timestamp getOccur() {
		return occur;
	}

	public void setOccur(Timestamp occur) {
		this.occur = occur;
	}

	public Timestamp getTimeStart() {
		return timeStart;
	}

	public void setTimeStart(Timestamp timeStart) {
		this.timeStart = timeStart;
	}

}
