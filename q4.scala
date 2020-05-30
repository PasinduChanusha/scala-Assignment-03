import scala.io.StdIn.readInt
object q4 extends App
{
	print("Enter Your Number: ");
	var x = readInt;
	even_odd(x);
	
	def even_odd(n : Int) : Unit = n%2 match{
		case x if(x==0) => println("Even");
		case x if(x==1) => println("Odd");
	}
}