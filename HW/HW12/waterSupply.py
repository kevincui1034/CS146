from typing import List
class waterSupply:
    def minCostToSupplyWater(self, n: int, wells: List[int], pipes: List[List[int]]) -> int:
        parents = list(range(n+1))
        
        def find(x):
            if x != parents[x]:
                parents[x] = find(parents[x])
            return parents[x]
        
        def union(x, y):
            r = find(x)
            r2 = find(y)
            if r != r2:
                parents[r2] = r
                return True
            else:
                return False
            
        edges = []
        
        for u, v, c in pipes:
            edges.append((c, u-1, v-1))
            
        for i, c in enumerate(wells):
            edges.append((c, i, n))
        
        edges.sort()
        ans = 0
        for c, u, v in edges:
            if union(u,v):
                ans += c
        return ans

system = waterSupply()
n = 2
wells = [1, 1]
pipes = [[1, 2, 1], [1, 2, 2]]
result = system.minCostToSupplyWater(n, wells, pipes)
print(result)