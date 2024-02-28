from typing import List

class HW7:
    def minMeetingRooms(self, intervals: List[List[int]]) -> int:
        ## Catches improper input
        if not intervals:
            return "Incorrect formatting"
        
        ## Puts start and end into different arrays
        start_time = sorted(i[0] for i in intervals)
        end_time = sorted(i[1] for i in intervals)
        
        ## Initialize pointer
        in_use = 0
        start = end = 0
        intervals_size = len(intervals)
        
        ## Iterate through the intervals
        while start < intervals_size:
            if start_time[start] >= end_time[end]:
                
                ## Takes out a room
                in_use -= 1
                end += 1
            
            ## Room in use
            in_use += 1
            start += 1
        
        return in_use

hw7 = HW7()
intervals1 = [[0,30],[5,10],[15,20]]
intervals2 = [[0,1],[1,2],[2,3]]
print(hw7.minMeetingRooms(intervals1))
print(hw7.minMeetingRooms(intervals2))
