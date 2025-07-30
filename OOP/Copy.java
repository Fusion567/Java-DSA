//copy constructor
class Student{
    int age;
    String name;

    public void getinfo(){
        System.out.println("Name of Student is: "+this.name);
        System.out.println("Age of Student is: "+this.age);

    }
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }

    Student(){
        
    }
}
public class Copy {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rohan";
        s1.age = 24;

        Student s2 = new Student(s1);
        s2.getinfo();
    }
}
