import java.io.*;
class Freqeach
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String");
        String s=br.readLine();
        int len=s.length();
        for(int j=65;j<=90;j++)
        {
            int c=0;
            for(int i=0;i<len;i++)
            {
                char ch=s.charAt(i);
                if(ch==(char)j||ch==(char)(j+32))
                c++;
            }
            if(c>0)
            System.out.println((char)j+"\t"+c);
        }
    }
}