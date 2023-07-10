import sys

# Read input from Codeforces
s = sys.stdin.readline().strip()
n = len(s)
m = int(sys.stdin.readline())
queries = [[0 for _ in range(2)] for _ in range(m)]
for i in range(m):
    v1, v2 = map(int, sys.stdin.readline().split())
    queries[i][0] = v1
    queries[i][1] = v2
 
dp = [0]
for i in range(1, len(s)):
    if s[i] == s[i-1]:
        dp.append(dp[i-1] + 1)
    else:
        dp.append(dp[i-1])
 
for i in range(m):
    print(dp[queries[i][1] - 1] - dp[queries[i][0] - 1])
