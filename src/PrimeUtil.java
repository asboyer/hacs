import java.util.ArrayList;

public class PrimeUtil {

    // returns whether a given number is prime or not
    public boolean isPrime(int n) {
        if(n <= 1) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;
        for (int i = 3; i*i <= n; i+=2) {
            if(n % i == 0) return false;
        }
        return true;
    }

    public ArrayList<Integer> getPrimes(int max) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(2);
//        result.add(3);
        int b = 3;
        for (int i = b; i < max; i+=2) {
            boolean prime = true;
            for(int n: result) {
                if(i % n == 0){
                    prime = false;
                    break;
                }
                if(n*n > i) break;
            }
            if(prime) result.add(i);
        }
        return result;
    }
    //break; -> quit teh current loop
    //continue; -> quits the current iterraton, continues the loop
}
