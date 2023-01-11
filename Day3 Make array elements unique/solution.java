import java.util.*;
import java.lang.*;
import java.io.*;
class make{
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine().trim());
        while(t-->0){
            int t=0;
            int N=Integer.parseInt(br.readLine().trim());
            int arr[]=new int[(int)(N)];
            String inputLine2[]=br.readLine().trim().split(" ");
            for(int i=0;i<N;i++){
                arr[i]=Integer.parseInt(inputLine2[i]);
            }
            Solution ob= new Solution();
            System.out.println(ob.minIncrement(arr,N));
        }
    }
}
class Solution{
    public long minIncrement(int[] ar,int N){
        int ans=0;
        Arrays.sort(arr);
        for(int i=1;i<N;i++){
            if(arr[i]<=arr[i-1]){
              int d=arr[i-1]-arr[i];
              ans=ans+d+1;
              arr[i]=arr[i-1]+1;

            }
        }
    }return ans;
}