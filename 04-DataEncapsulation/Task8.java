public class DrivingLicense {
    private String firstName;
    private String secondName;
    private String adress;
    private String postalCode;
    private String city;
    private String dlNumber;
    private int yearIssue;
    private String dlCat;

    public String toString(){

        String details = "";
        details += firstName + "," + secondName + "\n";
        details += adress + "," + postalCode + "," + city + "\n";
        details += dlNumber + "," + dlCat + "," + yearIssue + "\n";
        return details;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDlNumber() {
        return dlNumber;
    }

    public void setDlNumber(String dlNumber) {
        this.dlNumber = dlNumber;
    }

    public int getYearIssue() {
        return yearIssue;
    }

    public void setYearIssue(int yearIssue) {
        this.yearIssue = yearIssue;
    }

    public String getDlCat() {
        return dlCat;
    }

    public void setDlCat(String dlCat) {
        this.dlCat = dlCat;
    }