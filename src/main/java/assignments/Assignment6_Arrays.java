package assignments;

public class Assignment6_Arrays {

	public static void main(String[] args) {
		/* 1. Create two arrays to store student names ["Suresh","Mahesh","Naresh"] and
		marks [75, 80, 82] Add 10 marks to each students using assignment operators and
		store it into another array, after adding 10 marks identify the average marks of all
		students*/
		
		String [] studentNames = new String[3];
		studentNames[0]="Suresh";
		studentNames[1]="Mahesh";
		studentNames[2]="Naresh";
		int [] studentMarks = new int[3];
		studentMarks[0]=75;
		studentMarks[1]=80;
		studentMarks[2]=82;
		int [] studentFinalMarks = new int[3];
		studentFinalMarks[0]=studentMarks[0]+=10;
		studentFinalMarks[1]=studentMarks[1]+=10;
		studentFinalMarks[2]=studentMarks[2]+=10;
		
		System.out.println("Student 1:" +studentNames[0]);
		System.out.println( "Mark:" +studentFinalMarks[0]);
		System.out.println("Student 2:" +studentNames[1]);
		System.out.println("Mark:" +studentFinalMarks[1]);
		System.out.println("Student 3:" +studentNames[2]);
		System.out.println("Mark:" +studentFinalMarks[2]);
	
		
		int  averagemarks = (studentMarks[0] + studentMarks[1]+studentMarks[2])/(studentNames.length);
		System.out.println("Average mark of all students is:" +averagemarks);
		
	
	}

}
