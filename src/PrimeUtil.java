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

    public ArrayList<Integer> getPrimes(int b, int e) {
        ArrayList<Integer> result = new ArrayList<>();
        if(b == 2)
            result.add(2);
        if(b % 2 == 0) b++;
        for (int i = b; i < e; i+=2) {
            if(this.isPrime(i)) result.add(i);
            System.out.println(i);
        }
        return result;
    }
}
