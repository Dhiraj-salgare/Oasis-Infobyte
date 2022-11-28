//program for online examination
import java.util.Timer;
import java.util.TimerTask;
import java.time.LocalDateTime;
import java.time.format.*;

import javax.lang.model.util.ElementScanner14;
import javax.lang.model.util.ElementScanner6;

import java.util.Scanner;

class exam
{
    static String name;
    String username;
	String Username;
	String Password;
    String password;
    static String prn;
    static int count=0;
    char ch;
    

    public void register()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the name::");
        name=sc.nextLine();

        System.out.print("enter the username::");
        username=sc.nextLine();

        System.out.print("enter the password:");
        password=sc.nextLine();

        System.out.print("enter the prnno:");
        prn=sc.nextLine();

        System.out.print("\n\n****** congrates your regestrationn is completed!***********");
    }

    public void login()
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
                    System.out.print("enter the password::");
                     Password=sc.nextLine();
                    if(password.equals(Password))
                    {
                        System.out.print("login successfully");

                    }
                    else
                    {
                        System.out.print("enter the correct password!");
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

    public void update()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the name::");
        name=sc.nextLine();

        System.out.print("enter the username::");
        username=sc.nextLine();

        System.out.print("enter the password::");
        password=sc.nextLine();

        System.out.print("enter the prnno:");
        prn=sc.nextLine();
    }


    public void startquize()
    {
        int ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\n/********* quize*************/");
        System.out.println("1. Who is the father of C language?");
        System.out.println("a) Steve Jobs\nb) James Gosling\nc) Dennis Ritchie\nd) Rasmus Lerdorf");
        System.out.println("enter choice::");
        ch=sc.next().charAt(0); ;

        if(ch=='c'||ch=='C')
        {
             count++;
        }
        System.out.println("-----------------------------------------------------------------------------------------------------");
        
        System.out.println("2. Which of the following is not a valid C variable name?");
        System.out.println("a) int number;\nb) float rate;\nc) int variable_count;\nd) int $main;");
        System.out.println("enter choice::");
        ch=sc.next().charAt(0); ;

        if(ch=='d'||ch=='D')
        {
             count++;
        }
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("3. Which of the following is true for variable names in C?");
        System.out.println("a) They can contain alphanumeric characters as well as special characters\nb) It is not an error to declare a variable to be one of the keywords(like goto, static)\nc) Variable names cannot start with a digit\nd) Variable can be of any length");
        System.out.print("enter choice::");
        ch=sc.next().charAt(0); ;
        if(ch=='c'||ch=='C')
        {
             count++;
        }
       
         System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("4. Which of following is not accepted in C?");
        System.out.println("a) static a = 10; //static as\nb) static int func (int); //parameter as static\nc) static static int a; //a static variable prefixed with static\nd) all of the mentioned");
        System.out.print("enter choice::");
        ch=sc.next().charAt(0); ;

        if(ch=='c'||ch=='C')
        {
             count++;
        }
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("5. Property which allows to produce different executable for different platforms in C is called?");
        System.out.println("a) File inclusion\nb) Selective inclusion\nc) Conditional compilation\nd) Recursive macros");
        System.out.print("enter choice::");
        ch=sc.next().charAt(0); ;

        if(ch=='c'||ch=='C')
        {
             count++;
        }
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("6.What is #include <stdio.h>?");
        System.out.println("a) Preprocessor directive\nb) Inclusion directive\nc) File inclusion directive\nd) None of the mentioned");
        System.out.print("enter choice::");
        ch=sc.next().charAt(0); ;

        if(ch=='a'||ch=='A')
        {
             count++;
        }

        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("7.Which of the following are C preprocessors?");
        System.out.println("a) #ifdef\nb) #define\nc) #endif\nd) all of the mentioned");
        System.out.print("enter choice::");
        ch=sc.next().charAt(0); ;

        if(ch=='d'||ch=='D')
        {
             count++;
        }

        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("8.What is the sizeof(char) in a 32-bit C compiler?");
        System.out.println("a) 1 bit\nb) 2 bits\nc) 1 Byte\nd) 2 Bytes");
        System.out.print("enter choice::");
        ch=sc.next().charAt(0); ;

        if(ch=='c'||ch=='C')
        {
             count++;
        }

        System.out.println("-----------------------------------------------------------------------------------------------------");
       
        System.out.println("9.scanf() is a predefined function in______header file.");
        System.out.println("a) stdlib. h\nb) ctype. h\nc) stdio. h\nd) stdarg. h");
        System.out.print("enter choice::");
        ch=sc.next().charAt(0); ;

        if(ch=='c'||ch=='C')
        {
             count++;
        }
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("10.Which of the following cannot be a variable name in C?");
        System.out.println("a) volatile\nb) true\nc) friend\nd) export");
        System.out.print("enter choice::");
        ch=sc.next().charAt(0); ;

        if(ch=='a'||ch=='A')
        {
             count++;
        }
        System.out.println("-----------------------------------------------------------------------------------------------------");


    

    }

   public void logout()
    {
        System.exit(0);
    }

    public static void display()
    {
        System.out.println("\n\n***********    Score card     ******************* "+java.time.LocalDateTime.now());
        System.out.println("----------------------------------------------------------------------");
          System.out.println("name:"+name+"\nprn no:"+prn+"\nscore:"+count);
    }





}

class TimerDemo extends exam
{  
Timer timer = new Timer();  
TimerDemo(int seconds)   
{  

//schedule the task  
timer.schedule(new RemindTask(), seconds*1000);   
}  
class RemindTask extends TimerTask   
{  
public void run()   
{  
    exam r=new exam();
 System.out.println("\n\n-----------------------------------------------------------------------------------");
 
  r.display();

System.out.println("your test is submitted!\n-----------------------------------------------------------------"); 
//terminate the timer thread 


timer.cancel(); 
r.logout();  

}  
}  
}


class onlineexam
{

    public static void main(String args[])
    {
       
       Scanner sc=new Scanner(System.in); 
       int r,v;
       do{
        System.out.println("****** welcome to online exam*********");
        System.out.println("1.registration\n2.exit");
        System.out.print("enter the choice::");
         r=sc.nextInt();

        exam e=new exam();

        if(r==1)
        {
           e.register();

           System.out.println("\n\n1.login\n2.exit");
           System.out.print("enter the choice::");
           int m=sc.nextInt();
           if(m==1)
           {
            e.login();
           do
           {
            System.out.println("\n\nwelcome  "+e.name);
            System.out.println("\n\n1.Start quize\n2.update profile and password\n3.logout");
            System.out.print("enter the choice::");
             v=sc.nextInt();
            
            switch(v)
            {
                case 1:
                new TimerDemo(30);
                e.startquize();
                e.display();
                e.logout();
                break;

                case 2:
                e.update();
                System.out.println("profile is updated sucessfully");
                
                System.out.println("\n\n1.login\n2.exit");
                System.out.println("enter the choice::");
                int d=sc.nextInt();
                if(d==1)
                {
                    e.login();
                    System.out.println("1.Start quize\n2.update profile and password\n3.logout");
                    System.out.print("enter the choice::");
                    int q=sc.nextInt();
                    
                    if(q==1)
                    {
                        e.startquize();
                        e.display();
                    }
                    else if(q==2)
                    {
                        e.update();
                    }
                    else
                    {
                        e.logout();
                    }
                    
                }
                break;

                case 3:
                e.logout();
                break;


            }
            

           }
           while(v!=3);

        }
        else 
        {
           System.exit(0);   
        }

    }
}
while(r!=2);
    }
}

