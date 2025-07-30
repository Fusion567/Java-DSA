//Function Overloading
//Polymorphism
;

class Student{
    int age;
    String name;

    public void getinfo(String name){
        System.out.println("Name: "+name);
    }
    public void getinfo(int  age){
        System.out.println("Age: "+age);
    }
    public void getinfo(String name, int age){
        System.out.println(name+" "+age);
    }
}
public class Overload {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rohan";
        s1.age = 24;
        s1.getinfo(s1.name);
        s1.getinfo(s1.age);        
        s1.getinfo(s1.name, s1.age);
    }
}
