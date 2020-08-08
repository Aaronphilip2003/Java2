class Forloop9
{
    public static void main(int n)
     {
         int sum=0,i;
         for(i=1;i<n;i++)
          {
              if(n%i==0)
              sum+=i;
            }
            if (sum==n)
            System.out.println(n+" is perfect");
            else
            System.out.println(n+" is not perfect");
        }
    }
 