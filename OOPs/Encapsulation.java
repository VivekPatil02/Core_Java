package OOPs;
class Employee{
    private String name= "vivek";
    private int age=10;
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}
//what is encapsulation?
public class Encapsulation {
    
    public static void main(String[] args) {
        Employee e1 = new Employee();
        System.out.println(e1.getAge());
        System.out.println(e1.getName());
    }
}
