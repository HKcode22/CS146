from collections import defaultdict, deque

def canFinish(numCourses, prerequisites):

    graph = defaultdict(list) 
    indegerees = [0] * numCourses

    q = deque()

    for i in range(len(prerequisites)):
        a = prerequisites[i][0]
        b = prerequisites[i][1]
        graph[b].append(a)
        indegerees[a] += 1
        # indegerees[b] += 1

    visited = set()

    for i in range(len(indegerees)):
        if indegerees[i] == 0:
            q.append(i)

    if not q:
        return False
    
    while q:
        curentCourse = q.popleft()
        visited.add(curentCourse)

        for nextCourse in graph[curentCourse]:
            indegerees[nextCourse] -= 1
            if indegerees[nextCourse] == 0:
                q.append(nextCourse)

    if len(visited) == numCourses:
        return True
    else:
        return False
    
def main():
    numCourses = 2
    prerequisites = [[1, 0]]
    if canFinish(numCourses, prerequisites):
        print("true")
    else:
        print("false")

    numCourses = 2
    prerequisites = [[1, 0],[0,1]]
    if canFinish(numCourses, prerequisites):
        print("true")
    else:
        print("false")

if __name__ == "__main__":
    main()