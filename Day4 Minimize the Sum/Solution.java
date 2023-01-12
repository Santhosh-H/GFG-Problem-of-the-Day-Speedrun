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