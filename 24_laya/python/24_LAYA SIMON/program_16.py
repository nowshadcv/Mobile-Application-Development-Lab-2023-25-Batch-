from matplotlib import pyplot
from numpy import array
fig,ax = pyplot.subplots(1,1)
a = array([22,87,5,43,56,73,55,54,11,20,51,5,79,31,27])
ax.hist(a,bins=[0, 10, 20, 30, 40, 50, 60, 70, 80,90,100])
ax.set_title("histogram of result")
ax.set_xticks([0, 10, 20, 30, 40, 50, 60, 70, 80, 90,100])
ax.set_xlabel('marks')
ax.set_ylabel('no. of students')
pyplot.show()
