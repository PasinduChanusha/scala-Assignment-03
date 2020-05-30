
object Q1 extends App {
  def normal(hours : Int) = hours*150
  def oT(hours : Int): Int = hours*75
  def tax(sal :Double): Double = sal*0.1
  def Sal(wage :Int, ott :Int): Double = normal(wage)+oT(ott)
  def takehomeSalary(wage : Int, ott : Int): Double = Sal(wage,ott)-tax(Sal(wage,ott))
  println("Full Salary = "+takehomeSalary(40,20))
}

