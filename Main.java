import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static boolean verify (String c, String k, Integer l) {
        for ( int y = 0; y < l; y++)
            if (c.charAt(y) == k.charAt(y)) return false;
            else continue;
        return true;
    }

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
        
        for (String k : keys)
            if (cip_len == k.length())
                if(verify(cipher, k, cip_len))
                    result++;

       System.out.println(result);
    }

}