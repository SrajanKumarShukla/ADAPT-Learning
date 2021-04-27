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
	public Search() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Search(@NotEmpty(message = "departureAirport must not be empty") String departureAirport,
			@NotEmpty(message = "destinationAirport must not be empty") String destinationAirport) {
		super();
		this.departureAirport = departureAirport;
		this.destinationAirport = destinationAirport;
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
	@Override
	public String toString() {
		return "Search [departureAirport=" + departureAirport + ", destinationAirport=" + destinationAirport + "]";
	}

}
