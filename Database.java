import java.io.*;
class Database
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("==========DATABASE==========");
        System.out.println("Enter 3 names and their phone numbers");
        int b[]=new int[3];
        int k=0;String s1="";
        String a[]=new String[3];int flag=0;
        for(int i=0;i<3;i++)
        {
            a[i]=br.readLine();
            b[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Enter the name to know their phone number:");
        String search=br.readLine();
        for(int i=0;i<3;i++)
        {
            if(a[i].equalsIgnoreCase(search))
            {
                flag=1;
                k=i;
                s1=a[i];
            }
        }
        if(flag==1)
        {
        System.out.println(b[k]);
    }
}
}

