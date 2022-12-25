public class SurfaceArea {
    
    public static double circleArea(double radius){
        return radius*radius*3.14;
    }
    
    public static double rectangleArea(double lenght, double width){
        return lenght*width;
    }
    
    public static double triangleArea(double base, double height){
        return base*height/2;
    }
    
    public static void main(String[] args){
        System.out.println("Circle area: "+SurfaceArea.circleArea(3));
        System.out.println("Rectangle area: "+SurfaceArea.rectangleArea(4, 5));
        System.out.println("Triangle area: "+triangleArea(3,4));
    }
}