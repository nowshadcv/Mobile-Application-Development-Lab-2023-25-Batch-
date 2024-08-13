from matplotlib import pyplot
import pandas
df = pandas.read_csv('iris.csv')
fig, ax = pyplot.subplots(1,1)
# Creates a dictionary of colour values of each species
colors = {'Setosa':'red', 'Versicolor':'green',
'Virginica':'blue'}
# Groups the data based on species values
grouped = df.groupby('species')
# group represents the grouped data frame
# draws the scatter plot for each group
for key, group in grouped:
    group.plot(ax=ax, kind='scatter', x='sepal.length',y='sepal.width', label=key, color=colors[key])
    ax.set_title("Scatter Plot")
    ax.set_xlabel('sepal Length')
    ax.set_ylabel('sepal Width')
pyplot.show()
