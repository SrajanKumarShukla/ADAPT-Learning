package com.cg.casestudy.bookingmanagement.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.casestudy.bookingmanagement.model.AuthRequest;
import com.cg.casestudy.bookingmanagement.model.Booking;
import com.cg.casestudy.bookingmanagement.model.Flight;
import com.cg.casestudy.bookingmanagement.service.BookingManagementService;
import com.cg.casestudy.bookingmanagement.util.JwtUtil;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/booking")
public class BookingManagementController {
	@Autowired
	private JwtUtil jwtUtil;
	@Autowired
	private AuthenticationManager authenticationManager;

	@PostMapping("/authenticate")
	public String generateToken(@RequestBody AuthRequest authRequest) throws Exception {
		try {
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
		} catch (Exception ex) {
			throw new Exception("inavalid username/password");
		}
		return jwtUtil.generateToken(authRequest.getUsername());
	}


	@Autowired
	private BookingManagementService bookingManagementService;

	/** Receiving GET request and returning 'Flight object' from BookingManagementService 
	 * @param flightId
	 * @return flight details
	 */
	@GetMapping("/getFlight/{flightId}")
	public ResponseEntity<Optional<Flight>> getFlight(@PathVariable String flightId) {
		return ResponseEntity.ok(bookingManagementService.getFlight(flightId));
	}

	/** Receiving GET request and returning 'Booking list' related to the userId from BookingManagementService
	 * @param userId
	 * @return list of bookings for that userId
	 */
	@GetMapping("/getBookingsByUserId/{userId}")
	public ResponseEntity<List<Booking>> getBookingsByUserId(@PathVariable String userId) {
		return ResponseEntity.ok(bookingManagementService.getBookingsByUserId(userId));
		
	}

	/** Receiving GET request and returning 'Booking List' from BookingManagementService 
	 * @return list of all bookings
	 */
	@GetMapping("/allBookings")
	public ResponseEntity<List<Booking>> getAllBookings() {
		return ResponseEntity.ok(bookingManagementService.getAllBookings());
		
	}

	/** Receiving GET request and returning 'Booking Object/ Optional' from BookingManagementService 
	 * @param bookingId
	 * @return booking details
	 */
	@GetMapping("/getBooking/{bookingId}")
	public ResponseEntity<Optional<Booking>> getBooking(@PathVariable String bookingId) {
		return ResponseEntity.ok(bookingManagementService.getBooking(bookingId));
	}

	/** Receiving POST request and returning 'String/Void' from BookingManagementService 
	 * @param booking
	 */
	@PostMapping("/addBooking")
	public ResponseEntity<String> addBooking(@Valid @RequestBody Booking booking) {
		return ResponseEntity.ok(bookingManagementService.addBooking(booking));
	}

	/** Receiving PUT request and returning 'String/Void' from BookingManagementService */
	@PutMapping("/updateBooking")
	public ResponseEntity<String> updateBooking(@Valid @RequestBody Booking booking) {
		return ResponseEntity.ok(bookingManagementService.updateBooking(booking));
	}
	
	/** Receiving DELETE request and returning 'String/Void' from BookingManagementService
	 * @param bookingId
	 * @return acknowledgement of deletion
	 */
		@DeleteMapping("/deleteBooking/{bookingId}")
		public ResponseEntity<String> deleteBooking(@PathVariable String bookingId) {
			return ResponseEntity.ok(bookingManagementService.deleteBooking(bookingId));
		}

}
