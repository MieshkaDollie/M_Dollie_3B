package za.ac.cput;
/**
 * @(#)HmWk3.java
 *
 *
 *
 * @version 1.00 2017/3/16
 */
import java.util.*;
public class HmWk3 {
    static Scanner console =new Scanner(System.in);

    public static void main(String[] args) {
  final String line="************************************************";

 int month;
  System.out.println("Please enter a month number (1-4:)");
  month= console.nextInt();
  System.out.println("");

  if((month<1)||(month>4))
  {System.out.println("***Incorrect value entered, cannot proceed***");
   System.out.println("");
  }
  else
  {
  	System.out.println(line);
  	if(month==1)
  		System.out.println("----->January");
  		else if(month==2)
  			System.out.println("----->February");
  			else if(month ==3)
  				System.out.println("----->March");
  					else
  						System.out.println("----->April");

  System.out.println("");

  }
  System.out.println(line);
    }
}
