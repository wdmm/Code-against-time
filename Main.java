import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main (String[] args) {
        String cipher ="";
        Integer n;
        String[] keys;
        Integer result = 0;

        try (Scanner scanner = new Scanner(new File(args[0]))) {
            cipher = scanner.nextLine();
            n = Integer.parseInt(scanner.nextLine());
            keys = scanner.nextLine().split(" ");
       }

        catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }  
        
        Integer cip_len = cipher.length();
		
        Comparable cuilt = (c, k) -> cip_len == k.length() ? true : false;
        Verifable vuilt = (c, k) -> {
            for ( int y = 0; y < cip_len; y++)
                if (c.charAt(y) == k.charAt(y)) return false;
                else continue;
            return true;
        };
        
        for (String k : keys)
            if (cuilt.compare(cipher, k))
                if (vuilt.verify(cipher, k)) result++;
                else continue;

       System.out.println(result);
	   
    }
}

interface Comparable{
    boolean compare (String c, String k);
}

interface Verifable{
    boolean verify (String c, String k);
}