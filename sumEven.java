package thursdayLab1;

public class sumEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={2,3,4,5,6,7,8,9,10};
        int sumEven=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                sumEven=sumEven+nums[i];
            }
        }
        System.out.println(sumEven);

	}

}
