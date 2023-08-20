package kyu8.jennyssecretmessage.test;
import kyu8.jennyssecretmessage.JennysSecretMessage;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JennysSecretMessageTest {
    @Test
    public void Test() {
        assertEquals("should greet some people normally", "Hello, Jim!", JennysSecretMessage.greet("Jim"));
        assertEquals("should greet some people normally", "Hello, Jane!", JennysSecretMessage.greet("Jane"));
        assertEquals("should greet some people normally", "Hello, Simon!", JennysSecretMessage.greet("Simon"));
        assertEquals("should greet Johnny a little bit more special", "Hello, my love!", JennysSecretMessage.greet("Johnny"));
    }
}
