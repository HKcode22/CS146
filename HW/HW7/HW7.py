import heapq
from typing import List

def minMeetingRooms(intervals: List[List[int]]) -> int:   
    minheap = []

    for i in range(len(intervals)):
        # interval = intervals[i]
        if minheap and minheap[0] <= intervals[i][0]:
            heapq.heappop(minheap)
        heapq.heappush(minheap, intervals[i][1])

    return len(minheap)

if __name__ == "__main__":
    intervals1 = [[0, 30], [5, 10], [15, 20]]
    print("Minimum Number of Servers Required:", minMeetingRooms(intervals1))

    intervals2 = [[0, 1], [1, 2], [2, 3]]
    print("Minimum Number of Servers Required:", minMeetingRooms(intervals2))
