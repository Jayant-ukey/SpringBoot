package io.javabrains.sbstarter.topic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
		@Autowired
		private TopicRepo topicRepo;
	
 		public List<Topic> getAllTopics(){
 			List<Topic> topics = new ArrayList<>();
 			topicRepo.findAll().forEach(topics::add);
 			
 			return topics;
 		}
 		
 		public Optional<Topic> getTopic(String id) {
 			return topicRepo.findById(id);
 		}

 		public void addTopicService(Topic topic) {
 			topicRepo.save(topic);
 		}
 		
 		public void updateTopic(String id, Topic topic) {
			topicRepo.save(topic);
 		}
 		
 		public void deleteTopic(String id) {
			topicRepo.deleteById(id);
 		}
}
