class Shape{
    String color;
    public void area(){
        System.out.println("displays area");
    }
}

//Single Inheritance
class Square extends Shape{
    public void area(int l){
        System.out.println("Area of Square: "+l*l);
    }
}

//Multilevel Inheritance
class Rectangle extends Square{
    public void area(int l,int b){
        System.out.println("Area of Rectangle: "+l*b);
    }
}

// Hierarchical inheritance
class Circle extends Shape{
    public void area(int r){
        System.out.println("Area of Circle: "+3.14*r*r);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        s1.area();        

        Square sq = new Square();
        sq.area(5);

        Rectangle rec =  new Rectangle();
        rec.area(5, 6);

        Circle c =  new Circle();
        c.area(5);
    }
}
