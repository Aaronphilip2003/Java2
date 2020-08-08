import java.io.*;
class Evaluations
 {
     public static void main(String args[])throws IOException
     {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("---------MENU---------");
         System.out.println("1-Natural Logrithm of a number");
         System.out.println("2-Absolute value of a number");
         System.out.println("3-Square root of a number");
         System.out.println("4-Random number between 0 and 1");
         int c=Integer.parseInt(br.readLine());
         switch(c)
          {
              case 1:System.out.println("Enter a number to find out the Natural Logrithm of it");
              double l=Double.parseDouble(br.readLine());
              System.out.println("The Natural Logrithm of "+l+" is "+Math.log(l));
              break;
              case 2:System.out.println("Enter a number to find out the Absolute value of it");
              double a=Double.parseDouble(br.readLine());
              System.out.println("The absolute value of "+a+" is "+Math.abs(a));
              break;
              case 3:System.out.println("Enter a number to find out the Square root of it");
              double s=Double.parseDouble(br.readLine());
              System.out.println("The Square root of "+s+" is "+Math.sqrt(s));
              break;
              case 4:System.out.println("A random number between 0 and 1 is "+Math.random());
              break;
              default:System.out.println("Choose the correct option");
            }
        }
    }
             
                         