import java.util.*;
class gcd
 {
    public static void main(String args[])
    {
      int i,a,b;
      int gcd=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the two numbers:");
      a=sc.nextInt();
      b=sc.nextInt();
      for(i=1;i<=a && i<=b;i++)
       {
        if(a%i==0 && b%i==0)
         {
            gcd=i;
         }
       }
       System.out.println("gcd is " +gcd);
    }
   
}

