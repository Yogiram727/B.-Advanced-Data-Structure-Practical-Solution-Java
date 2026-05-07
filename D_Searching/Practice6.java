package D_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Practice6 {
    
    public int linearSearch(int arr[],int value){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==value){
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int arr[],int target){
        int n=arr.length;
        int first=0,last=n-1,middle;
        while(first<=last){
            middle=first+(last-first)/2;
            if(arr[middle]==target){
                return middle;
            }
            if(arr[middle]>target){
                last=middle-1;
            }else{
                first=middle+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Practice6 se=new Practice6();
        Scanner sc=new Scanner(System.in);
        int arr[]={1,3,4,5,6,8};
        int value;
        System.out.println("Given Array: "+Arrays.toString(arr));

        System.out.println("Enter the element that you want to search");
        value=sc.nextInt();

        // int result=se.linearSearch(arr, value);
        int result=se.binarySearch(arr, value);
        if(result==-1){
            System.out.println("Value not found");
        }else{
            System.out.println("Element is at index: "+result);
        }
    }
}
