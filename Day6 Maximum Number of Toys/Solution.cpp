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
