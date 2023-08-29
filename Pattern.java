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
