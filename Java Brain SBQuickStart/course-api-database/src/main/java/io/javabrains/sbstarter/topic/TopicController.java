package io.javabrains.sbstarter.topic;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;

	@GetMapping("/topics")
	public List<Topic> getTopics(){
		return topicService.getAllTopics();
	}
	
	@GetMapping("/topics/{id}")
	public Optional<Topic> getTopicById(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	
	@PostMapping("/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopicService(topic);
	}
	
	
	@PutMapping("/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		topicService.updateTopic(id, topic);
	}
	
	
	@DeleteMapping("/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}
	
}
