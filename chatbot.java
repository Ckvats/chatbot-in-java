import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
import javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction;

public class chatbot {
    public static void main(String[] args) throws MalformedURLException{
        int i=0;
        Scanner sc = new Scanner(System.in);
        chatbot c = new chatbot();
        do
        {
           System.out.println("Hi i am Chotu your guide for today");
           String s1 = sc.nextLine();
           System.out.println("Do you want me to suggest you some food items according to your mood");
           System.out.println("(y/n)");
         
        char m = sc.next().charAt(0);
           if(m=='y')
           {
            System.out.println("Tell me how you are feeling today. By choosing the given option below:-");
            System.out.println("1. Happy");
            System.out.println("2. Depressed");
            System.out.println("3. Normal");
            System.out.println("4. Fun");
            int option1 = sc.nextInt();
           
           switch(option1)
           {
            case 1:
            System.out.println("Well i am happy that you are in a Happy mood");
            System.out.println("Below are the list of some food you can have in this mood");
            c.good();
            System.out.println("Do you want to know the name of outlet where you can find your Dish ");
            System.out.println("(y/n)");
            char c2 =sc.next().charAt(0);
            if(c2=='y')
            {
               System.out.println("The name of the outlets are according to their ranking which is based on their reviews");
               c.loc();
            } 
            else{
                System.out.println("We hope you will find your fodd outlet");
            }
            System.out.println("Do you want to order food you can pick it after:");
            System.out.println("(y/n)");
            char t = sc.next().charAt(0);
            if(t=='y')
            {
                c.order();
            }
            else
            {
                System.out.println("Thankyou for using our services");
            }
            System.out.println("Well do you find them helpful");
            System.out.println("(y/n)");
            char v3 = sc.next().charAt(0);
            if(v3=='y')
            {
                System.out.println("Thanks for your feedback");
            }
            else{
                System.out.println("Sorry! if do not match your expectations");
            }
            URL myUrl = new URL("https://www.zomato.com/");
            System.out.println("If you want more options you can click on this link:- "+myUrl);
            i=1;
            break;
            case 2:
            System.out.println("Well i am little concerned about your condition");
            System.out.println("You can have these food items in this condition");
            c.bad();
            System.out.println("Do you want to know the name of outlet where you can find your Dish ");
            System.out.println("(y/n)");
            char c3 =sc.next().charAt(0);
            if(c3=='y')
            {
                System.out.println("The name of the outlets are according to their ranking which is based on their reviews");
                c.locbad();
                

            } 
            else{
                System.out.println("We hope you will find your fodd outlet");
            }
            System.out.println("Do you want to order food you can pick it after:");
            System.out.println("(y/n)");
            char t1 = sc.next().charAt(0);
            if(t1=='y')
            {
                c.order();
            }
            else
            {
                System.out.println("Thankyou for using our services");
            }
            System.out.println("Well do you find them helpful");
            System.out.println("(y/n)");
            char v2 = sc.next().charAt(0);
            if(v2=='y')
            {
                System.out.println("Thanks for your feedback");
            }
            else{
                System.out.println("Sorry! if do not match your expectations");
            }
            URL myUrl1 = new URL("https://www.zomato.com/");
            System.out.println("If you want more options you can click on this link:- "+myUrl1);
            i=1;
            break;
            case 3:
            System.out.println("Well it's good that you are in this mood");
            System.out.println("You can have the below items:");
            c.normal();
            System.out.println("Do you want to know the name of outlet where you can find your Dish ");
            System.out.println("(y/n)");
            char c4 =sc.next().charAt(0);
            if(c4=='y')
            {
                System.out.println("The name of the outlets are according to their ranking which is based on their reviews");
               c.locnormal();
            } 
            else{
                System.out.println("We hope you will find your food outlet");
            }
            System.out.println("Do you want to order food you can pick it after:");
            System.out.println("(y/n)");
            char t2 = sc.next().charAt(0);
            if(t2=='y')
            {
                c.order();
            }
            else
            {
                System.out.println("Thankyou for using our services");
            }
            System.out.println("Well do you find them helpful");
            System.out.println("(y/n)");
            char v4 = sc.next().charAt(0);
            if(v4=='y')
            {
                System.out.println("Thanks for your feedback");
            }
            else{
                System.out.println("Sorry! if do not match your expectations");
            }
            URL myUrl3 = new URL("https://www.zomato.com/");
            System.out.println("If you want more options you can click on this link:- "+myUrl3);
            i=1;
            break;
            case 4:
            System.out.println("Well i am also in fun mood today");
            System.out.println("Let's enjoy the below items:");
            c.Fun();
            System.out.println("Do you want to know the name of outlet where you can find your Dish ");
            System.out.println("(y/n)");
            char c5 =sc.next().charAt(0);
            if(c5=='y')
            {
              System.out.println("The name of the outlets are according to their ranking which is based on their reviews");
              c.locfun();
            } 
            else{
                System.out.println("We hope you will find your food outlet");
            }
            System.out.println("Do you want to order food you can pick it after:");
            System.out.println("(y/n)");
            char t5 = sc.next().charAt(0);
            if(t5=='y')
            {
                c.order();
            }
            else
            {
                System.out.println("Thankyou for using our services");
            }
            System.out.println("Well do you find them helpful");
            System.out.println("(y/n)");
            char v1 = sc.next().charAt(0);
            if(v1=='y')
            {
                System.out.println("Thanks for your feedback");
            }
            else{
                System.out.println("Sorry! if do not match your expectations");
            }
            URL myUrl4 = new URL("https://www.zomato.com/");
            System.out.println("If you want more options you can click on this link:- "+myUrl4);
            i=1;
            break;
            default:
            System.out.println("OH! no start again and plase enter the correct option this time");
            System.out.print("Do you want to start again :");
            System.out.println("(y/n)");
            char s =sc.next().charAt(0);
            if(s=='y')
            {
                i=0;
            }
            else{
                 System.out.println("Thanks for our services");
                 URL myUrl5 = new URL("https://www.zomato.com/");
                 System.out.println("If you want more options you can click on this link:- "+myUrl5);
                 i=1;
            }
          
           
            break;
            
           
           }
        }
        
        
        else{
        System.out.println("Well then tell us what do you want: ");
        
        sc.nextLine();
        String Dish = sc.nextLine();
       
        String s[] = {"Gulab Jamun","Rasmalai","Kaju Katli","Chole Bhature","Paneer Lababdar","Chilly Paneer","Brownie","Dark Choclate","Waffles","Fruits","Panner Parantha","Lachha Parantha","Tea","Panner Butter Masala","Churma","Lassi","Rabdi Jalebi","Kesar Milk","Beer","Whiskey","having Date Night with Russian"};
        if(Arrays.asList(s).contains(Dish))
       {
        int l =Arrays.asList(s).indexOf(Dish);
        System.out.println("Yes we have "+Dish);
        System.out.println("Do you want to know the name of outlet where you can find: "+Dish);
        System.out.println("(y/n)");
        char c1 = sc.next().charAt(0);
        if(c1=='y')
        {
            System.out.println("The name of the outlets are according to their ranking which is based on their reviews");
          if(l==2 || l==9 || l==15 || l==21)
          {
            System.out.println("It is availabel at the following outlets:");
            String s11[] = {"NK.","KITCHEN ETTE","Tandori Hub"};
            for(int g=0;g<s11.length;g++)
            {
                System.out.println((g+1)+"."+s11[g]);
            }
          }
          else if(l==1 || l==10 || l==16 || l==20)
          {
            System.out.println("It is availabel at the following outlets:");
            String s11[] = {"OVEN XPRESS","KITCHEN ETTE","Tandori Hub","TALK OF TOWN"};
            for(int g=0;g<s11.length;g++)
            {
                System.out.println((g+1)+"."+s11[g]);
            }
          }
          else if(l==3 || l==14 || l==18 || l==12)
          {
            System.out.println("It is availabel at the following outlets:");
            String s11[] = {"OVEN XPRESS","VRINDAVAN","Tandori Hub","TALK OF TOWN","BANGALI BAVARCHI"};
            for(int g=0;g<s11.length;g++)
            {
                System.out.println((g+1)+"."+s11[g]);
            }
          }
          else{
            System.out.println("It is availabel at the following outlets:");
            String s11[] = {"OVEN XPRESS","KITCHEN ETTE","Tandori Hub","TALK OF TOWN","LOVELY SWEETS"};
            for(int g=0;g<s11.length;g++)
            {
                System.out.println((g+1)+"."+s11[g]);
            }
          }
        }
        else{
            System.out.println("We hope you will find the location of your food outlet");
        }
        System.out.println("Do you want to order food you can pick it after:");
        System.out.println("(y/n)");
        while(true){
        char t = sc.next().charAt(0);
        if(t=='y')
        {
            
            // int p;
            // System.out.println("Tell me the dish number you want to order");
            // int a = sc.nextInt();
            System.out.println("Tell us the quantity of your dish ");
            int b = sc.nextInt();
            // if(a==1 || a==3 || a==7)
            // {
            //     p=90;
            //     System.out.println("Total Price :"+b+"*"+p+"="+b*p);
            // }
            // else if(a==2||a==6||a==4)
            // {
            //     p=100;
            //     System.out.println("Total Price :"+b+"*"+p+"="+b*p);
            // }
            // else{
            //     p=95;
            //     System.out.println("Total Price :"+b+"*"+p+"="+b*p);
            // }
        System.out.println("Total Price :"+b+"*90"+"="+b*90);
        System.out.println("Do you want to conform your order: ");
        System.out.println("(y/n)");
        int k = 150;
        while(true)
        {
        char f = sc.next().charAt(0);
        if(f == 'y')
        {
      System.out.println("Your token number is: "+(k+b));
      LocalDateTime time2 = LocalDateTime.now();
      System.out.println("Your order recieved at: "+time2.getHour()+" hour "+time2.getMinute()+" minute");
    //   System.out.println("\nbefore formating\n" +time2);
    if(time2.getMinute()<40)
    {
     System.out.println("Your Order Will be ready at: "+time2.getHour()+" hour "+(time2.getMinute()+20)+" minute");
    }
    else{
        System.out.println("Your Order Will be ready at: "+(time2.getHour()+1)+" hour "+((time2.getMinute()+20)%60)+" minute");
    
    }
    break;
        }
        else if(f=='n')
        {System.out.println("Your order has been canceled");
    break;}
        else{
            System.out.println("Please enter correct Input");
            
        }
    }
        break;
        
        }
        else if(t == 'n')
        {
            System.out.println("Thankyou for using our services");
            break;
        }
        else{
            System.out.println("Please enter correct input");
        }
    }
       }
       else{
        System.out.println("Sorry! right now we don't have "+Dish);
        System.out.println("But we will try next time to add "+Dish);
        URL myUrl = new URL("https://www.zomato.com/");
       System.out.println("But you can have this after click on this link:- "+myUrl);
       }
    //    URL myUrl = new URL("https://www.zomato.com/");
    //    System.out.println("If you want to order you can click on this link: "+myUrl);
       System.out.println("Well do you find them helpful");
       System.out.println("(y/n)");

       while(true)
       {
            
            char v2 = sc.next().charAt(0);
            if(v2=='y')
            {
                System.out.println("Thanks for your feedback");
                break;
            }
            else if(v2=='n'){
                System.out.println("Sorry! if do not match your expectations");
                System.out.println("Thanks for your feedback");
                break;
            }
            else{
                System.out.println("Please enter correct input");
            }
        }
           
       
       i=1;
        }

           
           
        }while (i==0); {
            
        }
        
    }

void good()
{
    String st1[] = {"Gulab Jamun","Rasmalai","Kaju Katli","Chole Bhature","Paneer Lababdar","Chilly Paneer"};
    for(int i=0;i<st1.length;i++)
    {
        System.out.println((i+1)+"."+st1[i]);
    }
    
}
void bad()
{
    String st1[] = {"Brownie","Dark Choclate","Waffles"};
    for(int i=0;i<st1.length;i++)
    {
        System.out.println((i+1)+"."+st1[i]);
    }
}
void normal()
{
    String st1[] = {"Fruits","Panner Parantha","Lachha Parantha","Tea","Panner Butter Masala","Churma"};
    for(int i=0;i<st1.length;i++)
    {
        System.out.println((i+1)+"."+st1[i]);
    }
}
void Fun()
{
    String st1[] = {"Lassi","Rabdi Jalebi","Kesar Milk","Beer","Whiskey","having Date Night with Russian"};
    for(int i=0;i<st1.length;i++)
    {
        System.out.println((i+1)+"."+st1[i]);
    }
}
void locfun()
{
    System.out.println("It is availabel at the following outlets:");
    String s11[] = {"OVEN XPRESS","KITCHEN ETTE","Tandori Hub","TALK OF TOWN","LOVELY SWEETS"};
    for(int g=0;g<s11.length;g++)
    {
        System.out.println((g+1)+"."+s11[g]);
    }
  
}
void locbad()
{
    System.out.println("It is availabel at the following outlets:");
    String s11[] = {"OVEN XPRESS","Nescafe","Tandori Hub","LOVELY SWEETS","Dominos","Amul Parlour"};
    for(int g=0;g<s11.length;g++)
    {
        System.out.println((g+1)+"."+s11[g]);
    }
  
}
void locnormal()
{
    System.out.println("It is availabel at the following outlets:");
    String s11[] = {"Pakka Adda","KITCHEN ETTE","Tandori Hub","TALK OF TOWN","LOVELY SWEETS","Desi Chai"};
    for(int g=0;g<s11.length;g++)
    {
        System.out.println((g+1)+"."+s11[g]);
    }
  
}
void loc()
{
    System.out.println("It is availabel at the following outlets:");
    String s11[] = {"OVEN XPRESS","KITCHEN ETTE","Tandori Hub","TALK OF TOWN","LOVELY SWEETS"};
    for(int g=0;g<s11.length;g++)
    {
        System.out.println((g+1)+"."+s11[g]);
    }
    
  
}
void order()
{
    Scanner sc = new Scanner(System.in);
    int p;
    int k = 156;
    System.out.println("Tell me the dish number you want to order");
    int a = sc.nextInt();
    System.out.println("Tell us the quantity of your dish ");
    int b = sc.nextInt();
    if(a==1 || a==3 || a==7)
    {
        p=90;
        System.out.println("Total Price :"+b+"*"+p+"="+b*p);
    }
    else if(a==2||a==6||a==4)
    {
        p=100;
        System.out.println("Total Price :"+b+"*"+p+"="+b*p);
    }
    else{
        p=95;
        System.out.println("Total Price :"+b+"*"+p+"="+b*p);
    }
    System.out.println("Do you want to conform your order: ");
    System.out.println("(y/n)");
    while(true)
    {
    char f = sc.next().charAt(0);
    if(f == 'y')
    {
  System.out.println("Your token number is: "+(k+b));
  LocalDateTime time2 = LocalDateTime.now();
  System.out.println("Your order recieved at: "+time2.getHour()+" hour "+time2.getMinute()+" minute");
//   System.out.println("\nbefore formating\n" +time2);
if(time2.getMinute()<40)
{
 System.out.println("Your Order Will be ready at: "+time2.getHour()+" hour "+(time2.getMinute()+20)+" minute");
}
else{
    System.out.println("Your Order Will be ready at: "+(time2.getHour()+1)+" hour "+((time2.getMinute()+20)%60)+" minute");

}
break;
    }
    else if(f=='n')
    {System.out.println("Your order has been canceled");
break;}
    else{
        System.out.println("Please enter correct Input");
        
    }
}

}

}
