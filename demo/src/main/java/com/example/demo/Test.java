package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.IOException;
import java.lang.reflect.Field;

import javax.websocket.server.PathParam;
import javax.ws.rs.core.MediaType;

@RestController
@RequestMapping(value="/test")
public class Test {
	
	Pojo p=new Pojo();
	@GetMapping(value = "/{profileId}", produces=MediaType.APPLICATION_JSON) 
	public Pojo test(@PathVariable("profileId") String profileid ) {
		System.out.println("Hi");
		p.setName("chinchu");
		p.setAge(58);
		return p;
	}
	
	
	
	
	
	
	
	
	
/*	@RequestMapping(value="/1",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON)
	public Object test1(@RequestBody String body) throws JsonParseException, JsonMappingException, IOException, IllegalArgumentException, IllegalAccessException {
		System.out.println(body);		
		String config = "{\"configurationData\": {\"initialize\": {\"name\": \"On When Open OR Off When Shut WebHook App\",\"description\": \"On When Open OR Off When Shut WebHook App\",\"id\": \"app\",\"permissions\": [\"l:schedules\"],\"firstPageId\": \"1\"}}}";
		ObjectMapper objectMapper = new ObjectMapper();
		 Object object = objectMapper.readValue(body, Object.class);
		 Object object1 = objectMapper.readValue(config, Object.class);
		 for (Field field : object.getClass().getDeclaredFields()) {
     	    field.setAccessible(true);
     	    String name = field.getName();
     	    Object value = field.get(object);
     	    System.out.println("object is "+ name +value.toString());
     	    if(value.toString().equals("lifecycle=PING")) {
     	    	System.out.printf("inside %s: %s%n", name, value);
     	    	return body;
     	    }
     	
     	}
     	
		 System.out.println(object);
		return body;
	}*/
}

