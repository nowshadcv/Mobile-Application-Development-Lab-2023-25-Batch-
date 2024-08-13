
import numpy as np
tx, ty = 2, 3
theta = np.radians(45)
sx, sy = 2, 3
T = np.array([[1, 0, tx], [0, 1, ty], [0, 0, 1]])
R = np.array([[np.cos(theta), -np.sin(theta), 0],
              [np.sin(theta),  np.cos(theta), 0],
              [0, 0, 1]])
S = np.array([[sx, 0, 0], [0, sy, 0], [0, 0, 1]])
print("Translation Matrix:\n", T)
print("\nRotation Matrix:\n", R)
print("\nScaling Matrix:\n", S)
