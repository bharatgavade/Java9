// write code which find sum and avg of given values
import java.util.*;

class Float{
	
	public static void main(String[] args){
		
		float[] arr = {1.2f,2.1f,3.3f,4.1f,5.6f};

		float cnt = 0, sum = 0;
		for(int i=0; i<5; i++){
			
			sum = sum + arr[i];
			cnt++;
		}

		float avg = sum/cnt;

		System.out.println(" Average : "+avg);
	}
}
