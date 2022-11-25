//program for atm interface

import java.util.Scanner;

class register
{
    String name;
    String username;
	String Username;
	String Password;
    String password;
    String accoNO;
    int transaction=0;
    String Transactionhistory="";
    float balance=100000;

    public void regi()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name::");
        name=sc.nextLine();

        System.out.println("enter the username::");
        username=sc.nextLine();

        System.out.println("enter the password::");
        password=sc.nextLine();

        System.out.println("enter the bvank account number::");
        accoNO=sc.nextLine();

        System.out.println("****** congrates your regestrationn is completed!***********");
    }
}
   class login extends register
   {
    public void log()
    {
        Scanner sc=new Scanner(System.in);
        do 
        {
            System.out.println("enter the username::");
            Username=sc.nextLine();

            if(Username.equals(username))
            {
                do
				{
                    System.out.println("enter the password::");
                     Password=sc.nextLine();
                    if(password.equals(Password))
                    {
                        System.out.println("login successfully");

                    }
                    else
                    {
                        System.out.println("enter the correct password!");
                    }
                }
				while((password.equals(Password))==false);
                
            
            }

            else
            {
                System.out.println("enter the valid username!");
            }
        }
        while((Username.equals(username))==false);
    }
}
   //for withdraw

   class withdraw extends login
   {
    public void withdr()
    {
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount to withdraw::");
        float amount=sc.nextFloat();

        if(amount<=balance)
        {
            transaction++;
            balance=balance-amount;
            System.out.println("withdraw successfully");
            String str=amount+"rs withdrawed\n";
            Transactionhistory=Transactionhistory.concat(str);

        }
        else
        {
            System.out.println("insufficient balance");
        }
    }
}
   
    //for deposite
    class deposite extends withdraw
    {
    public void deposit()
    {
        System.out.print("\nEnter amount to deposit - ");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();

        if(amount<=100000)
        {
            transaction++;
            balance=balance+amount;
            System.out.println("amount deposited successfully");
            String str=amount+"rs deposited\n";
            Transactionhistory=Transactionhistory.concat(str);

        }

    else
    {
        System.out.println("sorry... limit is 100000");
    }
    }
}
  
  //for transfer
  class trans extends deposite
  {
    public void transfer()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the racepient name::");
        String receipent=sc.nextLine();
        System.out.println("enter the amount to transfer::");
        float amount=sc.nextFloat();
        if(balance>=amount)
        {
            if(amount<=5000)
            {
            transaction++;
             balance=balance- amount;
             System.out.println("amount is transfered to recepient to"+receipent+"\n");
			 String str = amount + " Rs transfered to " + receipent + "\n";
             Transactionhistory = Transactionhistory.concat(str);
            }
            else {
                System.out.println("\nSorry...Limit is 5000.00");
            }
        }
      else
      {
        System.out.println("\nInsufficient Balance");
      }
    }
}

    //for cheak balance

    class check extends trans
    {
    public void checkBalance() 
    {
		System.out.println("\n available balance::" + balance + " Rs");
	}
    }

    //transiction history
    class tranhis extends check
    {
    public void transHistory() {
		if ( transaction == 0 ) {
			System.out.println("\nEmpty");
		}
		else {

			System.out.println("\n" + Transactionhistory);
		}
    }






}
   
    
 class atminterface
 {
    public static void main(String args[])
    {
		
        tranhis b=new tranhis();
        Scanner sc=new Scanner(System.in);
        System.out.println("\n*************  WELCOME TO IDBI ATM  ***********\n");
        
        System.out.println("enter the choice::\n1.Register\n2.exit");
        int choice=sc.nextInt();
        int s;
        if(choice==1)
        {
            
            b.regi();

            System.out.println("\n1.login\n2.exit");
            System.out.println("enter the choice::");
            int ch=sc.nextInt();

            if(ch==1)
            {
              b.log();
              System.out.println("\n******welcome back******"+b.name);

              do
              {
              System.out.println("\n1.Withdraw \n2.Deposit \n3.Transfer \n4.Check Balance \n5.Transaction History \n6.Exit");
							System.out.print("\nEnter Your Choice - ");
							 s = sc.nextInt();
                            switch(s) {
								case 1:
								b.withdr();
								break;
								case 2:
								b.deposit();
								break;
								case 3:
								b.transfer();
								break;
								case 4:
								b.checkBalance();
								break;
								case 5:
								b.transHistory();
								break;
								case 6:
							    break;
                                
                            }
                        }
                        while(s!=6);
            }
            else
            {
                System.exit(0);
            }
        }
        else
        {
            System.exit(0);
        }
        




        }
    

        

    }
