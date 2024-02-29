/* This is a static type  and works properly in the given account and corresepondent password . There is total 2 accounts and 
    passwords are mentioned. */

import java.util.Scanner;
public class AtmManagement{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //initializing the both account number and its passwords
        int accoutnumber1= 11220120;
        int password1= 123456;
        int accoutnumber2= 11220121;
        int password2= 1234566;
        int acc , pass;

        while(true){
        System.out.println("\n \n");
        System.out.print("\n Enter the account number: ");
        acc= sc.nextInt();
        System.out.print("\n Enter the password of your account: ");
        pass= sc.nextInt();

        if((acc==accoutnumber1 && pass==password1 )|| (acc==accoutnumber2 && pass==password2)){

            //total amount in both account
          String accountbalace1= "$500000";
          String accountbalace2 = "$600000";

          //options 
            System.out.println("welcome to your accout . Chosse an option among them");
            System.out.println("_____________The Options____________");
            System.out.println("Option-1: View the total balance");
            System.out.println("Option-2: Add in balance");
            System.out.println("Option-3: Withdraw some money");
            System.out.println("Option-4: Exit");

          //chossing option
            System.out.print("\n Enter your choice (1-4): ");
           int  option= sc.nextInt();

           //condition for each option for accout 1 
           if(acc==accoutnumber1){
            if (option==1){
                System.out.print("\n Your main account balance is : "+accountbalace1);
            }
            if(option==2){
                System.out.print(" \n Your main account balance is : "+accountbalace1);
                System.out.print(" \n Enter the amount you want to add: ");
                int amount1= sc.nextInt();
                if(amount1<0){
                    System.out.print("Enter a positive amount to add in your account . Operate it again please.");
                }
                else{
                int accbalance1= 500000;
                int total1= accbalance1+ amount1;
                System.out.print("\n After adding the total balance is : "+"$"+total1);
            }
            }
            else if(option==3){
                System.out.print(" \n Your main account balance is : "+accountbalace1);
                System.out.print("\n Enter the amount you want to withdraw: ");
                int withdraw1= sc.nextInt();
               int accbalance1= 500000;
               if (withdraw1<0){
                System.out.print("\n Enter a positive amount to withdraw. Operate it again please.");
               }
               if(withdraw1<=accbalance1){
                int left1= accbalance1- withdraw1;
                System.out.print("\n After withdraw the total money left in your account is : "+ "$"+left1);
               }
               else if(withdraw1==accbalance1){
                System.out.print("\n You can't withdraw all the money. Operate it again please. ");
               }
               else{
                System.out.print("\n You are entering the amount which is greater than your main account balance. You can't withdraw this amount of  money .");
               }
               
            }
            else{
                System.out.println("Thanks for chossing our service .Hope you a beautiful banking facilities. \n If you don't have any futher operation then you can exit and give another one a fair option to have the facilities. ");
            }
           }

         // condition for each option for accout 2 
          else{
            if (option==1){
                System.out.print("\n Your main account balance is : "+accountbalace2);
            }
            if(option==2){
                System.out.print("\n Your main account balance is : "+accountbalace2);
                System.out.print("\n Enter the amount you want to add: ");
                int amount2= sc.nextInt();
                if (amount2<0){
                    System.out.print("Enter a positive amount for adding in main account. Operate it again please. ");
                }
                else{
                int accbalance2= 600000;
                int total2= accbalance2+ amount2;
                System.out.print("\n After adding the total balance is : "+"$"+total2);
                }
            }
            else if(option==3){
                System.out.print("\n Your main account balance is : "+accountbalace2);
                System.out.print("\n Enter the amout you want to withdraw: ");
                int withdraw2= sc.nextInt();
                int accbalance2= 600000;
               if(withdraw2<0){
                System.out.print("\n Enter a positive amount for withdraw.Operate it again please.");
               }
               if(withdraw2<=accbalance2){
                int left2= accbalance2- withdraw2;
                System.out.print("\n After withdraw the total money left in your account is : "+ "$"+left2);
               }
               else if(withdraw2==accbalance2){
                System.out.print("\n You can't withdraw all the money. Operate it again please. ");
               }
               else{
                System.out.print("\n You are entering the amount which is greater than your main account balance.You can't withdraw this amount of  money .");
               }
               
            }
            else{
                System.out.print("Thanks for chossing our service .Hope you a beautiful banking facilities. \n If you don't have any futher operation then you can exit and give another one a fair chance to have the facilities. ");
            }
           }
        }
        else{
                System.out.println("Correct your mistake or inform your problem to the authorities");
        }
    }
  }
}
