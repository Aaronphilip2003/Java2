import java.io.*;
class Greatestnumber
 {
     public static void main(String args[])throws IOException
     {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter the first number");
         int a=Integer.parseInt(br.readLine());
         System.out.println("Enter the second nuumber");
         int b=Integer.parseInt(br.readLine());
         System.out.println("Enter the third number");
         int c=Integer.parseInt(br.readLine());
         if(a>b&&a>c)
          {
              System.out.println(a+" is the greatest number");
          }
         if(b>a&&b>c)
          {
              System.out.println(b+" is the greatest number");
          }
         else
         {
             System.out.println(c+" is the greatest number");
         }
        }
    }