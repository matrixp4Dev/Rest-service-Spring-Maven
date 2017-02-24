package com.webservice.service;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.webservice.model.Items;

/*@RequestMapping("/items")--Set url path
 * method=RequestMethod.POST --This method is post
 * produces="application/json -- request is json type
 * @RequestBody Items  items --Convert json request as Items object
 * 
 * */
@Controller
@RequestMapping("/items")
public class ItemsServiceImpl {
	
	@RequestMapping(value = "/test", method=RequestMethod.POST ,produces="application/json")
	public @ResponseBody Items itemDetails(@RequestBody Items  items){
		
		System.out.println("User Details");
		System.out.println(items.getValueId());
		System.out.println(items.getValueName());
		
		return items;
	}

}
