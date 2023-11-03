package webSocketTest.webSocket;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class Greeting {
    private String content;

    public Greeting(){

    }

    public Greeting(String content){this.content = content;}

    public String getContent(){return content;}
}