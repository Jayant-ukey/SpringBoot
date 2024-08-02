package io.javabrains.sbstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import io.javabrains.sbstarter.topic.Topic;

public interface CourseRepo extends CrudRepository<Course, String> {
	public List<Course> findByTopicId(String topicId);
}
