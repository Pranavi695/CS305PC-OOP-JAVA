import java.util.Scanner;

class Lab2P2{
	public static void main (String...args){
		Scanner s = new Scanner(System.in);
			
			int a = s.nextInt();
			System.out.println("Output is: "+ (a++ + ++a));
			System.out.println("Output is: "+ (a++ + ++a));
			System.out.println((a++ + ++a) + ":Output is");
			}
		}
