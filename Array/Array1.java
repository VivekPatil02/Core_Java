
class Human {
    String Name;
    int Marks;
}

public class Array1 {
    public static void main(String[] args) {

        Human obj1 = new Human();
        obj1.Name = "Vivek";
        obj1.Marks = 98;

        Human obj2 = new Human();
        obj2.Name = "Rahul";
        obj2.Marks = 68;

        Human obj3 = new Human();
        obj3.Name = "sunil";
        obj3.Marks = 47;

        Human num[] = new Human[3];
        num[0] = obj1;
        num[1] = obj3;
        num[2] = obj2;

        for (int i = 0; i < 3; i++) {
            System.out.println(num[i].Name + " : " + num[i].Marks);
        }

    }
}
