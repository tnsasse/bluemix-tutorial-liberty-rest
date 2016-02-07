package com.blueair.rest;

public class Flight {

	private final String flightNo;
	private float latitude;
	private float longitude;
	private Long timestamp;
	private String status;
	
	public Flight(String number, float latitude, float longitude, long timestamp, String status) {
		this.flightNo = number;
		this.latitude = latitude;
		this.longitude = longitude;
		this.timestamp = timestamp;
		this.status = status;
	}
	
	public String getNumber() {
		return flightNo;
	}
	
	public Float getLatitude() {
		return latitude;
	}
	
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	
	public float getLongitude() {
		return longitude;
	}
	
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	
	public Long getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	 
}
