package Loop;

public class Loop {
    public static void main(String[] args) {
        //while loop
        //in while loop unlike for loop, only condition required as param...behavior increment i++ defined in loop block and initialization outside the block.
        
        int i = 0;
        while (i < 10) {
            System.out.println("while loop printing here " + i);
            i++;
        }

        //for loop   
        //in for loop three params which are 1.initialization, 2. condition and 3.behavior(increment/decrement).here in for loop j=0 is initialization, j<=10 is condition and j++ is increment behavior
        for (int j=0; j<=10 ; j++){
            System.out.println("for loop printing here " + j);
        }

    }
}
