import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter two numbers star and end number");
        int start = scan.nextInt();
        int end = scan.nextInt();
        System.out.println("star "+start+" end"+end);

        int evenSum=0;
        int oddSum=0;

        for (int i = start; i <=end ; i++) {
            if(i%2==0){
                evenSum+=i;
            }else{
                oddSum+=i;
            }
        }
        System.out.println("sum of the even numbers "+evenSum);
        System.out.println("sum of the odd numbers "+oddSum);

            }

        }


