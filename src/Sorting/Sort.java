package Sorting;

public class Sort {
    public static void main(String[] args) {
        int nums[] = {10, 9, 8, 1, 7, 6};

//        Bobble_Sort(nums);
//        Selection_Sort(nums);
//        Insertion_Sort(nums);
//        Quick_Sort(nums,0,nums.length-1);
          Merge_Sort(nums,0,nums.length-1);
        for (int num:nums)
        {
            System.out.print(num+" ");
        }
    }




    public static void Bobble_Sort(int[] nums) {
        System.out.println("Before");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        int steps=0;
        for (int i=0;i< nums.length;i++)
        {
            for (int j = 0; j < nums.length-i-1 ; j++) {
                if(nums[j]>nums[j+1])
                {
                    steps++;
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
                System.out.println();
                for (int num : nums) {
                    System.out.print(num + " ");
                }
            }
        }
        System.out.println();
        System.out.println("after:");
        System.out.println("Itration:"+steps);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }


    public static void Selection_Sort(int[] nums) {
        int min=0,temp=0;
        System.out.println();
        System.out.println("Before");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        for (int i = 0; i < nums.length-1; i++) {
            min=i;
            for(int j=i+1;j< nums.length;j++)
            {
                if(nums[min]>nums[j])
                {
                    min=j;
                }
            }
            temp=nums[min];
            nums[min]=nums[i];
            nums[i]=temp;
            System.out.println();
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        System.out.println("after:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }


    public static void Insertion_Sort(int[] nums) {
        int key,j,steps=0;
        for(int num:nums)
        {
            System.out.print(num+" ");
        }
        for(int i=1;i<nums.length;i++)
        {
            key=nums[i];
            j=i-1;
            while (j>=0 && nums[j]>key)
            {
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=key;
        }
        System.out.println();
        for (int num:nums)
        {
            System.out.print(num+" ");
        }
    }


    public static void Quick_Sort(int[] nums, int low, int high) {
        if(low<high)
        {
            int pi=partion(nums,low,high);

            Quick_Sort(nums,low,pi-1);
            Quick_Sort(nums,pi+1,high);
        }

    }

    private static int partion(int[] nums, int low, int high) {
        int pivot=nums[high];
        int i=low-1;
        for (int j=low;j<high;j++)
        {
            if(nums[j]<pivot)
            {
                i++;
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        int temp=nums[i+1];
        nums[i+1]=nums[high];
        nums[high]=temp;

        return i+1;
    }
    private static void Merge_Sort(int[] nums, int l, int r) {
        if(l<r)
        {
            int mid=(l+r)/2;
            Merge_Sort(nums,l,mid);
            Merge_Sort(nums,mid+1,r);
            Merge(nums,l,mid,r);
        }

    }

    private static void Merge(int[] nums, int l, int mid, int r) {
        int n1=mid-l+1;
        int n2=r-mid;
        int[] lnums=new int[n1];
        int[] rnums=new int[n2];

        for (int x = 0; x <n1 ; x++) {
            lnums[x]=nums[l+x];
        }
        for (int x = 0; x <n2 ; x++) {
            rnums[x]=nums[mid+1+x];
        }
        int i=0;
        int j=0;
        int k=l;
        while (i<n1 && j<n2) {
            if (lnums[i] <= rnums[j]) {
                nums[k] = lnums[i];
                i++;
            } else {
                nums[k] = rnums[j];
                j++;
            }
            k++;
        }
            while (i<n1)
            {
                nums[k]=lnums[i];
                i++;
                k++;
            }
            while (j<n2)
            {
                nums[k]=rnums[j];
                j++;
                k++;
            }
        }
    }

