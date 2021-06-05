package com.cg.casestudy.flightmanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.casestudy.flightmanagement.model.Airport;
import com.cg.casestudy.flightmanagement.service.AirportService;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/flight/airport")
public class AirportController {

	@Autowired
	private AirportService airportService;

	/*** Receiving GET request and returning 'all airports list' from AirportService */
	@GetMapping(value = "/allAirports")
	public List<Airport> getAllAirports() {
		return airportService.getAllAirports();
	}

	/*** Receiving GET request and returning 'one airport' from AirportService */
	@GetMapping("/getAirport/{id}")
	public Optional<Airport> getAirport(@PathVariable String id) {
		return airportService.getAirport(id);
	}

	/*** Receiving POST request and returning response from AirportService */
	@PostMapping("/addAirport")
	public String addAirport(@RequestBody Airport flight) {
		return airportService.addAirport(flight);
	}

	/*** Receiving PUT request and returning response from AirportService */
	@PutMapping("/updateAirport")
	public String updateAirport(@RequestBody Airport flight) {
		return airportService.updateAirport(flight);
	}

	/*** Receiving DELETE request and returning response from AirportService */
	@DeleteMapping("/deleteAirport/{id}")
	public String deleteAirport(@PathVariable String id) {
		return airportService.deleteAirport(id);
	}
}
