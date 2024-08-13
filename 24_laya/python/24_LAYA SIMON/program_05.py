def member(l1,l2):
    return any(elements in l2 for elements in l1)
l1=[10,20,30,40,50,]
l2=[20,70,80,90]
print(member(l1,l2))
