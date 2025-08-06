package Arithmetic.operations;

public class IncrementDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;

        System.out.println("Original value: " + num);

        System.out.println("Pre-increment: " + ++num);   
        System.out.println("Post-increment: " + num++);  

        System.out.println("After post-increment: " + num);      

        System.out.println("Pre-decrement: " + --num);
        System.out.println("Post-decrement: " + num--);  

        System.out.println("After post-decrement: " + num);     
	}

}
 