import  java.util.Queue;
import  java.util.LinkedList;

class Main{
	public static void main(String[]args) {
		//Creating Queue using the Linkedclass
		
		Queue<Integer> numbers= new LinkedList<>();
		
		//offer elements to  the Queue
		numbers.offer(1);
		numbers.offer(2);
		numbers.offer(3);
		System.out.println("Queue:"+numbers);
		
		//Acess the elments of the Queue
		int accessedNumber=numbers.peek();
		System.out.println("Accessed Element:"+ accessedNumber);
		
		//Remove elements from the Queue
		int removedNumber=numbers.poll();
		
		System.out.println("Removed Element:"+ removedNumber);
		
		System.out.println("Upadated Queue:"+numbers);
	}
}