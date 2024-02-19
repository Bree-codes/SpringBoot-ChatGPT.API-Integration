package springbootchatgptapi.chatgptbot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import springbootchatgptapi.chatgptbot.DTO.ChatgptRequest;
import springbootchatgptapi.chatgptbot.DTO.ChatgptResponse;

@RestController
@RequestMapping("/chatbot")
public class chatbotController {

    @Value("${openai.model}")
    private String model;

    @Value(("${openai.api.url}"))
    private String apiUrl;

    @Autowired
    private RestTemplate template;

    public ChatgptResponse chatgptResponse(@RequestParam("prompt") String prompt){

        ChatgptRequest chatgptRequest = new ChatgptRequest(model,prompt);
        ChatgptResponse chatgptResponse=  template.postForObject(apiUrl,chatgptRequest, ChatgptResponse.class);
        return null;

    }
}
