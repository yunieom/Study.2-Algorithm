package codeUp;

import java.util.Scanner;

public class CodeUp_067 {

	public static void main(String[] args) {
		
		String grade;
		
		Scanner sc = new Scanner(System.in);
		grade = sc.next();
		sc.close();
		
		switch(grade) 
		{
		case "A" : System.out.println("best!!!");
						break;
		case "B" : System.out.println("good!!");
						break;
		case "C" : System.out.println("run!");
						break;
		case "D" : System.out.println("slowly~");
						break;
		default : System.out.println("what?");
					break;
		}
		
	}	
}		