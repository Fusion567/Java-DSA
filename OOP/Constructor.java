class Student{
    int age;
    String name;

    public void getinfo(){
        System.out.println("Name of Student is: "+this.name);
        System.out.println("Age of Student is: "+this.age);

    }
    //Non Parameterized constructor
    Student(){
        System.out.println("Constructor called");
    }
    //Parameterized constructor
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}
public class Constructor{
    public static void main(String[] args) {
        Student s1 = new Student("Rehan",24);
        s1.getinfo();
    }
}   