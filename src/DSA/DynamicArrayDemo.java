package DSA;

import java.util.Scanner;

class DynamicArray{
    final int initialcapacity=4;
    private int arr[];
    private int size;
    private  int capacity;
    public DynamicArray()
    {
        size=0;
        arr=new int[initialcapacity];
        capacity=initialcapacity;
    }
    public  void addlist(int val)
    {
        if(size==capacity)
        {
            expandesize();
        }
        arr[size++]=val;
    }
    private void expandesize()
    {
        capacity*=2;
        arr=java.util.Arrays.copyOf(arr,capacity);
    }
    public void displaylist()
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public void addlistpos(int pos,int val)
    {
     if(size==capacity)
     {
         expandesize();
     }
     for(int i=size-1;i>=pos;i--)
     {
         arr[i+1]=arr[i];
     }
     arr[pos]=val;
     size++;
    }
    public  void deletelist(int pos)
    {
        for(int i=pos+1;i<size;i++)
        {
            arr[i-1]=arr[i];
        }
        size--;
    }
public  int listlength()
{
    return size;
}



}
public class DynamicArrayDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DynamicArray list=new DynamicArray();
        int val,pos,choice;
        while (true) {
            System.out.println("Enter Choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter The Value to add");
                    val = sc.nextInt();
                    list.addlist(val);
                    break;
                case 2:
                    System.out.println("Elements in The List:");
                    list.displaylist();
                    list.listlength();
                    break;
                case 3:
                    System.out.println("Enter The  pos Element:");
                    pos=sc.nextInt();
                    if(pos<0)
                    {
                        System.out.println("Invalid pos:");
                    }
                    System.out.println("Enter The val:");
                    val= sc.nextInt();
                    list.addlistpos(pos,val);
                    break;
                case 4:
                    System.out.println("Delete The Element:");
                    pos=sc.nextInt();
                    if(pos<0)
                    {
                        System.out.println("Invalid Pos:");
                    }
                    list.deletelist(pos);
                    break;
                case 5:System.exit(0);
                    break;
                default:
                    System.out.println("Invalid case to give 1--5");
            }
            System.out.println();
        }

    }
}
