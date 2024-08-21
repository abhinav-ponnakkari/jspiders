import java.util.Scanner;
public class Atm
{
    public static void main (String[] args)
    {
        int main_bal=1000;
        Scanner ip=new Scanner(System.in);
        System.out.println("enter the card no:");
        int cardno=ip.nextInt();
        System.out.println("enter the pin:");
        int pin=ip.nextInt();
        if(cardno==123456 && pin==1234)
        
        {            
            System.out.println("welcome");
            System.out.println("d for deposit");
            System.out.println("w for withdraw");
            System.out.println("c for check balance");
            System.out.println("enter other charactert to cancel");

            char inn = ip.next().charAt(0);
            
            switch(inn)
            {
                case 'd':System.out.println("enter the deposit amount");
                        int dep_amount =ip.nextInt();
                        main_bal=main_bal+dep_amount;
                        System.out.println("your balance is "+main_bal);
                        break;
                case 'w':System.out.println("enter the amount to withdraw");
                       int widraw_amount= ip.nextInt();
                       if(widraw_amount>main_bal)
                       {
                        System.out.println("insufficient balance");
                       }
                       else
                       {
                        main_bal=main_bal-widraw_amount;
                        System.out.println("your balance is "+main_bal);
                       }
                       if(widraw_amount<0)
                       {
                        System.out.println("enter a valid number");

                       }
                       break;
                case 'c':System.out.println("balance is:"+main_bal+"");
                         break;
                default:
                       System.out.println("thank you");
                       break;
            }
        }
        
        else
        {
            System.out.println("invalid Authentication");

        }   
        


    }
}
