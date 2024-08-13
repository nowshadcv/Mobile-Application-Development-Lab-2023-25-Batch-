f=open("hello.txt",'r')

d=f.read()
d=d.replace("laya","bla")
f.close()
z=open("hello.txt",'w')
z.write(d)
    
z.close()
