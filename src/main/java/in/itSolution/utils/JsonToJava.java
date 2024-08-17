package in.itSolution.utils;

import java.io.FileReader;

import com.google.gson.Gson;

import in.itSolution.bindings.Passenger;

public class JsonToJava {
	public static void main(String[] args) throws Exception {
		
   /*		ObjectMapper mapper = new ObjectMapper();
		Passenger passenger = mapper.readValue(new File("src/passenger.json"),Passenger.class);
		System.out.println(passenger);
		*/
		
		
		Gson gson = new Gson();
		Passenger p = gson.fromJson(new FileReader("src/passenger.json"),Passenger.class);
	
		 System.out.println(p);
		 System.out.println("Json to Java");
	
	
	}

}
