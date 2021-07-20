package com.loan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "LOAN_APPLICATION")
public class LoanApplication {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="APPLICATION_ID")
	private Long applicationId;

	@Column(name="APPLICANT_Name")
	private String applicantName;
	
	@Column(name="PAN_NUMBER")
    private String panNumber;
	
	@Column(name="LOAN_TYPE")
	private String loanType;
	
	@Column(name="LOAN_AMOUNT")
	private String loanAmount;
	
	@Column(name="ADDRESS")
	private String address;

	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public LoanApplication() {
	
	}
	

	public LoanApplication(Long applicationId, String applicantName, String panNumber, String loanType,
			String loanAmount, String address) {
		super();
		this.applicationId = applicationId;
		this.applicantName = applicantName;
		this.panNumber = panNumber;
		this.loanType = loanType;
		this.loanAmount = loanAmount;
		this.address = address;
	}
	
	
	
}