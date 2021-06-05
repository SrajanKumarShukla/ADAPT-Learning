package com.cg.casestudy.faremanagement.model;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "airlines")
public class Airline {

	@Id
	@NotEmpty(message = "airlineId must not be empty")
	private String id;
	@NotEmpty(message = "airlineNo must not be empty")
	private String airlineNo;
	@NotEmpty(message = "airlineName must not be empty")
	private String airlineName;
	public Airline() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Airline(@NotEmpty(message = "airlineId must not be empty") String id,
			@NotEmpty(message = "airlineNo must not be empty") String airlineNo,
			@NotEmpty(message = "airlineName must not be empty") String airlineName) {
		super();
		this.id = id;
		this.airlineNo = airlineNo;
		this.airlineName = airlineName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAirlineNo() {
		return airlineNo;
	}
	public void setAirlineNo(String airlineNo) {
		this.airlineNo = airlineNo;
	}
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	@Override
	public String toString() {
		return "Airline [id=" + id + ", airlineNo=" + airlineNo + ", airlineName=" + airlineName + "]";
	}
	
}
