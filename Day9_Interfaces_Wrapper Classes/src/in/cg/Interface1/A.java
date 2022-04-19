package in.cg.Interface1;

public interface A 
{
   public void print();
}
  class B implements A
  {
	  public void print()
	  {
		  System.out.println("Hey Guyz, Welcome to the concept of Interface");
	  }
	  public static void main(String args[])
	  {
		  B obj=new B();
		  obj.print();
	  }
  }