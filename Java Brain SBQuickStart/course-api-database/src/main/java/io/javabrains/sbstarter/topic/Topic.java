package io.javabrains.sbstarter.topic;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Topic {

	@Id
	private String id;
	private String name;
	private String description;
	
	
	public Topic() {
		
	}
	
	public Topic(String id, String name, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.description = desc;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return description;
	}
	public void setDesc(String desc) {
		this.description = desc;
	}

	@Override
	public String toString() {
		return "Topic [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
	
	
	
}
