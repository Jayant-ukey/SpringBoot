package io.javabrains.sbstarter.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepo courseRepo;
	
	public List<Course> getAllCourse(String topicId) {
		List<Course> courses = new ArrayList<Course>();
		courseRepo.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}

	
	public Optional<Course> getCourse(String cid) {
		return courseRepo.findById(cid);
	}
	
	public void saveCourse(Course course) {
		courseRepo.save(course);
	}
	
	public String updateCourse(Course course) {
		courseRepo.save(course);
		return "Course saved successfully";
	}

	public String deleteCourse(String id) {
		courseRepo.deleteById(id);
		return "Topic "+id+" got deleted";
	}


	
	
}
