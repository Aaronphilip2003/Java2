class Forloop10
{
    public static void main(int a,int b)
     {
       int gcd=0,lcm=0;
       for(int i=1;i<=a;i++)
        {
            if(a%i==0&&b%i==0)
            gcd=i;
        }
        lcm=a*b/gcd;
        System.out.println("HCF= "+gcd);
        System.out.println("LCM= "+lcm);
    }
}