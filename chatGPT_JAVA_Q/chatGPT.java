import java.util.Arrays;
import java.util.List;

public class JavaProb_Cgpt {
    public static void main(String[] args) {

        int arr[] = {22,43,54,23,34,21 ,22,43,34};

        int a=20,b=30;
        a= b+a; //a becomes 50
        b= a-b;
        a= a-b;
        System.out.println(a+" "+b);

        if (a%2 == 0) 
            System.out.println(a+"is even");
        else
        System.out.println(a+"odd");

        //2 . check no is prime :
        int n = 23;
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n%i==0) {
                isPrime = false;
                break;
            }
        }
         System.out.println("n is a prime number: "+isPrime);

         //3. find factorial of no.
         int num = 6;
         int k = fact(num);
         System.out.println(k);

         int fact = fact_Using_Loop(num);
         System.out.println("using loop "+fact);

         String str = "java";
         rev_String(str);

         //fibonassic series mean 0 1 1 2 3 5 8 13 21 34
         //formula = f(n) = f(n-1) f(n-2)
         int n1 = 7;
         for (int i = 0; i < n1; i++) {
            System.out.println(fibonassic(i)); // 0 pass check & 0 print  2nd 1 pass check n=1 print 1 so 0,1 3rd 2 pass check fab(2-1) 1 
         }

         //8 . largest no in the array: linear search:

         int max = l_Ele(arr);
         System.out.println("largest element in array is:"+max);


         //reverse an array
         rev_Array(arr);

         //string palindrome
         String str1 = "malayalam";
         Str_palindrome(str1);


         //#11 find the sum of element in java
         int sum = Sum_Of_Arr(arr);
         System.out.println("sum of an array is :"+sum);

         //12. find the second largest number in an array:
         Sec_Largest_Ele_In_Array(arr);

         //13. count the vowel in the string:
         Count_Vowel(str1);

         //14. find the GCD of two number:
        //gcd

    
        //15 .  find the Lcm of two number:
        int num1 = 22;
        int num2 = 42;
        int lcm = Lcm(num1 , num2);
        System.out.println(" lcm of two number is:"+lcm);


        //16. is string anagram mean: 

        //17. count the number of word in a string:
        String strs = "i'm learning java: ";  //op should be 3
        Word_In_String(strs);

        //18 find smallest element in the array:
        int min = Sml_Ele(arr);
        System.out.println("smallest element in array is:"+min);

        //19. remove duplicate element in the array
        Rm_Dupl_Ele(arr); //wip

        //20. array in ascending order:
        Asc_Order(arr);

        //21/. array in descending order:
        Desc_Order(arr);


        //22 add 2 array into 1:
        int [] arr1 = {22,33,43};
        int [] arr2 = {32,22,30};
        int [] arrss = Merge_Array(arr1, arr2);
        System.out.println();
        for (int i : arrss) {
            System.out.print(i+" ");
        }



        //23 . find the intersaction of two array:
        // System.out.println("\nthe intersection is:");
        // for (int i : Inter_Sec(arr1, arr2)) {
        //     System.out.println(i+" ");
        // }

        //24.find union of an array:


        System.out.println();
        //25.check leap year or not:
        Check_Leap(2002);


        //26.convert  decimal to binary:
        System.out.println();
        DecimalToBinary(13);


        //27.find the power of a number:


         //end main()
    }


    public static int fact(int n){
        if(n==0)
        return 1;
        else
        return n*fact(n-1);
    }
    public static int fact_Using_Loop(int n){
        int fact=1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void rev_String(String str){
        String rev = " ";
        for (int i = str.length()-1; i>= 0 ; i--) 
            rev = rev+ str.charAt(i);
        System.out.println(rev);
    }

    //fibonassic series mean firt 2 term sum of two term is third term
    public static int fibonassic(int n){
        if (n<=1) 
        return n;
        else
        return fibonassic(n-1)+ fibonassic(n-2);
    }
    
    //largest element in array:
    public static int l_Ele(int arr[]){
        int max = arr[0];
         for(int array : arr)
         if (array > max) 
         max = array;
         return max;
    }
    
    //reverse an array 
    public static void rev_Array(int[] array){
        int start = 0;
        int end = array.length-1;
        for (int i = 0 , j = end; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        System.out.println("reverse array"+Arrays.toString(array));
    }

    
    //string palindrome 
    public static void Str_palindrome (String str){
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(rev) ? "palindrome" : "not palindrome");
        
    }

    public static int Sum_Of_Arr(int[] array){
        int sum = 0; 
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        return sum;
    }

    //12 find 2nd largest number in an array:
    public static void Sec_Largest_Ele_In_Array(int[] arr){
        Arrays.sort(arr);
        //int sl = arr[arr.length-2];
        for (int i : arr) {
            System.out.print(" "+i);
        }
        System.out.println("\n"+arr[arr.length-2]);
    }

    //13 count the number of vowel in string:
    public static void Count_Vowel(String vowel){
        int count = 0,i;
        for (i = 0; i < vowel.length(); i++) {
            if(vowel.charAt(i) == 'a' || vowel.charAt(i) == 'e' || vowel.charAt(i) == 'i' || vowel.charAt(i) == 'o' || vowel.charAt(i) == 'u'){
                count++;
            }
        }
        System.out.println("the vowel is:"+count);  
    }

    public static int Lcm(int num1 , int num2){
        int lcm = 0;
        for (int i = 0; i < num1*num2; i++) {
            if(i%num1 == 0 && i%num2 == 0){
                lcm = i;
            }
        }
        return lcm;
    }

    //check string is a Anagram:
    public static void Anagram_Str(String ang){


    }

    //count how many word in the string:
    public static void Word_In_String(String str){
        String[] words = str.split("\\s+");
        System.out.println("the word in string is :"+words.length);
    }

    //find smallest element in the array
    public static int Sml_Ele(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }

    //remove duplicate from array:
    public static void Rm_Dupl_Ele(int[] arr) {
        //wip

    }

    //sort an array in ascending order using for loop
    public static void Asc_Order(int[] arr){
        int temp;
        for(int i =0; i<arr.length; i++){
            for(int j= i+1; j<arr.length; j++){
                if (arr[i]>arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }

        }
        System.out.println("array in ascending order is:");
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }

    //sort an array in descending order:
    public static void Desc_Order(int arr[]){
        int temp;
        int n= arr.length;
        for(int i=0; i<n; i++){
            for(int j=0; j< n-i-1; j++){
                if(arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("\narray in descending order is:");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //merge 2 array into 1:
    public static int[] Merge_Array(int[] arr1, int[] arr2){
        int [] arr = new int[arr1.length+arr2.length];
        System.arraycopy(arr1, 0, arr, 0, arr1.length);
        System.arraycopy(arr2, 0, arr, arr1.length, arr2.length);
        return arr;

    }

    //intersection in 2 array:
    // public static int [] Inter_Sec(int[] arr1, int[] arr2){
    //     for (int i = 0; i < arr2.length; i++){
    //         for (int j = 0; j < arr2.length; j++) {
    //             if (arr1[i] == arr2[j]) {
    //                 return 
    //             }
    //         }
    //     }
    //     return arr1;
    // }

    // //find the union of two arrays:
    // public static int[] Find_Union(int[] arr1 , int[] arr2){
    //     int [] arr = new int[arr.length + arr2.length];
    //     for(int i =0; i<arr.length; i++){
    //         arr[i] = arr1[i];
    //     }
    //     for(int i =0; i<arr2.length; i++){
    //         arr[arr1.length] = arr2[i];
    //     }
    //     System.out.println("Union of two array is:");
    //     for(int i=0; i<arr.length; i++)
    //         System.out.println(arr[i]+" ");

    // }


    //check if year is leap year
    public static void Check_Leap(int year){
        if(year%4 == 0 )
        System.out.println(year+":is a leap year");
        else 
        System.out.println(year+":`not a leap year");
    }


    public static void DecimalToBinary(int dec){ //13 
        int DTB = 0; //  
        int base =1;  
        while (dec>0) {  //13 > 0 
            int rem = dec%2; //13 % 2 = 1  
            DTB += rem*base; //DTB = 1*1 = 1
            dec = dec/2; //13/2 = 6 
            base *= 10; //1*10 = 10  
            //reminder stored 1 now  now if rem is 1 then dbt becomes 1 now decbstored 6 now base = 10
        }
        System.out.println(DTB);
    }

    //end class:

}
