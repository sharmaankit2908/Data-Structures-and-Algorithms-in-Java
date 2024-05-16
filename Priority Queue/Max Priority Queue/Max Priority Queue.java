import java.util.ArrayList;

public class PQ {
	private ArrayList<Integer> heap;

	public PQ(){
		heap=new ArrayList<>();
	}
	// Complete this class
	boolean isEmpty() {
		// Implement the isEmpty() function here
		return heap.isEmpty();
	}

	int getSize() {
		// Implement the getSize() function here
		return heap.size();
	}

	int getMax() {
		// Implement the getMax() function here
		if (heap.size()==0){
			return Integer.MIN_VALUE;
		}	
		return heap.get(0);
	}

	void insert(int element) {
		// Implement the insert() function here
		heap.add(element);
		int child_index=heap.size()-1;
		int parent_index=(child_index-1)/2;
		while (child_index > 0){
			if (heap.get(parent_index) < heap.get(child_index)){
				int temp=heap.get(child_index);
				heap.set(child_index,heap.get(parent_index));
				heap.set(parent_index, temp);
				child_index=parent_index;
				parent_index=(child_index-1)/2;
			}
			else{
				return;
			}
			
		}
	}

	int removeMax() {
		// Implement the removeMax() function here
		if (heap.size()==0){
			return Integer.MIN_VALUE;
		}
		
		int max_element=heap.get(0);
		heap.set(0, heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		int parent_index=0;
		int child_index1=2*parent_index+1;
		int child_index2=2*parent_index+2;
		int maximum=heap.get(parent_index);
		while(heap.size()-1 >= (2*parent_index+1)){
			child_index1=2*parent_index+1;
			child_index2=2*parent_index+2;
			int m=0;
			maximum=heap.get(parent_index);
			if ((heap.size()> child_index1) && (heap.get(child_index1) > maximum)){
				maximum=heap.get(child_index1);
				m=1;
			}
			if ((heap.size()> child_index2) && (heap.get(child_index2)> maximum)){
				maximum=heap.get(child_index2);
				m=2;
			}
			if (m==0){
				break;
			}
			else if (m==1){
				int temp=heap.get(child_index1);
				heap.set(child_index1,heap.get(parent_index));
				heap.set(parent_index, temp);
				parent_index=child_index1;
			}
			else if (m==2){
				int temp=heap.get(child_index2);
				heap.set(child_index2,heap.get(parent_index));
				heap.set(parent_index, temp);
				parent_index=child_index2;
			}
		}
		return max_element;
		
	}
}