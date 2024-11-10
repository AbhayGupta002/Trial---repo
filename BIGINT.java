#define this code is used for very long integer:
#task ..update it into take as a user input;
import java.math.BigInteger;

public class BigIntegerExample {
    public static void main(String[] args) {
        // Creating BigInteger from a string
        BigInteger bigInt = new BigInteger("1234567890123456789012345678901234567890");
        //Example of adding another big integer
        BigInteger anotherBigInt = new BigInteger("987654321098765432109876543210987654443210");
        BigInteger sum = bigInt.add(anotherBigInt);
        // Output the result
        System.out.println("The sum is: " + sum);
    }
}

