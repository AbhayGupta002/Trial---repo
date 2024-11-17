import java.util.*;
public class MagicCodeAge_GussingNumber{
   public static void main(String args[]){
    for( ; ; ){
      System.out.println("enter the number:1 to 9:\t");
      Scanner sc = new Scanner(System.in);
      int number = sc.nextInt();
      System.out.println("enter the year of Birth:");
      int YearOfBirth = sc.nextInt();
      if(number >1 && number <= 9){
        number = number * 2;
        number = number+ 5;
        number = number * 50;
        number = number + 1774;
        number = number - YearOfBirth;
        System.out.println(" "+number);
        break;
      }
    }
  }
