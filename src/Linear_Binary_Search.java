import java.util.Arrays;
import java.util.Scanner;

public class Linear_Binary_Search {
    public static void main(String[] args) {
       // int nums[]={1,10,3,5,75,44,43,50,61,53,55};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size:");
        int size=sc.nextInt();
        int nums[]=new int[size];
        for (int i = 0; i < size; i++) {
           nums[i]= sc.nextInt();
        }
        System.out.println("What is an Target Element:");
        int target= sc.nextInt();
        System.out.println("Bineary_Search");
        int result2=Bineary_Search(nums,target);
        System.out.println("The Target index is:"+result2);
        System.out.println("Linear_Search");
        int result1=Linear_Search(nums,target);
        System.out.println("The Target index is:"+result1);
    }
    public static int Linear_Search(int[] nums, int target) {
        int step=0;
        for(int i=0;i<nums.length;i++)
        {
            step++;
            if(nums[i]==target) {
                System.out.println(step);
                return i;
            }
        }
       System.out.println(step);
        return 0;
    }
    public static int Bineary_Search(int[] nums, int target) {
        int left=0;
        int right= nums.length-1;
        int step=0;
        while (left<=right)
        {
            int mid=(left+right)/2;
            step++;
            if(nums[mid]==target)
            {
                System.out.println("Number of Step Executed:"+step);
                return mid;
            }
            else if(nums[mid]<target)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        System.out.println("Number of Step Executed:"+step);
        return 0;
    }
}