
public class First_Java_Program {

	// function
	public static void main(String[] args) {
		
		System.out.println("hello world");
		// syso ->  cntrl+space
		System.out.println(65465);
		
		// DATATYPES
		int x = 100; // cannot store decimals - 32 bits
		System.out.println(x);
		x=200;	
		System.out.println(x);
		
		long var =3000L;// cannot store decimals - 64 bits
		char c='y'; // just one place
		boolean b=true; // true or false
		
		System.out.println(3>12);
		
		int q=100;
		int w=200;
		
		boolean x1=q>w;
		
		System.out.println(x1);
		
		// IF statements
		if(q<w){
			System.out.println("q is lesser");
		}else if(q==w){
			System.out.println("q is equal to w");
		}else{
			System.out.println("q is greater");
		}
		
		
		// STRING class
		String str = "hello how are you";
		
		

	}

}
