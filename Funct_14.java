class Funct_14
{
    static void check(String s)
    {
        int x=s.indexOf(' ');
        int y=s.lastIndexOf(' ');
        char ch=s.charAt(0);
        System.out.println(ch);
        System.out.println(s.charAt(x+1));
        System.out.println(s.charAt(y+1));
    }
}
        