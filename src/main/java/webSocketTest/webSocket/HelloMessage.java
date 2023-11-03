package webSocketTest.webSocket;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class HelloMessage {
    private String name;

    public HelloMessage(){

    }

    public HelloMessage(String name){ this.name = name;}

    public String getName(){ return name;}

    public void setName(String name) {this.name = name;}
}
