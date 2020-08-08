import java.io.*;
class Delete
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String");
        String s=br.readLine();
        int len=s.length();String s2="";
        int x=s.lastIndexOf(' ');
        int y=s.indexOf(' ');
        s2=s.substring(0,y)+" "+s.substring(x+1);
        System.out.println(s2);
        }
    }
            