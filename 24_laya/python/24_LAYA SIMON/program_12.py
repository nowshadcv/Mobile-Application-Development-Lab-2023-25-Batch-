
import numpy as np
A = np.array([[1, 2, 3], [4, 5, 6], [7, 8, 9]])
B = np.array([[9, 8, 7], [6, 5, 4], [3, 2, 1]])
print("Addition:\n", A + B)
print("\nSubtraction:\n", A - B)
print("\nMatrix Multiplication:\n", np.dot(A, B))
print("\nScalar Multiplication:\n", A * 2)
print("\nTranspose of A:\n", A.T)
print("\nTranspose of B:\n", B.T)
