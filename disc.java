/*
 MURIGA CALVINS MIKWAYA
 J77-10564-2024
 A PROGRAM TO COMPUTE DISCOUNT ON PURCHASED AMOUNT
 */



import java.util.Scanner;
public class Discount{
public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    double discount,amount,amountToPay;

//PROMPT USER TO ENTER NAME
System.out.println("Enter  Your Name:");
String name = scanner.nextLine(); 

    //PROMPT USER TO ENTER AMOUNT
    System.out.println("Enter the amount purchased:");
    amount=scanner.nextDouble();

    if(amount>5000){
        discount=amount*0.1;
    }
    else if(amount>=1000 && amount<=5000){
        discount=0.05*amount;
    }
else{
    discount=0;

}
amountToPay = amount-discount;

//OUTPUTS
System.out.println("Initial amouunt:" + amount);
System.out.println("discount:" + discount);
System.out.println("amount to pay :" + amountToPay);
}

}



