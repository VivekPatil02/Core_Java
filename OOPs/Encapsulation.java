package OOPs;

class Employee {
    private String name = "vivek";
    private int age = 10;

    //below is getter method
    //above name and age properties are private so can't access in main method directly(because main method in another Encapsulation class instead of Employee class)

    //note: private var/properties of some class only accessible by method of that class,outside of that class it cant be accessible.so that we introduced getter method to get the value of private var and through this method we can read the value of private var in another method which is encapsulation here.
    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    //setter method return type is void because we are just setting the value of instant variable/properties defined in this class
    //here in string name arg we are receiving from the main method 
    public void setName(String n){
        name = n;
    }

    public String getName() {
        return name;
    }
}

// what is encapsulation?
public class Encapsulation {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setAge(15);
        e1.setName("vivek...");
       
        System.out.println(e1.getAge());
        System.out.println(e1.getName());
    }
}
