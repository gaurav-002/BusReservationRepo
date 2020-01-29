package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.model.BookingCancellation;
import com.lti.model.BookingDetails;
import com.lti.model.BusDetails;
import com.lti.model.BusSearch;
import com.lti.model.Passenger;
import com.lti.model.User;
import com.lti.service.BookingCancellationService;
import com.lti.service.BookingDetailsService;
//import com.lti.service.BookingDetailsService;
import com.lti.service.BusSearchService;
import com.lti.service.CredentialsService;
import com.lti.service.PassengerRegisterService;

@RestController
@RequestMapping(path="/")
@CrossOrigin
public class CredentialsRestController {

	@Autowired
	private CredentialsService loginService;	
	@Autowired
	private PassengerRegisterService registerService;	
	@Autowired
	private BusSearchService busSearchService;
	@Autowired
	private BookingDetailsService bookingDetailsService;
	@Autowired
	private BookingCancellationService bookingCancellationService;
		
	
	// http://localhost:9090/
	@RequestMapping(path="register", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> addPassenger(@RequestBody User user){
		System.out.println(user);
		ResponseEntity<String> response;
		boolean result = registerService.passengerRegister(user);
		if(result){
			response=new ResponseEntity<String>("Passenger is registered",HttpStatus.CREATED);
		}
		else{
			response=new ResponseEntity<String>("Passenger is not Registered",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    return response;
	}
	
	// http://localhost:9090/credentials/username/password
	@RequestMapping(path="credentials/{username}/{password}" ,method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Passenger readPassenger(@PathVariable("username") String username,@PathVariable("password") String password) {
		ResponseEntity<String> response;
		//System.out.println(username +" "+ password);
		Passenger cred = loginService.readPassenger(username, password);

		
		if(cred!=null){
			response = new ResponseEntity<>("Login Successful", HttpStatus.CREATED);
		}
		else{
			response = new ResponseEntity<>("Invalid Login", HttpStatus.CREATED);
		}
		
		System.out.println(cred);
		return cred;
	}
	
	
	//http://localhost:9090/search
	@RequestMapping(path = "search", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<BusDetails> getBuses(@RequestBody BusSearch busSearch){
		List<BusDetails> bs = busSearchService.busSearch(busSearch);
		return bs;
			
	}
	
	//http://localhost:9090/book
		@RequestMapping(path = "book", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
		public @ResponseBody BookingDetails bookBus(@RequestBody BookingDetails bookingDetails){
			System.out.println(bookingDetails);
			ResponseEntity<String> response;
			boolean bs = bookingDetailsService.bookBus(bookingDetails);
			System.out.println(bs);
			if(bs){
				response=new ResponseEntity<>("Values Entered",HttpStatus.CREATED);
			}
			else{
				response=new ResponseEntity<>("Values not entered",HttpStatus.INTERNAL_SERVER_ERROR);
			}
		    return bookingDetails;
				
		}
	
		
		// http://localhost:9090/bookingcancellation
		@RequestMapping(path="bookingcancellation", method=RequestMethod.POST , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
		public int bookingCancellation(@RequestBody BookingCancellation bookingCancellation){
			System.out.println(bookingCancellation);
			int response;
			int bc = bookingCancellationService.bookingCancellation(bookingCancellation);
			System.out.println(bc);
			if(bc>0){
			 return response=1;
			}
			else{
			return	response=0;
			}
			
		}
	
	
	@ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception ex){
    	ResponseEntity<String> error = new ResponseEntity<String>(ex.getMessage() ,HttpStatus.INTERNAL_SERVER_ERROR);
    	return error;
    }
	
}
