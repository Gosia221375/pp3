public class Computer2 {
    private String name;
    private String typeOfMotherboard;
    private int capacity;
    private String brand;
    private Processor2 processor2;

    public double compute() {
        return 0;
    }

    public void runProgram() {}
    public void createFile() {}
    public void display() {}
    public void turnOn() {}
    public void turnOff() {}

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfMotherboard() {
        return typeOfMotherboard;
    }

    public void setTypeOfMotherboard(String typeOfMotherboard) {
        this.typeOfMotherboard = typeOfMotherboard;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Processor2 getProcessor2() {
        return processor2;
    }

    public void setProcessor2(Processor2 processor2) {
        this.processor2 = processor2;
    }

    //constructor method
    public Computer2(
    String name, 
    String typeOfMotherboard, 
    int capacity, 
    String brand, 
    Processor2 processor2,
    String CPUBrand,
    String model,
    double frequency,
    String socket) {
        this.name = name;
        this.typeOfMotherboard = typeOfMotherboard;
        this.capacity = capacity;
        this.brand = brand;
        this.processor2 = new Processor2(CPUBrand, model, frequency, socket);
    }
}