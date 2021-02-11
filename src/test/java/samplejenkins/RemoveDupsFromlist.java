package samplejenkins;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class RemoveDupsFromlist {
	/***
	 * 
	 */
	
		@Test
		
		public void  AddDupsToAaary() {
			
			//write a java program to remove duplicates from the list and create a seperate array with the duplicates
int [] A = {1,2,2,3,45,6,7,6};            
ArrayList<Integer> ar = new ArrayList<Integer>();       
for(int i=0;i<A.length;i++)         {
	for(int j=i+1;j<A.length;j++)          
	{                 if(A[i]==A[j])   {                
		ar.add(A[j]);                 }                        
	}         }                      
System.out.println(ar); 

			
		}
	
	
		
	}


