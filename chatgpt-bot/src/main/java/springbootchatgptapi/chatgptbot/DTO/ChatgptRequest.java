package springbootchatgptapi.chatgptbot.DTO;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ChatgptRequest {

    private String model;
    private List<Message> messages;

    public ChatgptRequest(String model, String prompt) {
        this.model = model;
        this.messages = new ArrayList<>();
        this.messages.add(new Message("user",prompt));
    }
}
