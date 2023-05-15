import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Hash256Code {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //Scanner sc = new Scanner(System.in);
        //String  s = sc.next();
        printSHA("HelloWorld");
        System.out.println("872e4e50ce9990d8b041330c47c9ddd11bec6b503ae9386a99da8584e9bb12c4");
        System.out.println();
        printSHA("Javarmi123");
        System.out.println("f1d5f8d75bb55c777207c251d07d9091dc10fe7d6682db869106aacb4b7df678");
        System.out.println();
        printSHA("K1t4fo0V");
        System.out.println("0a979e43f4874eb24b740c0157994e34636eed0425688161cc58e8b26b1dcf4e");
        System.out.println();
        printSHA("yxPX0fbIKHvjHo180");
        System.out.println("074690988f8d3e8e45840f7502efd2edde63a88c299a88e0923e7ed4abec1835");
        System.out.println();

    }

    public static void printSHA(String s) {
        try {
            System.out.println(toHexString( getSHA( s ) ) );
        } catch (NoSuchAlgorithmException e) {
            System.out.println( e );
        }
    }

    public static byte[ ] getSHA( String input ) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance( "SHA-256" );
        return md.digest( input.getBytes( StandardCharsets.UTF_8 ) );
    }

    public static String toHexString( byte[ ] hash ) {
        BigInteger number = new BigInteger( 1, hash );
        StringBuilder hexString = new StringBuilder( number.toString( 16 ) );
        while ( hexString.length( ) < 64 ) {
            hexString.insert( 0,  "0" );
        }
        return hexString.toString();
    }
}
