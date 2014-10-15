package com.test.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class RestApiTesting {
	
	
	public static void main(String[] args) {
		
	
		
		Client client = Client.create();
		 
		WebResource webResource = client
		   .resource("http://localhost:8080/HelloWorldExample/rest/hello");
 
		ClientResponse response = webResource.accept("application/text")
                   .get(ClientResponse.class);
 
		/*if (response.getStatus() != 200) {
		   throw new RuntimeException("Failed : HTTP error code : "
			+ response.getStatus());
		}*/
 
		String output = response.getEntity(String.class);
		
		System.out.println(output);

	  }




}
