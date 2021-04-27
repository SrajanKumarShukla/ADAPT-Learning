package com.cg.casestudy.flightmanagement.model;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorList {

	private LocalDateTime timestamp;
	private String message;
	private List<String> details;
	public ErrorList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ErrorList(LocalDateTime timestamp, String message, List<String> details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<String> getDetails() {
		return details;
	}
	public void setDetails(List<String> details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "ErrorList [timestamp=" + timestamp + ", message=" + message + ", details=" + details + "]";
	}

}