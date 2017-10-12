package com.rest;

import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.omg.DynamicAny.NameValuePair;



public class CallPost {

	
	public static void main(String[] args) {
		
		URL url;
	
			try {
				url = new URL("http://echo.itcuties.com");
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				
				connection.setDoOutput(true);
				connection.setRequestProperty("Accept", "application/json");
				OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
				System.out.println("::::::"+connection.getResponseCode());
				System.out.println(":::::::"+connection.getResponseMessage());
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
	
		
	}

}
