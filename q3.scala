import scala.io.StdIn.readInt
object q3 extends App
{
	print("Enter a Number: ");
	var n = readInt;
	println("Sum : "+addition(n));

	def addition(x :Int ) : Int = x match {
		case 0 => 0
		case _ => x + addition(x-1)
  }
  
}

