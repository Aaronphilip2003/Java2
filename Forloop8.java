class Forloop8
{
    public static void main(int n)
    {
        int i;
        int count=0;
        for(i=1;i<=n;i++)
         {
             if(n%i==0)
             count++;
            }
            if(count==2)
            System.out.println(n+" is a prime number");
            else 
            System.out.println(n+" is not a prime number");
        }
    }
    
        