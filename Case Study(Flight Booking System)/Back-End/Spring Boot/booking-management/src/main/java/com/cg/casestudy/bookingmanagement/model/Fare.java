package com.cg.casestudy.bookingmanagement.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fare {

	@Id
	@NotEmpty(message = "fareId must not be empty")
	private String id;
	@NotEmpty(message = "flightName must not be empty")
	private String flightName;
	@NotNull(message = "flightFare must not be empty")
	private Integer flightFare;
	public Fare() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fare(@NotEmpty(message = "fareId must not be empty") String id,
			@NotEmpty(message = "flightName must not be empty") String flightName,
			@NotNull(message = "flightFare must not be empty") Integer flightFare) {
		super();
		this.id = id;
		this.flightName = flightName;
		this.flightFare = flightFare;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public Integer getFlightFare() {
		return flightFare;
	}
	public void setFlightFare(Integer flightFare) {
		this.flightFare = flightFare;
	}
	@Override
	public String toString() {
		return "Fare [id=" + id + ", flightName=" + flightName + ", flightFare=" + flightFare + "]";
	}


}
