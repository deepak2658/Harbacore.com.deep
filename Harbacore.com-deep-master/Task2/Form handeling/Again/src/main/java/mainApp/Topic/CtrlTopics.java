package mainApp.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CtrlTopics {

    @Autowired
    private TopicServices topicServices;

    @RequestMapping("/Topics")
    private List<getTopicObject.Topic> getAllTopics(){
        return topicServices.getALlTopic();
    };
    @RequestMapping("/Topics/{id}")
    public getTopicObject.Topic getTopic(@PathVariable String id){
        return topicServices.getTopic(id);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/Topics")
    public void addTopic(@RequestBody getTopicObject.Topic topic){
        topicServices.addTopic(topic);
    }
    @RequestMapping(method = RequestMethod.PUT,value ="/Topics/{id}")
    public void updateTopics(@RequestBody getTopicObject.Topic topic,@PathVariable String id ){
        topicServices.updateTopic(id, topic);
    }
    @RequestMapping(method = RequestMethod.DELETE,value ="/Topics/{id}")
    public void  deleteTopics(@PathVariable String id ){
        topicServices.deleteTopic(id);
    }
}
