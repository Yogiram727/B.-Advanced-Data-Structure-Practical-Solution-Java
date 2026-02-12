package A_Advanced_DSA_Solutions.A_Arrays;

public class G_PairSum {
    
    public void sumPair(int arr[],int target){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("Pair Found"+arr[i]+","+arr[j]); 
                }
            }
        }
    }

}
