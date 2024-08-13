

l1 = [10, 20, 10, 30, 5, 90, 70, 5]
print("initial list",l1)
count = 0
i = 0
while i < len(l1):
    j = i + 1
    while j < len(l1):
        if l1[i] == l1[j]:
            del l1[j]
        else:
            j += 1
    i += 1

print("List after removing duplicates:", l1)
