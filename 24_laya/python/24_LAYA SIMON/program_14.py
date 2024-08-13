
import numpy as np
tx, ty, tz = 2, 3, 4
theta = np.radians(45)
sx, sy, sz = 2, 3, 4
T = np.array([[1, 0, 0, tx], [0, 1, 0, ty], [0, 0, 1, tz], [0, 0, 0, 1]])
R_x = np.array([[1, 0, 0, 0], [0, np.cos(theta), -np.sin(theta), 0], [0, np.sin(theta), np.cos(theta), 0], [0, 0, 0, 1]])
R_y = np.array([[np.cos(theta), 0, np.sin(theta), 0], [0, 1, 0, 0], [-np.sin(theta), 0, np.cos(theta), 0], [0, 0, 0, 1]])
R_z = np.array([[np.cos(theta), -np.sin(theta), 0, 0], [np.sin(theta), np.cos(theta), 0, 0], [0, 0, 1, 0], [0, 0, 0, 1]])
S = np.array([[sx, 0, 0, 0], [0, sy, 0, 0], [0, 0, sz, 0], [0, 0, 0, 1]])
print("Translation Matrix:\n", T)
print("\nRotation Matrix (x-axis):\n", R_x)
print("\nRotation Matrix (y-axis):\n", R_y)
print("\nRotation Matrix (z-axis):\n", R_z)
print("\nScaling Matrix:\n", S)
