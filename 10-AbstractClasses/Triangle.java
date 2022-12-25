public abstract class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double area(){
        return 1/2.0*base*height;
    }

    @Override
    public double parameter(){
        return base*2 + height*2;
    }
}