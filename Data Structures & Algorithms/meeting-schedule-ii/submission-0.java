/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {

        if(intervals == null || intervals.size() == 0)
            return 0;
        
        // Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        Collections.sort(intervals, (a,b) -> Integer.compare(a.start, b.start));
        Queue<Integer> minHeap = new PriorityQueue<>();
        
        for(Interval interval : intervals){
            if(!minHeap.isEmpty() && interval.start >= minHeap.peek()){
                minHeap.poll();
            }
            minHeap.offer(interval.end);
        }

        return minHeap.size();
    }
}
