t = input()
t = int(t)
list=[]

for i in range(t):
    val = input()
    val = int(val)
    list.append(val)

for val in list:
    if 360%(180-val) == 0:
        print("YES")
    else :
        print("NO")

