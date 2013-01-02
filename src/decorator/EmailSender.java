public class EmailSender
{

    public void sendEmail(IEmail email)
    {
        StandardCompanyEmail standardEmail = new StandardCompanyEmail(email);
        standardEmail.message();
        //send
    }
}
