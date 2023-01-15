from collections import defaultdict
#this code was done By santhosh hariharan
#Driver Code Starts
#Initial Template for Python 3
if __name__ == '__main__':
    for _ in range(int(input(())):
        S = input()
        print(Solution().countSubstring(s))
#  Driver Code Ends
class Solution():
    def countSubstring(self, S):
        #your code here
        x1=defaultdict(int)
        x2=defaultdict(int)
        count=0
        x1[0]=1
        x2[1]=1
        ans=0
