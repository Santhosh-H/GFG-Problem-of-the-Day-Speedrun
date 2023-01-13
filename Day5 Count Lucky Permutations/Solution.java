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
