//Credits Santhosh Hariharan
Class Solution{
    long minimizeSum(int N,int arr[]){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>
        for(int i = 0; i < N;i++)
        pq.add(arr[i]);
        int ans=0;
        while(pq.size()>1){
            int st=pq.remove();
            int nd=pq.remove();
            int nsum=st+nd;
            ans=ans+nsum;
            pq.add(nsum);
        }
    return ans;
    }
}
//Driver Code
public class GFG{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int A[]=new int[n];
            for(int i=0;i<n;i++)
            A[i]=sc.nextInt();
            Solution obj=new Solution();
            long ans=obj.minimizeSum(n,A);
            System.out.println(ans);
        
        }


    }
}
//Credits Santhosh Hariharan