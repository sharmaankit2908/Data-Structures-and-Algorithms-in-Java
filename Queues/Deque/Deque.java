/******************
 * Following is the main function we are using internally.
 * Refer this for completing the Dequeue class
 *
 
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Dequeue dq = new Dequeue(10);

		while(true){
			int choice = s.nextInt(),input;
			switch (choice) {
			case 1:
				input = s.nextInt();
				dq.insertFront(input);
				break;
			case 2:
				input = s.nextInt();
				dq.insertRear(input);
				break;
			case 3:
				dq.deleteFront();
				break;
			case 4:
				dq.deleteRear();
				break;
			case 5:
				System.out.println(dq.getFront());
				break;
			case 6:
				System.out.println(dq.getRear());
				break;
			default:
				return ;
			}  
		}
	} 
 ******************/

public class Dequeue {
    // Complete this class
	int a[];
	Dequeue(int n){
		a=new int[n];
		int front=-1;
		int rear=-1;
		public int size=10;
	}
	public static void insertFront(int n){
		if ((front==0 && rear=size-1) || (front+1==rear)){
			return -1;
		}
		else if (front==-1 && rear==-1){
			front=0;
			rear=0;
			a[front]=n;
		}
		else if (front ==0){
			front=size-1;
			a[front]=n;
		}
		else{
			front=front-1;
			a[front]=n;
		}
	}

	public static void insertRear(int n){
		if ((front==0 && rear=size-1) || (front+1==rear)){
			return -1;
		}
		else if (front==-1 && rear==-1){
		
			front=rear=0;
			a[rear]=n;
		}
		else if(rear=size-1){
			rear=0;
			a[rear]=n;
		}
		else{
			rear=rear+1;
			a[rear]=n;
		}
	}
	public static int deleteFront(){
		if (front==-1 && rear==-1){
			return -1;
		}
		else if (front==rear){
		
			front=rear=-1;
			
		}
		else if (front==0){
			
			front =size-1;
			
		}
		else{
			
			front=front-1;
		
		}
	}

	public static void deleteRear(){
		if (front==-1 && rear==-1){
			return -1;

		}
		else if (front==rear){

			front=rear=-1;
	
		}
		else if (rear==0){
	
			rear =size-1;
	
		}
		else{
		
			rear=rear-1;
		
		}
	}

	public static int getFront(){
		if (front==-1 && rear==-1){
			return -1;
		}
		else{
			return a[front];
		}
	}

	public static int getRear(){
		if (front==-1 && rear==-1){
			return -1;
		}
		else{
			return a[rear];
		}
	}
 
}