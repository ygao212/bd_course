object Temp {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(57); 
  println("Welcome to the Scala worksheet");$skip(23); 
 
 
 
 	var factor = 3;System.out.println("""factor  : Int = """ + $show(factor ));$skip(40); 
	val multiplier = (i:Int) => i * factor;System.out.println("""multiplier  : Int => Int = """ + $show(multiplier ));$skip(19); val res$0 = 
  
  multiplier(2);System.out.println("""res0: Int = """ + $show(res$0));$skip(16); 
  
  factor = 5;$skip(16); val res$1 = 
  multiplier(2);System.out.println("""res1: Int = """ + $show(res$1));$skip(26); 
  
  
  

	val offset = 3;System.out.println("""offset  : Int = """ + $show(offset ));$skip(180); 
	
	val below  =  ( barrier :Int, xs :List[Int] )   =>  {
	 
	    val isBelow  =  ( y : Int )  =>   y  <  barrier + offset
	 
	    for(  x <- xs;  if(  isBelow( x )  ) ) yield x
	};System.out.println("""below  : (Int, List[Int]) => List[Int] = """ + $show(below ));$skip(78); val res$2 = 
	 
	below( 5, List( 5, 1, 7, 4, 9, 11, 3 ) )      // => List( 5, 1, 7, 4, 3 );System.out.println("""res2: List[Int] = """ + $show(res$2))}
  
  
  
  
  
  
  
  
  
  
  
  
  
}
