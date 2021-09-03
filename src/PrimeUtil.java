import java.util.ArrayList;

public class PrimeUtil {

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
        for (int i = b; i < e; i++) {
            if(isPrime(i)) result.add(i);
        }
        return result;
    }
}
