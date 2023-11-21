import java.util.*;
class countprime {
    public static void main(String args[])
    {
        int i,j,cnt=0;
        for(i=37;i<129;i++)
        {
            for(j=2;j<i/2;j++)
            {
                if(i%j==0)
                {
                    cnt++;
                    break;
                }
            }
        }
     System.out.println("number of prime numbers are " +cnt);
    }
}
