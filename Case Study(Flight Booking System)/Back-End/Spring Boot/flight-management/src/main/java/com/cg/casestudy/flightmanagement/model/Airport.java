package com.cg.casestudy.flightmanagement.model;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "airports")
public class Airport {

	@Id
	@NotEmpty(message = "airportId must not be empty")
	private String id;
	@NotEmpty(message = "airportCode must not be empty")
	private String airportCode;
	@NotEmpty(message = "airportName must not be empty")
	private String airportName;
	public Airport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Airport(@NotEmpty(message = "airportId must not be empty") String id,
			@NotEmpty(message = "airportCode must not be empty") String airportCode,
			@NotEmpty(message = "airportName must not be empty") String airportName) {
		super();
		this.id = id;
		this.airportCode = airportCode;
		this.airportName = airportName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAirportCode() {
		return airportCode;
	}
	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	@Override
	public String toString() {
		return "Airport [id=" + id + ", airportCode=" + airportCode + ", airportName=" + airportName + "]";
	}
	

}
