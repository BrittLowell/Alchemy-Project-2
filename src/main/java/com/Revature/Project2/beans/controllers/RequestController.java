package com.Revature.Project2.beans.controllers;

import com.Revature.Project2.beans.pojos.Request;
import com.Revature.Project2.services.ManageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class RequestController {
    private final ManageRequest manageRequest;

    @Autowired

    public RequestController(ManageRequest manageRequest) {
        this.manageRequest = manageRequest;
    }

    //Add get method

    @PostMapping(value = "/request", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public Request post(@RequestBody Request request){
        return manageRequest.requestAddition(request);
    }
}
