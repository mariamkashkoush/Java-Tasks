
package task6;
class Triangle {
private final float base ;
private final float side1;
private final float side2;
private final float height ;
public Triangle(){
  base=6;
  side1=3;
  side2=4;
  height=5;
}
public double getarea ( ){
return 0.5*base*height ;
}
public double getcircumference ( ){
return base+side1+side2 ;
}
}
class Circle {
float radius;
public Circle (){
radius=7;
}
public double getarea ( ){
return 3.14*radius*radius ;
}
public double getcircumference ( ){
return 2*3.14*radius ;
}


} 


public class Task6 {

    
    public static void main(String[] args) {
        Triangle t1 = new Triangle() ;
        System .out .println("Area of Triangle is = " + t1.getarea());
        System .out .println("Circumference of Triangle is = " + t1.getcircumference());
        Circle c1 = new Circle ();
        System .out .println("Area of Circle is = " + c1.getarea());
        System .out .println("Circumference of Triangle is = " + c1.getcircumference());
        
    }
    
}
