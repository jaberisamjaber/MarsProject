package com.jaber.mars.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@PropertySource("classpath:application.properties")
public class MarsService {
	
	// injecting my key value
	@Value("${mars.api.key}")
	private String key;
	
	
	// creating a rest template to call external api
	private RestTemplate restTemplate = new RestTemplate();
	
	
	// method to call external api
	public String fetchPhotos(String sol, String camera) {
		
		// building the url
		StringBuilder st = new StringBuilder("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?");
		st.append("sol=" + sol);
		// if camera type is any, then do not add it	
		if(!camera.equals("any")) {
			st.append("&camera=" + camera);
		}
		st.append("&api_key=" + key);
		
		// calling the api
		String response = restTemplate.getForObject(st.toString(), String.class);
		// returning the response
		return response;
	}
	

}
