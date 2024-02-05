public class ComplexArray {
    public static void main(String[] args) {
        //here we created 4 element array at runtime so we can't change array size later on.
        int num1[] = new int[4]; 
        num1[0] = 56;
        num1[1] = 5;
        num1[2] = 89;
        num1[3] = 9;

        for(int i=0;i<=num1.length;i++){
            System.out.println(num1[i]);
        }
    }
}
