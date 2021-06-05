package com.cg.casestudy.faremanagement.model;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Flight {

	@Id
	@NotEmpty(message = "flightId must not be empty")
	private String id;
	@Valid
	private Airline airline;
	@Valid
	private Airport departureAirport;
	@Valid
	private Airport destinationAirport;
	private String departureDate;
	private String arrivalDate;
	private String departureTime;
	private String arrivalTime;
	private Fare fare;
	@NotNull(message = "seats must not be empty")
	private Integer seats;
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Flight(@NotEmpty(message = "flightId must not be empty") String id, @Valid Airline airline,
			@Valid Airport departureAirport, @Valid Airport destinationAirport, String departureDate,
			String arrivalDate, String departureTime, String arrivalTime, Fare fare,
			@NotNull(message = "seats must not be empty") Integer seats) {
		super();
		this.id = id;
		this.airline = airline;
		this.departureAirport = departureAirport;
		this.destinationAirport = destinationAirport;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.fare = fare;
		this.seats = seats;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Airline getAirline() {
		return airline;
	}
	public void setAirline(Airline airline) {
		this.airline = airline;
	}
	public Airport getDepartureAirport() {
		return departureAirport;
	}
	public void setDepartureAirport(Airport departureAirport) {
		this.departureAirport = departureAirport;
	}
	public Airport getDestinationAirport() {
		return destinationAirport;
	}
	public void setDestinationAirport(Airport destinationAirport) {
		this.destinationAirport = destinationAirport;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public Fare getFare() {
		return fare;
	}
	public void setFare(Fare fare) {
		this.fare = fare;
	}
	public Integer getSeats() {
		return seats;
	}
	public void setSeats(Integer seats) {
		this.seats = seats;
	}
	@Override
	public String toString() {
		return "Flight [id=" + id + ", airline=" + airline + ", departureAirport=" + departureAirport
				+ ", destinationAirport=" + destinationAirport + ", departureDate=" + departureDate + ", arrivalDate="
				+ arrivalDate + ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime + ", fare=" + fare
				+ ", seats=" + seats + "]";
	}

}
