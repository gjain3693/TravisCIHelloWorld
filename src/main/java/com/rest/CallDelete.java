package com.rest;

import java.io.IOException;
import java.net.HttpCookie;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class CallDelete {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("http://restapi.demoqa.com/utilities/weather");
			HttpURLConnection connection = (HttpURLConnection)url.openConnection();
			connection.setRequestProperty("CONTENT-TYPE","application/json");
			
			connection.setRequestMethod("DELETE");
			int x = connection.getResponseCode();
			System.out.println("X:::"+x);
			if(x != 200) {
				System.out.println("Invalid Response::"+ x + connection.getResponseMessage());
			} else {
				System.out.println("Delete perform successfully "+ x + connection.getResponseMessage());
			}
		} catch (Exception e) {
		
			e.printStackTrace();
		}


	}

}
