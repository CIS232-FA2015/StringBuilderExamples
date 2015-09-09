package cis232.example;

public class Example {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hi");
		
		sb.append(" world");
		sb.insert(0, "Not ");
		int startHiIndex = sb.indexOf("Hi");
		sb.replace(startHiIndex, startHiIndex + 2, "Good bye");
		
//		int indexOfO = sb.indexOf("o");
//		while(indexOfO >= 0){
//			sb.deleteCharAt(indexOfO);
//			indexOfO = sb.indexOf("o");
//		}
		
		sb = new StringBuilder(sb.toString().replaceAll("o", ""));
		
		System.out.println(sb);
	}

}
