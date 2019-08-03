import java.util.Scanner;

class calculator {
	public static void main(String[] args) {
		int op ;
		double a ;
		double b ;
		while (true) {
			Scanner scanner = new Scanner(System.in) ;
		
			System.out.println("Enter:\n1)Addition\n2)Subsraction\n3)Multiplication\n4)Division\n-1)Quit" );
			op = scanner.nextInt() ;
			if (op == -1) {
				System.out.println("Exiting program...");
				break ;
			}
		
			else if (op >= 1 && op <= 4) {
				System.out.println("Enter a :");
				a = scanner.nextDouble() ;
				System.out.println("Enter b :");
				b = scanner.nextDouble() ;
				if (op==1) {
					System.out.println("Result:" + (a+b));
				}
				else if (op==2) {
					System.out.println("Result:" + (a-b));
				}
				else if (op==3) {
					System.out.println("Result:" +(a*b));
				}
				else if (op==4) {
					System.out.println("Result:" +(a/b));
				}
				
			
		
			}
			else {
				System.out.println("Enter a number 1-4 ...");
			}
		
		}
	}
}
