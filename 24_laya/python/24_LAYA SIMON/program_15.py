import numpy as np
A = np.array([[1, 2, 3],
              [4, 5, 6],
              [7, 8, 9]])
U, S, VT = np.linalg.svd(A)
Sigma = np.zeros((3, 3))
np.fill_diagonal(Sigma, S)
A_reconstructed = np.dot(U, np.dot(Sigma, VT))
print("Original Matrix A:")
print(A)
print("\nMatrix U:")
print(U)
print("\nSingular Values (S):")
print(S)
print("\nMatrix Sigma:")
print(Sigma)
print("\nMatrix VT:")
print(VT)
print("\nReconstructed Matrix A:")
print(A_reconstructed)
print("\nIs the reconstruction accurate?")
print(np.allclose(A, A_reconstructed))

