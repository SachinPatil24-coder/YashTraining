package com.handlejsonrequest.controller;

import javax.validation.Valid;

import com.handlejsonrequest.pojo.HandleJsonPojo;
import com.handlejsonrequest.service.HandleJsonRequestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HandleJsonRequest {

	@Autowired
	HandleJsonRequestService handleJsonRequestService;

	@PostMapping("/handleJsonRequest")
	public String handleJsonRequest(@Valid @RequestBody HandleJsonPojo handleJsonRequestPojo) {
		System.out.println(handleJsonRequestPojo);
		return handleJsonRequestService.handleJsonRequest(handleJsonRequestPojo);
	}
	
	@GetMapping("/getJsonRequest")
	public HandleJsonPojo getJsonResp() {
		return handleJsonRequestService.getJsonResponse();
	}
}
