from collections import deque
class graph:
    def floodFill(self,image,sr,sc,color):
        oc = image[sr][sc]
        if oc != color:
            self.bfs(image,sr,sc,oc,color)
        return image
    
    def bfs(self,image,i,j,oc,newcolor):
        if oc == newcolor or i<0 or i>= len(image) or j<0 or j>=len(image[0]) or image[i][j] != oc:
            return image
        queue = deque([(i,j)])

        while queue:
            r,c = queue.popleft()

            if r < 0 or r >= len(image) or c<0 or c>= len(image[0]) or image[r][c] != oc:
                continue

            image[r][c] = newcolor
            queue.append((r-1,c))#up
            queue.append((r+1,c))#down
            queue.append((r,c-1))#left
            queue.append((r,c+1))#right

        return image
    
def main():
    g = graph()

    image = [
            [1,1,1],
            [1,1,0],
            [1,0,1]
    ]

    sr = 1
    sc = 1
    ncolor = 2

    op = g.floodFill(image, sr, sc, ncolor)
    for row in op:
        print(row)

if __name__ == "__main__":
    main()
