package arrays;

import java.util.Arrays;

public class Practies {

	public static void main(String[] args) {
		
		int value[] = {44,66,99,77,33,22,55};
		   
	       
	       Arrays.sort(value);
	       
	       for(int j=value.length-2 ; j<value.length-1 ; j++)
	            {
	                System.out.println(value[j]);
	            }
	       
	       
	        for(int i=0; i<value.length ; i++)
	        {
	            for(int j=i+1 ; j<value.length ; j++)
	            {
	                if(value[i]>value[j])
	                {
	                    int temp = value[i];
	                    value[i] = value[j];
	                    value[j] = temp;
	                    
	                }
	            }
	            
	           
	        }
	       
	        System.out.println(value[value.length-2]);
		
	     		
	}

}
