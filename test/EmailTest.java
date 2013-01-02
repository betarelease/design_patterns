import org.junit.*;
import org.junit.Assert;

import java.lang.String;

public class EmailTest {
    @Test
    public void basicEmail() {
        String expectedMessage = "test message";
        Email email = new Email(expectedMessage, "somebody@company.com");
        Assert.assertEquals("test message", email.message());
    }
}
