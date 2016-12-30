object Temp {
  println("Welcome to the Scala worksheet")
 
 
 
 	var factor = 3
	val multiplier = (i:Int) => i * factor
  
  multiplier(2)
  
  factor = 5
  multiplier(2)
  
  
  

	val offset = 3
	
	val below  =  ( barrier :Int, xs :List[Int] )   =>  {
	 
	    val isBelow  =  ( y : Int )  =>   y  <  barrier + offset
	 
	    for(  x <- xs;  if(  isBelow( x )  ) ) yield x
	}
	 
	below( 5, List( 5, 1, 7, 4, 9, 11, 3 ) )      // => List( 5, 1, 7, 4, 3 )
  
  
  
  
  
  
  
  
  
  
  
  
  
}