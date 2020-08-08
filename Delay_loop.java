import java.io.*;
class Delay_loop
{
     public static void main(String args[])throws IOException
     {
                                                                                                                                                                                                                                                                                         
         try{
         System.out.println("HI");
         Thread.sleep(3000);
         System.out.println("I am a software developer and I hope you liked this program");
        }
        catch(InterruptedException e){
            System.err.println(e.getMessage());
        }
        
        }
    }

         
     