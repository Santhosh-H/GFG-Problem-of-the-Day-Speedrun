class Solution():
    def solve(self,N,A):
        for i in range(N-1,0,-1):
            if(A[i]>=9):
                pass
            else:
                return i+1

#driver code starts
#initial 
for _ in range(int(input())):
    n=int(input())
    array=[int(i)for i in input().split()]
    obj=Solution()
    print(obj.solve(n,array))
# Driver Code ends
#input use
# n=4
# redo n value as above 4
# input array 3 1 4 5
#answer 4