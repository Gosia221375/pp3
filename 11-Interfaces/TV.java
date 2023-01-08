public class TV implements CanOnOff{
    boolean on = false;

    public void display(){
        if (on){
            System.out.println("TV is on");
        } else {
            System.out.println("TV is off");
        }
    }

    public void on(){
        on = true;
    }

    public void off(){
        on = false;
    }
}