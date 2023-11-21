import java.util.Scanner;
class div {
    public static void main(String args[])
    {
        int m,n,i,cnt=0,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the two numbers:");
        m=sc.nextInt();
        n=sc.nextInt();
        System.out.println("the number divisible by 3 and 5 are:");
        for(i=m;i<n;i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println(i);
                sum=sum+i;
                cnt++;
            }  
        }
        System.out.println("sum is "+sum +"\n" +"number divisible by 3 and 5 are" +cnt);

    }
    
}
