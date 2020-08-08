import java.io.*;
class FruitJuice
{
    int product_code;
    String flavour;
    String pack_type;
    int pack_size;
    int product_price;
    FruitJuice()
    {
        product_code=0;
        pack_size=0;
        product_price=0;
        flavour="";
        pack_type="";
    }
    void input()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the product code");
        product_code=Integer.parseInt(br.readLine());
        System.out.println("Enter the flavour");
        flavour=br.readLine();
        System.out.println("Enter the pack type");
        pack_type=br.readLine();
        System.out.println("Enter the pack size");
        pack_size=Integer.parseInt(br.readLine());
        System.out.println("Enter the product price");
        product_price=Integer.parseInt(br.readLine());
    }
    void discount()
    {
        product_price=product_price-10;
    }
    void display()
    {
        System.out.println("product code:"+product_code);
        System.out.println("flavour:"+flavour);
        System.out.println("pack type:"+pack_type);
        System.out.println("pack size:"+pack_size);
        System.out.println("product price:"+product_price);
    }
    public static void main(String args[])throws IOException
    {
        FruitJuice obj=new FruitJuice();
        obj.input();
        obj.discount();
        obj.display();
    }
}
        
        
    