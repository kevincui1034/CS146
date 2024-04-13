def canFinish(numCourses, prerequisites):
    indegree = [0] * numCourses
    adj = [[] for x in range(numCourses)]
    
    for prereq in prerequisites:
        adj[prereq[1]].append(prereq[0])
        indegree[prereq[0]] += 1

    queue = []
    for i in range(numCourses):
        if indegree[i] == 0:
            queue.append(i)
    
    visited = 0
    while queue:
        node = queue.pop(0)
        visited += 1
        for neighbor in adj[node]:
            indegree[neighbor] -= 1
            if indegree[neighbor] == 0:
                queue.append(neighbor)
    
    return numCourses == visited

def testCase():
    result1 = canFinish(2, [[1, 0]])
    print("Test case 1: ",result1)

    result2 = canFinish(2, [[1, 0], [0, 1]])
    print("Test case 2: ",result2)

testCase()