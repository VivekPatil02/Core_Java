package Core_Java;
public class Array {
    public static void main(String[] args) {
        // we use array to assign multiple values to one variable
        // here num which refers to a variable, we have to use [] to indicate this is an array var 
        // and unlike in javascript or any other programming language we can't assign values inside square braces [] but in curly braces {}
        int num[] = { 4, 5, 8, 9 };
        System.out.println(num[2]); // ans is 8 because indexing starts from 0th index.

        System.out.println("--------------------------------");

        // if i have to print all values assigned to var then i will be loop through it
        for (int i = 0; i < 4; i++) {
            System.out.println(num[i]);
        }
    }
}
