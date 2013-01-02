import org.junit.Assert;
import org.junit.Test;

public class StandardCompanyEmailTest {
    @Test
    public void shouldSendEmailWithCompanyDisclaimerToGmailUser() {
        Email email = new Email("original email", "email@gmail.com");
        StandardCompanyEmail decorator = new StandardCompanyEmail(email);
        Assert.assertEquals("should have company disclaimer", "original email\n Company Disclaimer", decorator.message());
    }

    @Test
    public void shouldSendEmailToCompanyUser() {
        Email email = new Email("original email", "email@company.com");
        StandardCompanyEmail decorator = new StandardCompanyEmail(email);
        Assert.assertEquals("should have company disclaimer", "original email", decorator.message());
    }

}
