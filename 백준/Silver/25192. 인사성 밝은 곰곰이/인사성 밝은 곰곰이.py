n = int(input())
dic={}
cnt = 0
for _ in range(n):
    x = input()
    if x=="ENTER":
        for key,value in dic.items():
            if value==1:
                cnt+=1
        dic={}
    else:
        if x not in dic:
            dic[x]=1

for key,value in dic.items():
    if value==1:
        cnt+=1
print(cnt)