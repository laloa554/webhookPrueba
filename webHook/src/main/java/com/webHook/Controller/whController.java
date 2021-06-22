package com.webHook.Controller;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;



@RestController
@RequestMapping("/producto")
@CrossOrigin(origins = "*")
public class whController {

    
    @PostMapping("/webHookPrueba")
    protected void doPost(@RequestBody whEntity b ,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	//BufferedReader get_body = request.getReader(); 
    	ObjectMapper mapper = new ObjectMapper();
    	String jsonStr = mapper.writeValueAsString(b);
    	System.out.println(jsonStr);
    	//System.out.println(b.getMensaje());
    	//System.out.println(b.getMensaje());	
    }
    
    



}
