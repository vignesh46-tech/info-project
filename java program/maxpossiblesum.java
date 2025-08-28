package qspiderTest;

import java.util.PriorityQueue;

public class maxpossiblesum {
	public static void main(String[] args) {
     int [] a= {3,4,5,6,-1,4,-7};
     int k=3;
     PriorityQueue<Integer> pq=new PriorityQueue<>();
     for(int ele:a) 
        pq.offer(ele);
     
     
     while(k-->0)
    	 pq.offer(-pq.poll());
     
     
     int sum=0;
     for(int ele:pq) 
    	 sum+=ele;
     System.out.println(sum);
	}
}

