package com.jaber.mars.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jaber.mars.service.MarsService;

@CrossOrigin(origins={"http://localhost:4200","mars-solo-project.netlify.app"})
@RestController
public class MarsController {
	
	// autowiring the mars service
	@Autowired
	public MarsService marsService;
	
	// get request
	@GetMapping("photos")
	public String getMarsPhotos(@RequestParam String sol, @RequestParam String camera) {
		return marsService.fetchPhotos(sol, camera);
	}

}
