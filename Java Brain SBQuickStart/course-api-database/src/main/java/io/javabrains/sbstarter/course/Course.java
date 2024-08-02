package io.javabrains.sbstarter.course;

import io.javabrains.sbstarter.topic.Topic;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Course {

	@Id
	private String courseId;
	private String title;
	private String description;
	
	@ManyToOne
	private Topic topic;

	public Course() {

	}
	
	public Course(String courseId, String title, String description, Topic topic) {
		super();
		this.courseId = courseId;
		this.title = title;
		this.description = description;
		this.topic = topic;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
	
	
}
