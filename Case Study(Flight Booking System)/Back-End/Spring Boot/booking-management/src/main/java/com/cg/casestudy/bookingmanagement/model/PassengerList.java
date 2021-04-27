package com.cg.casestudy.bookingmanagement.model;

import java.util.List;

import javax.validation.Valid;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassengerList {
	
	@Valid
	private List<Passenger> passengerList;

	public PassengerList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PassengerList(@Valid List<Passenger> passengerList) {
		super();
		this.passengerList = passengerList;
	}

	public List<Passenger> getPassengerList() {
		return passengerList;
	}

	public void setPassengerList(List<Passenger> passengerList) {
		this.passengerList = passengerList;
	}

	@Override
	public String toString() {
		return "PassengerList [passengerList=" + passengerList + "]";
	}
	

}
