a = [1.55556,3.2123,3.11,1,0,2]

m = 0
i = 0
while i < len(a):
    if m < a[i]:
        m = a[i]
    i = i + 1

print("Maximum is ", m)
