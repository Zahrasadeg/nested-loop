import java.util.Scanner;

public class payment {
    public static void main(String[] args) {
        Scanner pay=new Scanner(System.in);
        System.out.println("please enter your item name");
        String item=pay.next();
        System.out.println("please enter the price of item");
        double price=pay.nextDouble();
        System.out.println("please enter your payment amount");
        double payment=pay.nextDouble();
        if(payment>price){
            System.out.println("here is your change "+(payment-price)+"$");
            System.out.println("thank you for your shopping");
        }
        else if(price>payment){
            System.out.println("your money is less than the price.please enter the second payment");
        }
        double secpayment=pay.nextDouble();
        System.out.println("your total payment is "+(payment+secpayment)+"$");
        if(payment+secpayment>price){
            System.out.println("here is your change "+((payment+secpayment)-price)+"$");
            System.out.println("thank you for your shopping");
        }



    }
}
