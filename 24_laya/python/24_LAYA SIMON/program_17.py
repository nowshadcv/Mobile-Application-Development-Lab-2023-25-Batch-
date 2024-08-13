from matplotlib import pyplot
# imports pandas package, used for data analysis
import pandas
# reads the csv file into a data frame
# A data frame is a table with rows and columns
df = pandas.read_csv("iris.csv")
fig,ax = pyplot.subplots(1,1)

# plots the histogram of petal length attribute
# By default bins = 10
df['sepal.length'].plot(kind='hist', edgecolor="black",bins=49)
ax.set_title("Histogram")
ax.set_xticks([1.0,1.5,2.0,2.5,3.0,3.5,4.0,4.5,5.0,5.5,
6.0,6.5,7.0])
ax.set_yticks([0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,
17,18,19])
ax.set_xlabel('sepal Length')
pyplot.show()
