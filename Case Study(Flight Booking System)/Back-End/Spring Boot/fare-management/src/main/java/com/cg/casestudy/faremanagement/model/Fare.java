package com.cg.casestudy.faremanagement.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "fares")
public class Fare {

	@Id
	@NotEmpty(message = "fairId must not be empty")
	String id;
	@NotEmpty(message = "flightName must not be empty")
	String flightName;
	@NotNull(message = "flightFare must not be empty")
	Integer flightFare;
	public Fare() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fare(@NotEmpty(message = "fairId must not be empty") String id,
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
