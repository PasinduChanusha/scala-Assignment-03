import scala.io.StdIn.readInt
object q6 extends App
{
	print("Enter Your Number: ");
	var x = readInt;
	fibSequence(x);
	
	
  def fib(n : Int) : Int = n match {
    case n if n==0 => 0
    case n if n==1 => 1
    case n => fib(n-1)+fib(n-2)
  }
  
  def fibSequence(n : Int) : Unit = {
    if(n>0) fibSequence(n-1)
	println(fib(n));
}
}