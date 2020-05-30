import scala.io.StdIn.readInt
object q2 extends App
{
	print("Enter Your Number: ");
	var a=readInt;
	primeSeq(a);
	
  
	def gcd(n1 : Int, n2 :Int ):Int = n2 match{
		case 0 => n1
		case x if x > n1 => gcd(x,n1)
		case _ => gcd(n2,n1 % n2)
  }
	
	def primeSeq(n : Int,i : Int = 2) : Unit = {
		if ( prime(i)== true ) print(i+" ")
		if (n > i) primeSeq(n,i+1)
  }
  def prime(num : Int , div : Int = 2): Boolean = div match{
		case x if(num ==  div) => true
		case x if gcd(num,div) > 1 => false
		case _ => prime(num,div+1)
  }
  
}