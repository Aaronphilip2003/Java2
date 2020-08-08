import java.io.*;
public class Frequency {
public static void main(String args[])throws IOException
{
	int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0,c0=0;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter a number");
	long a;
	a=Long.parseLong(br.readLine());
	while(a>0)
	{
     long r=a%10;
		a=a/10;
	if(r==1)
	c1++;
	else if(r==2)
		c2++;
	else if(r==3)
		c3++;
	else if(r==4)
		c4++;
	else if(r==5)
		c5++;
	else if(r==6)
		c6++;
	else if(r==7)
		c7++;
	else if(r==8)
		c8++;
	else if(r==9)
		c9++;
	else
		c0++;
	}
	System.out.println("Frequency");
	System.out.println("Frequency of the number '1': "+c1);
	System.out.println("Frequency of the number '2': "+c2);
	System.out.println("Frequency of the number '3': "+c3);
	System.out.println("Frequency of the number '4': "+c4);
	System.out.println("Frequency of the number '5': "+c5);
	System.out.println("Frequency of the number '6': "+c6);
	System.out.println("Frequency of the number '7': "+c7);
	System.out.println("Frequency of the number '8': "+c8);
	System.out.println("Frequency of the number '9': "+c9);
	System.out.println("Frequency of the number '0': "+c0);
	
}
}
