public abstract class Rectangle extends Shape{
    private double base;
    private double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double area(){
        return this.base*this.height;
    }

    @Override
    public double parameter(){
        return base*2 + height*2;
    }
}