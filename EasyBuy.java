import java.io.*;
class EasyBuy
{
    String name;
    int price;
    double amt,dis;
    void accept()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the name of the article");
        name=br.readLine();
        System.out.println("Enter the price of the article");
        price=Integer.parseInt(br.readLine());
    }
    void compute()throws IOException
    {
        if(price<=5000)
        dis=price*5.0/100;
        else if(price<=10000)
        dis=price*10.0/100;
        else if(price>10000)
        dis=price*15.0/100;
        amt=price-dis;
    }
    void display()throws IOException
    {
        System.out.println("Name of the article:"+name);
        System.out.println("Price of the article:"+price);
        System.out.println("Final Amount after discount: "+amt);
    }
    public static void main(String args[])throws IOException
    {
        EasyBuy obj=new EasyBuy();
        obj.accept();
        obj.compute();
        obj.display();
    }
}
        