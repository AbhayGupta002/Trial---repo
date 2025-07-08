class Pattern{
    public static void upperLeftAngle (int n){
        for (int i = 0; i <= n; i++){
            for(int j = i; j <= n; j++)
               System.out.print("* ");
            System.out.println();
        }
    }

    public static void leftAnglePattern(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++)
            System.out.print("* ");
            System.out.println();
        }
    }

    public static void rightAnglePattern(int n){
        //we have to print 4 sapce then once a *, then 3 times space or 2 times star, then 2 times space &
        //3 times star 1 time space & 4 time star
    
        System.out.println();
        for(int i = 0; i <= n; i++){  
            for(int j = i; j< n; j++){
            System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
            System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class FAANG {

    public static void main(String[] args) {
        Pattern patt = new Pattern();
        patt.upperLeftAngle(5);
        patt.leftAnglePattern(7);
        patt.rightAnglePattern(5);
    }
}
