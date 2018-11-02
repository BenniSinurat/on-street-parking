package org.parking.api.services;

import java.io.Serializable;

public class TicketIDRequest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String jukirID;
	private String jukirName;
	private String locationID;
	private String locationName;
	private String driverMsisdn;
	private String driverName;
	private String vehicleType;
	private String vehicleBrand;
	private String vehicleLicensePlate;
	private String billingInvoiceID;
	private String billingAmount;
	private String billingStartDateTime;
	private String billingDuration;
	private String bankCode;
	private String correlationID;

	public String getJukirID() {
		return jukirID;
	}

	public void setJukirID(String jukirID) {
		this.jukirID = jukirID;
	}

	public String getJukirName() {
		return jukirName;
	}

	public void setJukirName(String jukirName) {
		this.jukirName = jukirName;
	}

	public String getLocationID() {
		return locationID;
	}

	public void setLocationID(String locationID) {
		this.locationID = locationID;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getDriverMsisdn() {
		return driverMsisdn;
	}

	public void setDriverMsisdn(String driverMsisdn) {
		this.driverMsisdn = driverMsisdn;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleBrand() {
		return vehicleBrand;
	}

	public void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}

	public String getVehicleLicensePlate() {
		return vehicleLicensePlate;
	}

	public void setVehicleLicensePlate(String vehicleLicensePlate) {
		this.vehicleLicensePlate = vehicleLicensePlate;
	}

	public String getBillingInvoiceID() {
		return billingInvoiceID;
	}

	public void setBillingInvoiceID(String billingInvoiceID) {
		this.billingInvoiceID = billingInvoiceID;
	}

	public String getBillingAmount() {
		return billingAmount;
	}

	public void setBillingAmount(String billingAmount) {
		this.billingAmount = billingAmount;
	}

	public String getBillingStartDateTime() {
		return billingStartDateTime;
	}

	public void setBillingStartDateTime(String billingStartDateTime) {
		this.billingStartDateTime = billingStartDateTime;
	}

	public String getBillingDuration() {
		return billingDuration;
	}

	public void setBillingDuration(String billingDuration) {
		this.billingDuration = billingDuration;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getCorrelationID() {
		return correlationID;
	}

	public void setCorrelationID(String correlationID) {
		this.correlationID = correlationID;
	}

}
