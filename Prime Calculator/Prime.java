import java.io.*;
import java.util.*;

class Prime{
	public static void main(String args[])throws IOException{

		DataInputStream input=new DataInputStream(System.in);


		System.out.println("==WELCOME TO PRIME CALCULATOR==");
		int cases=0;

		do{
			System.out.println("Choices:\n1. Prime Number Less Than or Equal N\n2. First N Primes\n3. IS N PRIME ?\n4. EXIT");
			cases = Integer.parseInt(input.readLine());
			
			switch(cases){
				case 1:{
					System.out.println("Give Me N");
					int n=Integer.parseInt(input.readLine());
					//System.out.println("N is :"+n+"\n");
					// System.out.println("Prime numbers till "+n+" are :\n");
					// iprime(n);
					System.out.println("");
					for(int i=1;i<=n;i++){
						if(isPrime(i)){
							System.out.print(i+"  ");
						}
					}
					System.out.println("\n");
					break;

				}

				case 2:{
					int count =0;
					int number =1;
					System.out.println("Give Me N");
					int n=Integer.parseInt(input.readLine());
					//System.out.println("N is :"+n+"\n");
					System.out.println("");
					do{

						if(isPrime(number)){
							System.out.print(number+"  ");
							count++;
						}

						number++;
						

					}
					while(count != n);

					System.out.println("\n");
					break;

				}

				case 3:{
					System.out.println("Give Me N");
					int n=Integer.parseInt(input.readLine());
					//System.out.println("N is :"+n+"\n");
					System.out.println("");
					if(isPrime(n)){
						System.out.print("YES, "+n+" is PRIME");
						System.out.println("\n");
						break;
					}

					System.out.print("NO, "+n+" is NOT PRIME");

					System.out.println("\n");
					break;
				}

				case 4:{
					System.out.println("");
					System.out.println("PROGRAM IS EXITING !\nTHANK YOU .. VISIT AGAIN !!");
					break;

				}

				default:{
					System.out.println("");
					System.out.println("ENTER VALID CASE.");
					break;

				}
			}
		}
		while(cases!=4);
		
		
		


	}

	static void iprime(int n){
		int chk=0;
		int count =0;
		for(int i=1;i<=n;i++){

			for(int j=2;j*j<=i;j++){
				if(i%j==0){
					chk=1;
				}
			}

			if(chk==0){
				count ++;
				System.out.print(i+"  ");
			}

			chk=0;
		}

		System.out.println("\nTHE COUNT IS "+count+"\n");

	}

	static boolean isPrime(int n){

		for(int i=2;i*i<=n;i++){
			if(n%i==0){
				return false;
			}
		}

		return true;

	}
}