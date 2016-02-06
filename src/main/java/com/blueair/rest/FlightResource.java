package com.blueair.rest;

import java.util.LinkedList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/flights")
public class FlightResource {
	
	private static List<Flight> staticFlights = new LinkedList<Flight>();
	
	static {
		staticFlights.add(new Flight("BA2000", 40.7127837f, -74.0059413f, 1454772329l, "FLIGHT"));
		staticFlights.add(new Flight("BA3200", 40.7127837f, -74.0059413f, 1454772329l, "FLIGHT"));
		staticFlights.add(new Flight("BA4440", 40.7127837f, -74.0059413f, 1454772329l, "GATE"));
		staticFlights.add(new Flight("BA5050", 40.7127837f, -74.0059413f, 1454772329l, "TAXI"));
		staticFlights.add(new Flight("BA6066", 40.7127837f, -74.0059413f, 1454772329l, "FLIGHT"));
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Flight> getFlights() {
		return staticFlights;
	}

}
