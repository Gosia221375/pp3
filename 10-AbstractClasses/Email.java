public class Email extends Message{
    private String emailAddress;
    private String emailSubject;

    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public String getEmailSubject() {
        return emailSubject;
    }
    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }
    public Email(String text, String emailAddress, String emailSubject) {
        super(text);
        this.emailAddress = emailAddress;
        this.emailSubject = emailSubject;
    }
    public Email(String emailAddress, String emailSubject) {
        this.emailAddress = emailAddress;
        this.emailSubject = emailSubject;
    }
    @Override
    public void send() {
        System.out.println("Adress: "+ this.emailAddress);
        System.out.println("Subject: "+this.emailSubject);
        System.out.println("Email: "+getText());
        System.out.println("Number of characters: "+ charNumber());        
    }

    
}