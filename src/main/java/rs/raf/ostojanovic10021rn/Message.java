package rs.raf.ostojanovic10021rn;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Message {

    private String from;
    private String text;
    private String recipient;
    private String time;

    public Message(String from, String text, String recipient) {
        this.from = from;
        this.text = text;
        this.recipient = recipient;
        this.time = SystemUtils.getCurrentTimeStamp();
    }
    public Message(){

    }
}
