package com.cg.casestudy.flightmanagement.model;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Search {

	@NotEmpty(message = "departureAirport must not be empty")
	private String departureAirport;
	@NotEmpty(message = "destinationAirport must not be empty")
	private String destinationAirport;
	@NotEmpty(message = "departureDate must not be empty")
	private String departureDate;
	public Search() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Search(@NotEmpty(message = "departureAirport must not be empty") String departureAirport,
			@NotEmpty(message = "destinationAirport must not be empty") String destinationAirport,
			@NotEmpty(message = "departureDate must not be empty") String departureDate) {
		super();
		this.departureAirport = departureAirport;
		this.destinationAirport = destinationAirport;
		this.departureDate = departureDate;
	}
	public String getDepartureAirport() {
		return departureAirport;
	}
	public void setDepartureAirport(String departureAirport) {
		this.departureAirport = departureAirport;
	}
	public String getDestinationAirport() {
		return destinationAirport;
	}
	public void setDestinationAirport(String destinationAirport) {
		this.destinationAirport = destinationAirport;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	@Override
	public String toString() {
		return "Search [departureAirport=" + departureAirport + ", destinationAirport=" + destinationAirport
				+ ", departureDate=" + departureDate + "]";
	}
	
}
