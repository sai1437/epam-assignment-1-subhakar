import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NewYearGift {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int no_of_gifts;
		 //taking the size of list as number of children to whom we have to distribute the new year gift
		 System.out.println("enter no of gifts to be distributed to the children");
		 no_of_gifts=sc.nextInt();
         Chocolate c[]=new Chocolate[no_of_gifts];
         Sweets s[]=new Sweets[no_of_gifts];
         int a,b,i;
         String ch;
         
         //creating a list to store different types of chocolates
         List<Chocolate> chocolates = new ArrayList<Chocolate>();
         
         //creating another list to save different types of sweets
         List<Sweets> sweets = new ArrayList<Sweets>();
         System.out.println("enter the inputs of chocolate with spaces");
    	 System.out.println("weight--price--chocolatename");
         for(i=0;i<no_of_gifts;i++) 
         {     
        	 
        	 a=sc.nextInt();
        	 b=sc.nextInt();
        	 ch=sc.next();
        	
        	 c[i]=new Chocolate();
        	
        	 c[i].setWeight(a);
        	 c[i].setPrice(b);
        	 c[i].setname(ch);
        	 chocolates.add(c[i]);
         }
	
         System.out.println("enter the inputs of sweets with spaces");
    	 System.out.println("weight--price--sweetname");
         for(i=0;i<no_of_gifts;i++)
         {
        	 
        	 a=sc.nextInt();
        	 b=sc.nextInt();
        	 ch=sc.nextLine();
        	 s[i]=new Sweets();
        	
        	 s[i].setWeight(a);
        	 s[i].setPrice(b);
        	 s[i].setname(ch);
        	 sweets.add(s[i]);
         }
        
        
 
        // UnSorted List
         System.out.println("unsorted list of chocolates");
         System.out.println(chocolates);
         System.out.println("unsorted list of sweets");
         System.out.println(sweets);
 
         Collections.sort(chocolates);
         Collections.sort(sweets);
 
        // Default Sorting by employee id
         System.out.println("sorted list of chocolates in gift");
         System.out.println(chocolates);
         System.out.println("sorted list of sweets in gift");
         System.out.println(sweets);
         sc.close();
    }

}




/*sample inputs and outputs for the program
inputs:
enter no of gifts to be distributed to the children
4
enter the inputs of chocolate with spaces
weight--price--chocolatename
56 10 dairymilk
55 12 milkybar
45 5 kitkat
50 15 gems
enter the inputs of sweets with spaces
weight--price--sweetname
102 80 gulabjammu
89 55 rasagula
130 96 kaja
56 29 jilebi*/

/*sample outputs:
	unsorted list of chocolates
	[Gift : 56 - 10 - dairymilk
	, Gift : 55 - 12 - milkybar
	, Gift : 45 - 5 - kitkat
	, Gift : 50 - 15 - gems
	]
	unsorted list of sweets
	[Gift : 102 - 80 -  gulabjammu
	, Gift : 89 - 55 -  rasagula
	, Gift : 130 - 96 -  kaja
	, Gift : 56 - 29 -  jilebi
	]
	sorted list of chocolates in gift
	[Gift : 45 - 5 - kitkat
	, Gift : 50 - 15 - gems
	, Gift : 55 - 12 - milkybar
	, Gift : 56 - 10 - dairymilk
	]
	sorted list of sweets in gift
	[Gift : 56 - 29 -  jilebi
	, Gift : 89 - 55 -  rasagula
	, Gift : 102 - 80 -  gulabjammu
	, Gift : 130 - 96 -  kaja
	]
*/