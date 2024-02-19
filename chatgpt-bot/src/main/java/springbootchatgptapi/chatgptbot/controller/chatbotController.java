package springbootchatgptapi.chatgptbot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springbootchatgptapi.chatgptbot.DTO.ChatgptResponse;

@RestController
@RequestMapping("/chatbot")
public class chatbotController {

    public ChatgptResponse chatgptResponse;
}
