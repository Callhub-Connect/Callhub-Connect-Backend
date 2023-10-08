package callhub.connect;

import callhub.connect.entities.Message;
import callhub.connect.use_case.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/")
@EnableMongoRepositories
public class MainController {
    @Autowired
    MessageRepository messageRepository;
    @GetMapping("/")
    public String home() {
        return "meowwwwwww :3";
    }

    @GetMapping("/mongotest")
    public String writeGetMessage(){
        Message result = messageRepository.save(new Message("hi", LocalDate.now()));
        return result.id;
    }
}