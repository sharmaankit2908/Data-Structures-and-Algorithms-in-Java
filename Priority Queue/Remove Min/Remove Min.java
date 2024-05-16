import java.util.ArrayList;



public class PQ {

	private ArrayList<Integer> heap;

	public PQ() {
		heap = new ArrayList<Integer>();
	}

	boolean isEmpty() {
		return heap.size() == 0;
	}

	int size() {
		return heap.size();
	}

	int getMin() throws PriorityQueueException {
		if (isEmpty()) {
			// Throw an exception
			throw new PriorityQueueException();
		}
		return heap.get(0);
	}

	void insert(int element) {
		heap.add(element);
		int childIndex = heap.size() - 1;
		int parentIndex = (childIndex - 1) / 2;

		while (childIndex > 0) {
			if (heap.get(childIndex) < heap.get(parentIndex)) {
				int temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			} else {
				return;
			}
		}
	}

	int removeMin() throws PriorityQueueException {
		// Complete this function
		// Throw the exception PriorityQueueException if queue is empty
		if (isEmpty()) {
			// Throw an exception
			throw new PriorityQueueException();
		}
		int temp1=heap.get(0);
		heap.set(0, heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		int parentIndex=0;
		int childIndex1=2*parentIndex+1;
		int childIndex2=2*parentIndex+2;
		int minimum=heap.get(parentIndex);
		int i=0;
		while ((heap.size()-1) >= (2*parentIndex+1)){
			childIndex1=2*parentIndex+1;
			childIndex2=2*parentIndex+2;
			minimum=heap.get(parentIndex);
			int m=0;
			if ((heap.size()>childIndex1) && (heap.get(childIndex1) <minimum)){
				minimum=heap.get(childIndex1);
				m=1;
			}
			if ((heap.size()>childIndex2) && (heap.get(childIndex2) <minimum)){
				minimum=heap.get(childIndex2);
				m=2;
			}

			if (m==0){
				break;
			}
			else if (m==1){
				int temp=heap.get(parentIndex);
				heap.set(parentIndex,minimum);
				heap.set(childIndex1,temp);
				parentIndex=childIndex1;
			}
			else if (m==2){
				int temp=heap.get(parentIndex);
				heap.set(parentIndex,minimum);
				heap.set(childIndex2,temp);
				parentIndex=childIndex2;
			}

		}
		return temp1;
	}
}

class PriorityQueueException extends Exception {

}