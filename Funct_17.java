class Funct_17
{
    static void display(String str,int p)
    {
        if(p==1)
        {
            for(int i=0;i<str.length();i++)
            {
                char ch=str.charAt(i);
                if(Character.isUpperCase(ch))
                System.out.println(ch);
            }
        }
    }
    static void display(String str,char ch1)
    {
        if(ch1=='v')
        {
            for(int i=0;i<str.length();i++)
            {
                char ch=str.charAt(i);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                System.out.println(ch);
            }
        }
        else
        System.out.println(str);
    }
}
               
        