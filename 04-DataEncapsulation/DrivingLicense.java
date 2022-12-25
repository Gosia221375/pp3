public class DrivingLicense {
    private String firstName;
    private String secondName;
    private String address;
    private String postalCode;
    private String city;
    private String dlNumber;
    private int yearIssue;
    private String dlCat;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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



    public void displayInfo() {
        System.out.println("Driving license number: "+ dlNumber);
        System.out.println(firstName + " " + secondName);
        System.out.println(city + ", " + address + ", " + postalCode);
        System.out.println("Category: " + dlCat);
        System.out.println("Expiration date: " + yearIssue);
    }
}