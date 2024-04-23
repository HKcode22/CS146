import heapq

def minCostToSupplyWater(n, wells, pipes):
    graph = []

    for _ in range(n+1):
        graph.append([])
    
    for i in range(len(wells)):
        cost = wells[i]
        graph[0].append((cost, i + 1))
 
    
    # Add edges representing pipe connections
    for house1, house2, cost in pipes:
        graph[house1].append((cost, house2))
        graph[house2].append((cost, house1))
    
    visited = set()
    min_cost = 0
    pq = graph[0]  
    heapq.heapify(pq)
    
    while pq:
        cost, house = heapq.heappop(pq)
        if house not in visited:
            visited.add(house)
            min_cost += cost
            for neighbor_cost, neighbor_house in graph[house]:
                if neighbor_house not in visited:
                    heapq.heappush(pq, (neighbor_cost, neighbor_house))
    
    return min_cost


n = 2
wells = [1, 1]
pipes = [[1, 2, 1], [1, 2, 2]]
print(minCostToSupplyWater(n, wells, pipes))  
