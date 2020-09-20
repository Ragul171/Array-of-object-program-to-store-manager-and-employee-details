import java.util.*;
class Employee
{
 private String empname;
 private int empid;
 private double da,hra,bp;
 public double salary;
 Scanner in = new Scanner(System.in);
 public Employee()
 {
  empname="None";
  empid=0;
  da=0.0;
  hra=0.0;
  bp=0.0;
  salary=0.0;
 }
 public void getDetails()
 {
  System.out.println("Enter the name : ");
  empname=in.nextLine();
  System.out.println("Enter the Id : ");
  empid=in.nextInt();
  System.out.println("Enter DA : ");
  da=in.nextDouble();
  System.out.println("Enter Hra : ");
  hra=in.nextDouble();
  System.out.println("Enter BP : ");
  bp=in.nextDouble(); 
  salary=computeSalary();
 }
 public double computeSalary()
 {
  salary=bp+(bp*da)/100+hra;
  return salary;
 }
 public void dispDetails()
 {
  System.out.println("Name : "+empname);
  System.out.println("ID : "+empid);
  System.out.println("DA : "+da);
  System.out.println("HRA : "+hra);
  System.out.println("BP : "+bp);
  System.out.println("Salary : "+salary);
 }
}
class Manager extends Employee
{
 private double bonus;
 public Manager()
 {
  super();
  bonus=0;
 }
 public void getDetails()
 {
  super.getDetails();
  System.out.println("Enter the bonus : ");
  bonus=in.nextDouble();
  super.salary=bonus+super.salary;
 }
 public void dispDetails()
 {
  super.dispDetails();
  System.out.println("Bonus : "+bonus);
 }
}
public class ManagerArrOfObj
{
 public static void main(String...arg)
 {
  Scanner in =new Scanner(System.in);
  int n,n1;
  System.out.println("Enter the number of employees : ");
  n=in.nextInt();
  System.out.println("Enter the number of manager : ");
  n1=in.nextInt();
  Employee [] s1 =new Employee[n];
  Manager [] m1=new Manager[n1];
  for(int i =0;i<n;i++)
  {
   System.out.println("Enter the details of employee "+ (i+1));
   s1[i]=new Employee();
   s1[i].getDetails();
  }
  for(int i=0;i<n1;i++)
  {
   System.out.println("Enter the details of Manager "+ (i+1));
   m1[i]=new Manager();
   m1[i].getDetails();
  }
  System.out.println("\t Employee Details");
  for(int i =0;i<n;i++)
  {
   s1[i].dispDetails();
  }
  System.out.println("\t Manager Details");
  for(int i =0;i<n1;i++)
  {
   m1[i].dispDetails();
  }
 }
}