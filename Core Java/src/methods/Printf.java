package methods;

import java.util.Date;

public class Printf {

	public static void main(String[] args) {

		/*
		  syntax for printf()

		 System.out.printf(format, arguments);
		 System.out.printf(locale, format, arguments);

		 %d  format for integer values

		 %s formats strings.
         %,d formats  integers.
         %f formats floating-point numbers.
         %t formats date/time values.
         %b formats boolean values
         To break the string into separate lines, we have a %n specifier: Ex sopf(Akula%nBala%nYesu);
		 Akula
         Bala
         Yesu
		 */
		System.out.printf("Hello%n");
		System.out.printf("%s%n","Balu"); // Balu
		System.out.printf("%c%n",'B');
		int a=10;
		int b = 55;
		int c= a+b;
		System.out.printf("%d %n %d %n",c,a); // 65
		                                      // 10
		System.out.printf("%d%n",3050);  // 3050
		System.out.printf("%,d%n",3050);  // 3,050
		System.out.printf("%,f%n",30.50);   // 30.500000
		System.out.printf("Akula%nBala%nYesu%n");  // Akula
		                                           //  Bala
		                                           //  Yesu
		System.out.printf("%b%n",55);  // true 
		System.out.printf("%B%n",true);   // TRUE
		
		Date date = new Date();
		System.out.printf("%tT%n", date);  //current  Time it will print  22:40:19
		System.out.printf("hours %tH: minutes %tM: seconds %tS%n", date, date, date);  //  hours 22: minutes 44: seconds 39
		/*
		   A prints out the full day of the week.
           d formats a two-digit day of the month.
           B is for the full month name.
           m formats a two-digit month.
           Y outputs a year in four digits.
           y outputs the last two digits of the year.
           
		 */
		System.out.printf("%1$tA, %1$tB %1$tY %n", date);  // current date : Monday, May 2022
		System.out.printf("%1$td.%1$tm.%1$ty %n", date);   // current date 23.05.22
		
		
		for (int i = 48; i <= 122 ; i++) {
			
			System.out.printf("%d = %c  ",i,i);
		}
	}

}
