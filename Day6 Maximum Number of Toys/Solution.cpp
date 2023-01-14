//Credits santhosh Hariharan
#include<bits/stdc++.h>
using namespace std;
//Driver Code
 int main() {
  int t=1;
  cin>>t;
  for (int i=1;i<=t;i++){
     int N;
     cin>>N;
    vector<int>A(N);
     for(auto &i:A){
       cin>>i;
     }
     int Q;
     cin>>Q;
    vector<vector<int>> Queries(Q);
    for(int i=0;i<Q;i++){
       int x,y;
      cin>>x>>y;
      Queries[i].push_back(x);
      Queries[i].push_back(y);
      for(int j=0;j<Queries[i][1];j++){
         cin>>x;
        Queries[i].push_back(x);
      }}
     Solution obj;
     auto ans =obj.maximumToys (N,A,Q,Queries);
     for (auto i:ans)
    cout<<endl;
      }}
//Code Starts
//User function Template for C++
const int N=1e6+5;
int fr[N];
class tree{
public:
  vector<long long> bit;
  tree(){
    bit=vector<long long>(N);
  }
  void add(int node,int v)
  {
     for(;node<N;node+=(node&(-node)))
      bit[node]+=v;
  }
  long long get(int node)
  {
    long long x=0;
    for(;node>0;node-=(node&(-node)))
      x+=bit[node];
    return x;
  }
};
tree obj1,obj2;
class Solution{
public:
  vector<int> maximumToys(int N,vector<int> A,int Q,vector<vector<int>> Queries){
      // code here