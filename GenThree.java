/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		// prints a random value in [0,1)

      int a = Integer.parseInt(args[0]);
	  int b = Integer.parseInt(args[1]);

	  int c = (int)((b-a) * Math.random() + a) ;

	   a = (int)( (b-a) * Math.random() + a) ;
	   b = (int)( (b-a) * Math.random() + a) ;


      
      int minimal = Math.min(a,b);
      minimal = Math.min(minimal,c);

      System.out.println(a);
      System.out.println(b);
      System.out.println(c);

      System.out.println("The minimal generated number was " + minimal);
      	
	}
}
