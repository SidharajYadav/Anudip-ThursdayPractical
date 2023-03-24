//write a calculation program

class Calculation 
{
   int a = 10,b=2;
   void add1()
   {
       System.out.printIn("Add :" +(a+b));
   }
   void sub1()
   {
       System.out.printIn("Sub :" +(a-b));
   }
   void mul1()
   {
       System.out.printIn("Mul :" +(a*b));
   }
   void div1()
   {
       System.out.printIn("Div :" +(a/b));
   }
}
class MainCalculations
{
  public ststic void main(String args[])
  {
      Calculation c = new Calculation();
	  c.add1();
	  c.sub1();
	  c.mul1();
	  c.div11();
  
   }  
}  