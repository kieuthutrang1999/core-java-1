package allbaitap;

import java.util.Arrays;

public class bai92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=======================BÀI 92=======================\n");
		 int[] nums = {5, 7, 2, 4, 9};
			int ctr_even = 0, ctr_odd = 0;
			System.out.println("Original Array: "+Arrays.toString(nums)); 
			    
		    for(int i = 0; i < nums.length; i++) {
		        if(nums[i] % 2 == 0)
				{         
		          ctr_even++;
				}
				else
				   ctr_odd++;	
		    }                 
		    System.out.printf("\nNumber of even elements in the array: %d",ctr_even);
			System.out.printf("\nNumber of odd elements in the array: %d",ctr_odd);
			System.out.printf("\n");
	}

}
