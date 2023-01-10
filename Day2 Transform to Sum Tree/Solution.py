# Driver Code Starts
#Initial Template for Python 3
#Contributed by Sudarshan Sharma
import sys
sys.setrecursionlimit(10**6)
from collections import deque
# Tree Node
class Node:
    def __init__(self, val):
        self.right = None
        self.data = val
        self.left = None
# Function to Build Tree
def buildTree(s):
   #Corner Case
   if(len(s)==0 or s[0]=="N"):
        return None
    # Creating list of strings from input
    # string after spliting by space
    ip=list(map(str,s.split()))
    # Create the root of the tree
    root=Node(int(ip[0]))
    size=0
    q=deque()
    # Push the root to the queue
    q.append(root)
    size=size+1
    # Starting from the second element
    i=1
   while(size>0 and i<len(ip)):
        # Get and remove the front of the queue
