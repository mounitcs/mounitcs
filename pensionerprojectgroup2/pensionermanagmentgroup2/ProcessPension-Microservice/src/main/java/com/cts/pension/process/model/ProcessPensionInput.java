package com.cts.pension.process.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data

@EqualsAndHashCode
public class ProcessPensionInput {

	private long aadharNumber;
	private double pesionAmount;
	private double bankCharge;
	public ProcessPensionInput(long aadharNumber, double pesionAmount, double bankCharge) {
		super();
		this.aadharNumber = aadharNumber;
		this.pesionAmount = pesionAmount;
		this.bankCharge = bankCharge;
	}
	public long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public double getPesionAmount() {
		return pesionAmount;
	}
	public void setPesionAmount(double pesionAmount) {
		this.pesionAmount = pesionAmount;
	}
	public double getBankCharge() {
		return bankCharge;
	}
	public void setBankCharge(double bankCharge) {
		this.bankCharge = bankCharge;
	}
	
	
	
}
