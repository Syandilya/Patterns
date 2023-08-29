import java.util.*;
class main{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
         if(0<n&&n%2==0)
        {
          for(int i=0;i<n;i++)
            {
                if(i%2==0)
                for(int j=0;j<n;j++)
                {
                    if(j%2==0)
                    System.out.print(1+" ");
                    else
                    System.out.print(0+" ");
                }
              
             
            else
            for(int j=0;j<n;j++)
                {
                    if(j%2==0)
                    System.out.print(0+" ");
                    else
                    System.out.print(1+" ");
                }
                  System.out.println();
        }
          
        }
        else if(0<n)
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(j%2==0)
                    System.out.print(1+" ");
                    else
                    System.out.print(0+" ");
                }
                System.out.println();
            }
            
        }
        else
          System.out.println("Invalid Input");
    }
}

/*
Pattern 1 with odd number input
1 0 1 0 1

1 0 1 0 1

1 0 1 0 1

1 0 1 0 1

1 0 1 0 1
Pattern 2 with even number input
1 0 1 0 1 0

0 1 0 1 0 1

1 0 1 0 1 0

0 1 0 1 0 1

1 0 1 0 1 0

0 1 0 1 0 1

*/


/*Pattern 2

*/
/*Pattern 2*/
import java.util.*;
class Main
{
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0)
        System.out.println("Invalid Input");
        for(int i=0;0<n&&i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                System.out.print(i+1+" ");
                else
                System.out.print(0+" ");
            }
            System.out.println();
        }
    }
}
/*
Input 1  :    5

Output 1: 

1 0 0 0 0

0 2 0 0 0

0 0 3 0 0

0 0 0 4 0

0 0 0 0 5


 Input 2  :    8

Output 2: 

1 0 0 0 0 0 0 0

0 2 0 0 0 0 0 0

0 0 3 0 0 0 0 0

0 0 0 4 0 0 0 0

0 0 0 0 5 0 0 0

0 0 0 0 0 6 0 0

0 0 0 0 0 0 7 0

0 0 0 0 0 0 0 8



*/

/*
Pattern 3
*/
import java.util.*;
class Main
{
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0)
        System.out.println("Invalid Input");
        for(int i=1;0<n&&i<=n;i++)
        {
            for(int j=n;1<=j;j--)
            {
                if(j<=i)
                System.out.print(i+" ");
                else
                System.out.print(1+" ");
            }
            System.out.println();
        }
    }
}
/*
If Input is 6 then Print 

1 1 1 1 1 1

1 1 1 1 2 2

1 1 1 3 3 3

1 1 4 4 4 4

1 5 5 5 5 5

6 6 6 6 6 6


If input is 9 then output is:

1 1 1 1 1 1 1 1 1 
1 1 1 1 1 1 1 2 2 
1 1 1 1 1 1 3 3 3 
1 1 1 1 1 4 4 4 4 
1 1 1 1 5 5 5 5 5 
1 1 1 6 6 6 6 6 6 
1 1 7 7 7 7 7 7 7 
1 8 8 8 8 8 8 8 8 
9 9 9 9 9 9 9 9 9*/
