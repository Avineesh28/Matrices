mat=[]
m=int(input('Enter no of rows'))
n=int(input('Enter no of columns'))
print('Enter elements row-wise')
for i in range(0,m,1):
    l=[]
    for j in range(0,n,1):
        l.append(int(input()))
    mat.append(l)
mt=[]
for j in range (n):
    l=[]
    for i in range(m):
        l.append(mat[i][j])
    mt.append(l)
print('Matrix')
for i in range (m):
    for j in range(n):
        print(mat[i][j], end=" ")
    print()
print('Transpose')
for i in range (len(mt)):
    for j in range(len(mt[i])):
        print(mt[i][j], end=" ")
    print()
