package rs.raf.ostojanovic10021rn;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebSocketController {

    @GetMapping("/stomp-broadcast")
    public String getWebSocketBroadcast(){
        return "stomp-broadcast";
    }

    @MessageMapping("/broadcast")
    @SendTo("/topic/messages")
    public Message send(Message message){
        return new Message(message.getFrom(), message.getText(), "ALL");
    }
}
