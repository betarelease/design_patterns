class Email implements IEmail
{
    private String content;
    private String toAddress;

    public Email(String content, String toAddress)
    {
        this.content = content;
        this.toAddress = toAddress;
    }

    @Override
    public String receiver(){
        return toAddress;
    }

    @Override
    public String message()
    {
        //general email stuff
        return content;

    }

}
