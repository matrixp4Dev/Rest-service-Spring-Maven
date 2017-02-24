package com.webservice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)//In here accept only both valueName and valueId. Exclude all other.Class level annotation
//@JsonIgnoreProperties("valueName")--In here exclude valueName from the result
//@JsonIgnoreProperties({"valueName","valueId"})//--In here exclude both valueName and valueId from the result.
//Here site http://www.davismol.net/2015/03/10/jackson-json-difference-between-jsonignore-and-jsonignoreproperties-annotations/
public class Items implements Serializable{

	private static final long serialVersionUID = 2450863167073154906L;
	
	//@JsonIgnore--Exclude this valueName from response(result) as @JsonIgnoreProperties("valueName").This is method level annotation.
	//Result is same when use in the getter method
	private String valueName;
	
	//@JsonIgnore--Exclude this valueId from response(result)
	private int valueId;
	
	
	public Items(){}
	
	public Items (String name,int id){
		this.valueId = id;
		this.valueName = name;
	}
	//@JsonIgnore
	public String getValueName() {
		return valueName;
	}

	public void setValueName(String valueName) {
		this.valueName = valueName;
	}

	public int getValueId() {
		return valueId;
	}
	public void setValueId(int valueId) {
		this.valueId = valueId;
	}

}
