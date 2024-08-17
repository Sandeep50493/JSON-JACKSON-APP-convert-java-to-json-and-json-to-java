package in.itSolution.utils;

import com.google.gson.Gson;

import in.itSolution.bindings.Address;
import in.itSolution.bindings.Passenger;

public class JavaToJson {
	public static void main(String[] args) throws Exception {
		
		Address addr=new Address();
		addr.setCity("Bengaluru");
		addr.setState("Karnataka");
		addr.setCountry("India");
		
		
		
		
		Passenger p=new Passenger();
		p.setName("Sandeep");
		p.setFrom("Yeshvantpur");
		p.setTo("Danapur");
		p.setGender("Male");
		p.setAddr(addr);
		
/*		ObjectMapper mapper = new ObjectMapper();
		
		mapper.writeValue(new File("src/passenger.json"),p);
		System.out.println("Converted Java Object to Json");
		
		*/
		
		Gson gson = new Gson();
		String json = gson.toJson(p);
		System.out.println(json);
		
		System.out.println("Converted Java to Gson");
		
		
		
		
	}
}
