package com.rest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class SetDataPost {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String postData;
	    postData = "Hi Honey";
	    
	    String postDataEncoded = URLEncoder.encode(postData);
	    String postEncodeData = "e=" + postDataEncoded;
	    
	    try {
			URL url = new URL("http://echo.itcuties.com");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("POST");
			connection.setDoOutput(true);
			connection.setRequestProperty("accept", "application/json");
			connection.setRequestProperty("CONTENT-LENGTH", String.valueOf(postEncodeData.length()));
			
		OutputStream os = connection.getOutputStream();
		os.write(postEncodeData.getBytes());
		
		StringBuilder sb = new StringBuilder();
		String output;
		BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		    while((output = br.readLine()) != null) {
		    	sb.append(output);
		    }
		    
		    System.out.println(sb.toString());
				
			} catch (Exception ex) {
				
			}
	    

	}

}
