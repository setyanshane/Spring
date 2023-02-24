package com.th.restJersy;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Client;

public class RestFulJerseyClient {
	public static void main(String args[]) {
		try {
			Client client=Client.create();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter id");
			String id=sc.next();
			WebResource Webresource=client.resource
					("http://localhost:8085/RestWebSservice/country/" +id);
			ClientResponse response= Webresource.accept("application/json").get(ClientResponse.class);
			if(response.getstatus()!=200) {
				throw new RuntimeException ("Failed : error code: "+ response.getStatus());
			}
			String output=response.getEntity(String.class);
			System.out.println("Output from server...../n");
			System.out.println(output);
			sc.close();
			
			}catch(Exception e) {
				e.printStackTrace();
			
			)
					
						
						
		}
		
	}
	

}
