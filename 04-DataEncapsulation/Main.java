public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        DrivingLicense d1 = new DrivingLicense();
        d1.setFirstName(firstName: "Małgorzata");
        d1.setSecondName(secondName: "Leśniak");
        d1.setAdress(address: "blabla");
        d1.setPostalCode(postalCode: "30-023");
        d1.setCity(city: "Kraków");
        d1.setDlNumber(dlNumber: "nie wiem");
        d1.setYearIssue(yearIssue: 2022);
        d1.setDlCat(dlCat: "B");

        d1.displayInfo();

        System.out.println("\n" + d1.getFirstName() + " " + d1.getSecondName());
    }
    if setYearIssue



}
