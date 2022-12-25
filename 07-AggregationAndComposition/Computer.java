public class Computer {
    private String name;
    private int workedHours;
    private String motherboard;
    private int ramSlots;
    private Processor processor;
    private boolean status;

    public void turnOn(){
        this.status = true;
    }

    public void turnOff(){
        this.status = false;
    }

    public void display(String usersInput){
        System.out.println(usersInput);
    }

    public void storeData(String args){

    }

    public void plugDevices(String device){

    }
}