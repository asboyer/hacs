public class Main {

    public static void main(String[] args) {
        PrimeUtil t = new PrimeUtil();
        System.out.println(t.isPrime(13));
        System.out.println(t.isPrime(51));
        System.out.println(t.getPrimes(2, Integer.MAX_VALUE));
    }


}
