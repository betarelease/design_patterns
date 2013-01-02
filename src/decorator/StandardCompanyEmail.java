public class StandardCompanyEmail extends EmailDecorator
{
    public StandardCompanyEmail(IEmail basicEmail)
    {
        originalEmail = basicEmail;
    }

    @Override
    public String message()
    {
        if(originalEmail.receiver().contains("gmail")){
            return addDisclaimer(originalEmail.message());
        }
        return originalEmail.message();

    }

    @Override
    public String receiver() {
        return originalEmail.receiver();
    }

    private String addDisclaimer(String message)
    {
        return  message + "\n Company Disclaimer";
    }

}