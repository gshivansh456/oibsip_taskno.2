
import java.util.*;

class ATM{

    float bal;
    int pin=4567;
    public void checkpin()
    {
        System.out.println("enter the pin");
        Scanner sc = new Scanner(System.in);
        int enterpin=sc.nextInt();
        if(enterpin==pin)
        {
            menu();
        }
     else {
        System.out.println("enter a valid pin");
         }
        }
        

     public void menu()
     {
        System.out.println("enter your choice:");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Transfer Money");
        System.out.println("5. Exit");

        Scanner sc = new Scanner(System.in);
        int opt=sc.nextInt();

        if(opt==1){
        checkBalance();
        }

        else if(opt==2){
            WithdrawMoney();
        }

        else if(opt==3){
            DepositMoney();
        }

        else if(opt==4){
            TransferMoney();
        }
        else if(opt==5){
            return;
        }
        else{
            System.out.println("enter a valid choice");
        }
     }
    
    
     public void checkBalance(){
        System.out.println("Balance: " + bal);
        menu();
     }
     public void WithdrawMoney(){
        System.out.println("enter amount to withdraw");
        Scanner sc = new Scanner(System.in);
        float amount =sc.nextFloat();
        if(amount>bal){
            System.out.println("Insufficient balance");
        }
        else{
            bal=bal-amount;
            System.out.println("Money Withdraw Sucessfully");
        }
        menu();
     }
     public void DepositMoney(){
        System.out.println("enter the amount:");
        Scanner sc = new Scanner(System.in);
        float amount=sc.nextFloat();
        bal=bal+amount;
        System.out.println("Money Deposit Suceesfully");
        menu();
     }
     public void TransferMoney()
     {
          System.out.println("Enter the amount you want to transfer: ");   
          Scanner sc = new Scanner(System.in);
          float amount = sc.nextFloat();
          bal=bal-amount;
          System.out.println("The money has been transferred successfully.");
          menu();
     }
    }


public class ATMMACHINE{
    public static void main(String[] args){
    ATM obj = new ATM();
    obj.checkpin();
    }
}