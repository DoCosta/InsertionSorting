import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class InsertionSorter {
    private static int cachednumber = 0;
    public static void main(String[] args) throws InterruptedException{
        Random rand = new Random();
        int upperbound = 1000;
        int[] numbers = new int [15];
        for(int k = 0; k < numbers.length; k++){
            numbers[k] = rand.nextInt(upperbound);
        }
        
        System.out.println("Random Numbers:");
        System.out.println(Arrays.toString(numbers));
        System.out.println("Insertion Sort:");
        for( int i = 1; i < numbers.length; i++) {
            cachednumber = numbers[i];
            int j = i;
            while (j > 0 && cachednumber < numbers[j - 1]) {
                numbers[j] = numbers[j - 1];
                j--;
            }
            numbers[j] = cachednumber;
            
        System.out.println(Arrays.toString(numbers));
        TimeUnit.SECONDS.sleep(1);
        }        
    }
}