import java.io.*;
class Discount
{
    int cost;
    String name;
    Double dc;
    Double amt;
    void input()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the price of the article");
        cost=Integer.parseInt(br.readLine());
        System.out.println("Enter the customer's name");
        name=br.readLine();
    }
    void cal()
    {
        if(cost<=5000)
        dc=0.0;
        else if(cost>=5001&&cost<=10000)
        dc=((10.0/100.0)*cost);
        else if(cost>=10001&&cost<=15000)
        dc=((15.0/100.0)*cost);
        else if(cost>15000)
        dc=((20.0/100.0)*cost);
        amt=cost-dc;
    }
    void display()
    {
        System.out.println("NAME:"+name);
        System.out.println("COST:"+cost);
        System.out.println("DISCOUNT:"+dc);
        System.out.println("AMOUNT:"+amt);
    }
}
        
    