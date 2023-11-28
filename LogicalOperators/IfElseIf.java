package Logical;

public class IfElseIf {

	public static void main(String[] args) {
		int marks=90;
		if(marks<=90) {
			System.out.println("Excellent");
		}else if(marks<=70) {
			System.out.println("Good");
		}else if(marks<=50) {
			System.out.println("Better");
		}else if(marks<=30) {
			System.out.println("Bad");
		}else {
			System.out.println("fail");
		}

	}

}
