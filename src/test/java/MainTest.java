import org.junit.jupiter.api.Test;

import java.io.IOException;

class MainTest {

    @Test
    public void testSocket(){
        NoobClient client = new NoobClient();
        try {
            client.startConnection("127.0.0.1", 6666);
            String response = client.sendMessage("hello server");
            System.out.println(response);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}