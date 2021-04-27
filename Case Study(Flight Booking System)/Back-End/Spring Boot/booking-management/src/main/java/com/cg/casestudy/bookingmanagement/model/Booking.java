package com.cg.casestudy.bookingmanagement.model;

import java.util.List;

import javax.validation.Valid;
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
@Document(collection = "bookings")
public class Booking {

	@Id
	@NotEmpty(message = "id must not be empty")
	private String id;
	@NotEmpty(message = "pnrNo must not be empty")
	private String pnrNo;
	@Valid
	private Flight flight;
	@Valid
	private List<Passenger> passengerList;
	@NotNull
	private boolean active;
	@NotNull(message = "userId must not be empty")
	private String userId;
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Booking(@NotEmpty(message = "id must not be empty") String id,
			@NotEmpty(message = "pnrNo must not be empty") String pnrNo, @Valid Flight flight,
			@Valid List<Passenger> passengerList, @NotNull boolean active,
			@NotNull(message = "userId must not be empty") String userId) {
		super();
		this.id = id;
		this.pnrNo = pnrNo;
		this.flight = flight;
		this.passengerList = passengerList;
		this.active = active;
		this.userId = userId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPnrNo() {
		return pnrNo;
	}
	public void setPnrNo(String pnrNo) {
		this.pnrNo = pnrNo;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public List<Passenger> getPassengerList() {
		return passengerList;
	}
	public void setPassengerList(List<Passenger> passengerList) {
		this.passengerList = passengerList;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "Booking [id=" + id + ", pnrNo=" + pnrNo + ", flight=" + flight + ", passengerList=" + passengerList
				+ ", active=" + active + ", userId=" + userId + "]";
	}

}
