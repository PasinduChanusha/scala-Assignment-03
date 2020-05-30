import scala.io.StdIn.readInt
object q5 extends App
{
	print("Enter Your Number: ");
	var a = readInt;
	print(even_add(a));
	
  def even (n : Int ) : Boolean = n match {
    case 0 => true
    case _ => odd(n-1)
  }
  
  def odd (n : Int) : Boolean = !(even(n))

  def even_add(n :Int ) : Int = n match {
    case 0 => 0
    case x if(even(x)) => n + even_add(x-1)
    case x if(odd(x)) => even_add(x-1)
  }
  
}