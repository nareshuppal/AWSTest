package com.saber.payment.flight;

public class SaberFlight {
	
	public SaberFlight(String fligtNumber, String flightOrigin)
	{
		this.flightOrigin=flightOrigin;
		this.fligtNumber=fligtNumber;
	}
	//This is domain object
	
	private String fligtNumber;
	public String getFligtNumber() {
		return fligtNumber;
	}
	public void setFligtNumber(String fligtNumber) {
		this.fligtNumber = fligtNumber;
	}
	public String getFlightOrigin() {
		return flightOrigin;
	}
	public void setFlightOrigin(String flightOrigin) {
		this.flightOrigin = flightOrigin;
	}
	private String flightOrigin;

}
