import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Main {

    public static void main(String[] args) {
        PrimeUtil t = new PrimeUtil();

        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("filename.txt"), "utf-8"))) {
            writer.write("something");
        }catch (Exception e) {e.printStackTrace();}


//        System.out.println(t.isPrime(13));
//        System.out.println(t.isPrime(51));
        long start = System.currentTimeMillis();
        t.getPrimes(10);
        long end = System.currentTimeMillis();
        System.out.println(end - start + " ms");
    }


}
