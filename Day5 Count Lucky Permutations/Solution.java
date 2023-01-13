//Credits Santhosh Hariharan
//Driver code
import java.util.*;
Class GFG{
    public static void main(String[] args)throws IOException{
            BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
            int t= Interger.parsInt(read.readLine());
            while(t-->0){
            String s[]=read.readLine();.split(" ");
            int N =Integer.parseInt(s[0]);
            int M=Integer.parseInt(s[1]);
            int arr[]=new int[(int)(N)];
            int i=0;
            String inputLine2[]=read.readLine().trim().split(" ");
            for(int i=0;i<N;i++)
            arr[i]=Integer.parseInt(inputLine2[i]);
            int graph[][]=new int [M][2];
            for(i=0;i<M;i++){
                String s1[]=read.readLine().trim().split(" ");
                graph[i][0]=Integer.parseInt(s1[0]);
                graph[i][1]=Integer.parseInt(s1[1]);
            }
            Solution ob =new Solution();
            System.out.println(ob.luckyPermutations(N,M,arr,graph));
    
        }
}}
//end of Driver code
//Solution
class Solution {
    long luckyPermutations(int N, int M, int arr[], int[][] graph) {
        long[][]dp=new long[N][1<<N];
        boolean[][]adj =new boolean[N][N];
        for(int i=0;i<M;i++){
            adj[graph[i][0]-1][graph[i][1]-1]=true;
            adj[graph[i][1]-1][graph[i][0]-1]=true;}
            for(int i=0;i<N;i++)
            dp[i][1<<i]=1;
            for(int bitmask=1;bitmask<(1<<N);bitmask++){
                for(int i=0;i<N;i++){
                    for(int j=0;j<N;j++){
                    if(i!=j && adj[arr[i]-1][arr[j]-1] && arr[i]!=arr[j] && (1 &(bitmask>>j))>0)
                    dp[i][bitmask]+=dp[j][bitmask ^ (1<<i)];   