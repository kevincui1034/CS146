def floodFill(image, sr, sc, color):
    def fill(image, sr, sc, oldColor, color):
        if (sr < 0 or sr >= len(image) or sc < 0 or sc >= len(image[0]) or
                image[sr][sc] != oldColor or image[sr][sc] == color):
            return
        image[sr][sc] = color
        fill(image, sr + 1, sc, oldColor, color)
        fill(image, sr - 1, sc, oldColor, color)
        fill(image, sr, sc + 1, oldColor, color)
        fill(image, sr, sc - 1, oldColor, color)

    fill(image, sr, sc, image[sr][sc], color)
    return image

image = [
        [1, 1, 1],
        [1, 1, 0],
        [1, 0, 1]
    ]
sr = 1
sc = 1
color = 2
filled = floodFill(image, sr, sc, color)

print("\nFlood Fill:")
for row in filled:
    for pixel in row:
        print(pixel, end=" ")
    print()