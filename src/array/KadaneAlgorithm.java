package array;

public class KadaneAlgorithm {
	
	public static int Kadane(int[] nums) {
		int max = Integer.MIN_VALUE;
		int curr = 0;
		for(int i=0; i<nums.length;i++) {
			curr += nums[i];
			
			if(max< curr) {
				max = curr;
			}
			
			if(curr<0) {
				curr = 0;
			}
		}
		return max;
	}

	
	public static int maxsubarraysum2(int[] nums) {
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<nums.length;i++) {
			int sum = 0;
			for(int j=i; j < nums.length; j++) {
				sum = sum + nums[j];
				max = Math.max(max, sum);
			}
		}
		return max;
	}

	
	public static int maxsubarraysum(int[] nums) {
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<nums.length;i++) {
			for(int j=i; j < nums.length; j++) {
				int sum= 0;
				
				 for (int k = i; k <= j; k++) {
	                    sum += nums[k];
	                }

	                max = Math.max(max, sum);
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = new int[9];
		
		nums[0] = -2;
		nums[1] = 1;
		nums[2] = -3;
		nums[3] = 4;
		nums[4] = -1;
		nums[5] = 2;
		nums[6] = 1;
		nums[7] = -5;
		nums[8] = 4;
		
			
		
		System.out.println(maxsubarraysum(nums));
		System.out.println(maxsubarraysum2(nums));
		System.out.println(Kadane(nums));

	}

}
