
/* Signature of four required functions is given in the code. You can create other functions as well if you need.
*  Also you should submit your code even if you are not done with all the functions. 
*/

// Main used internally is shown here just for your reference.
/*public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int degree1[] = new int[n];
		for(int i = 0; i < n; i++){
			degree1[i] = s.nextInt();
		}
		int coeff1[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff1[i] = s.nextInt();
		}
		Polynomial first = new Polynomial();
		for(int i = 0; i < n; i++){
			first.setCoefficient(degree1[i],coeff1[i]);
		}
		n = s.nextInt();
		int degree2[] = new int[n];
		for(int i = 0; i < n; i++){
			degree2[i] = s.nextInt();
		}
		 int coeff2[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff2[i] = s.nextInt();
		}
		Polynomial second = new Polynomial();
		for(int i = 0; i < n; i++){
			second.setCoefficient(degree2[i],coeff2[i]);
		}
		int choice = s.nextInt();
		Polynomial result;
		switch(choice){
		// Add
		case 1: 
			 result = first.add(second);
			result.print();
			break;
		// Subtract	
		case 2 :
			 result = first.subtract(second);
			result.print();
			break;
		// Multiply
		case 3 :
			 result = first.multiply(second);
			result.print();
			break;
		}

	}
  */


public class Polynomial {

	private int degcoeff[];

	public Polynomial(){
		degcoeff=new int[50];
	}

	
	/* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
	 *  then corresponding term with specified degree and value is added int the polynomial. If the degree
	 *  is already present in the polynomial then previous coefficient is replaced by
	 *  new coefficient value passed as function argument
	*/
	public void setCoefficient(int degree, int coeff){

		if (degree>=this.degcoeff.length){
			doubledegreecoeff();
		}
		this.degcoeff[degree]=coeff;
	}

	public void doubledegreecoeff(){
		int temp[]=this.degcoeff;
		this.degcoeff=new int[2*(temp.length)];
		for (int i=0;i<temp.length;i++){
			this.degcoeff[i]=temp[i];
		}
	}
	
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print(){
		if (degcoeff[0] !=0){
			System.out.print(degcoeff[0]+" ");
		}
		for (int i=1;i<degcoeff.length;i++){
			if (degcoeff[i] !=0){
				System.out.print(degcoeff[i]+"x"+i+" ");
			}
		}
		
	}

	
	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){
		Polynomial x=new Polynomial();
		int m=Math.max(p.degcoeff.length, degcoeff.length);
		x.degcoeff=new int[Math.max(p.degcoeff.length, degcoeff.length)];
		for (int i=0;i<p.degcoeff.length;i++){
			x.degcoeff[i] +=p.degcoeff[i];
		}
		for (int i=0;i<this.degcoeff.length;i++){
			x.degcoeff[i] +=this.degcoeff[i];
		}
		return x;	
	}
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p){
		Polynomial x=new Polynomial();
		int m=Math.max(p.degcoeff.length, degcoeff.length);
		x.degcoeff=new int[Math.max(p.degcoeff.length, degcoeff.length)];
		for (int i=0;i<p.degcoeff.length;i++){
			x.degcoeff[i] -=p.degcoeff[i];
		}
		for (int i=0;i<this.degcoeff.length;i++){
			x.degcoeff[i] +=this.degcoeff[i];
		}
		return x;
	}
	
	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p){
		Polynomial x=new Polynomial();
		x.degcoeff=new int[p.degcoeff.length+this.degcoeff.length];
		for (int i=0;i<this.degcoeff.length;i++){
			for (int j=0;j<p.degcoeff.length;j++){
				x.degcoeff[i+j] +=(this.degcoeff[i]*p.degcoeff[j]);
			}
			
		}

		return x;
	}

}