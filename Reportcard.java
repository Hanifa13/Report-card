import java.util.Scanner;
class Reportcard
{
public static void main(String args[])
{
int java,python,adsa,dlco,dmgt;
int sum,avg,sem,rollno;
String name,branch;
float cre1,cre2,cre3,cre4,cre5,total_credit=15;
float grd1,grd2,grd3,grd4,grd5,sgpa;
Scanner S=new Scanner(System.in);
System.out.println("Student Report card");
System.out.println("Name : ");
name=S.nextLine();
System.out.println("Branch : ");
branch=S.nextLine();
System.out.println("Roll No : ");
rollno=S.nextInt();
System.out.println("Semester : ");
sem=S.nextInt();
System.out.println("Java : ");
java=S.nextInt();
System.out.println("python : ");
python=S.nextInt();
System.out.println("advanced DSA : ");
adsa=S.nextInt();
System.out.println("DLCO : ");
dlco=S.nextInt();
System.out.println("DMGT : ");
dmgt=S.nextInt();
sum=java+python+adsa+dlco+dmgt;
avg=sum/5;
System.out.println("credit 1 : ");
cre1=S.nextFloat();
System.out.println("credit 2 : ");
cre2=S.nextFloat();
System.out.println("credit 3 : ");
cre3=S.nextFloat();
System.out.println("credit 4 : ");
cre4=S.nextFloat();
System.out.println("credit 5 : ");
cre5=S.nextFloat();
grd1=java/10;
grd2=python/10;
grd3=adsa/10;
grd4=dlco/10;
grd5=dmgt/10;
sgpa=((grd1*cre1)+(grd2*cre2)+(grd3*cre3)+(grd4*cre4)+(grd5*cre5))/total_credit;
System.out.println("Total : "+sum);
System.out.println("Average : "+avg);
System.out.println("SGPA : "+sgpa);
if(java>=35 && python>=35 && adsa>=35 && dlco>=35 && dmgt>=35)
{
System.out.println("PASS");
}
else
{
System.out.println("FAIL");
}
if(avg>=80)
{
System.out.println("Congrats! you got A grade..");
}
else if(avg>=60)
{
System.out.println("Good! you got B grade..");
}
else if(avg>=35)
{
System.out.println("Work hard! you got C grade..");
}
else if(avg<35)
{
System.out.println("Sorry! you have failed..");
}
}
}









