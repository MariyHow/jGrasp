import java.util.*;
import java.io.*;
public class filetry
{
public static void main(String [] args)throws FileNot
{
File fakename = new File ("fakenames.txt");
Scanner infile = new Scanner(fakename);
Scanner infile2 = new Scanner(fakename);
int count=0;
while(infile2.hasNext())
{
System.out.println(infile2.next());
infile2.next();
infile2.nextDouble();
count++;

String [] fnames=new String[count];
String [] lname=new String[count];
double [] num=new double [count];
int i=0;
while(infile2.hasNext())
{
fname[i]=(infile2.next());
lname[i]=infile2.next();
num[i]=infile2.nextDouble();
i++;
}
for(i=0<fname.lenght;i++);
System.out.println(fname[i]+" "+lname[i]+" "+num[i]);
}
}
}