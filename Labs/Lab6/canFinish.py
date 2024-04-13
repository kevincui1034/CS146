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
    result_1 = canFinish(2, [[1, 0]])
    if result_1 == True:
        print("Test case 1 passed")
    else:
        print("Test case 1 failed")

    result_2 = canFinish(2, [[1, 0], [0, 1]])
    if result_2 == True:
        print("Test case 2 passed")
    else:
        print("Test case 2 failed")

testCase()