import java.util.*;
class prime {
    public static void main(String args[])
    {
        int n,i,f=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number:");
        n=s.nextInt();
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                f=1;
            }
        }
        if(f==0)
            System.out.println("ita a prime number");
         else
         System.out.println("its not a prime number");
    }
    
}
