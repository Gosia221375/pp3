public class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double area(){
        return radius*radius*3.14;
    }
    public double parameter(){
        return 3.14*radius*2;
    }
}