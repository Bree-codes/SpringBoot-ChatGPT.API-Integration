package springbootchatgptapi.chatgptbot.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatgptResponse {

    private List<Choice> choices;

    public static class Choice{
        private int index;
        private Message message;

    }

}
