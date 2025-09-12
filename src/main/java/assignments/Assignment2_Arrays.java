package assignments;

public class Assignment2_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [][][] marksheet = new String [5][2][6];
	//sem1
		marksheet [0][0][0] = "78(Pass)";
		marksheet [0][0][1] = "85(Pass)";		
		marksheet [0][0][2] = "21(Fail)";		
		marksheet [0][0][3] = "74(Pass)";
		marksheet [0][0][4] = "88(Pass)";		
		marksheet [0][0][5] = "79(Pass)";	
		marksheet [0][1][0] = "Mathematics I";
		marksheet [0][1][1] = "Physics";
		marksheet [0][1][2] = "Chemistry";
		marksheet [0][1][3] = "Computer Programming";
		marksheet [0][1][4] = "Engineering Drawing";
		marksheet [0][1][5] = "Basic Electrical Eng";
	//sem2	
		marksheet [1][0][0] = "82(Pass)";
		marksheet [1][0][1] = "77(Pass)";		
		marksheet [1][0][2] = "93(Pass)";		
		marksheet [1][0][3] = "19(Fail)";
		marksheet [1][0][4] = "24(Fail)";		
		marksheet [1][0][5] = "90(Pass)";	
		marksheet [1][1][0] = "Mathematics II";
		marksheet [1][1][1] = "Mechanics";
		marksheet [1][1][2] = "Environmental sci.";
		marksheet [1][1][3] = "Basic Electronics";
		marksheet [1][1][4] = "Engineering Physics";
		marksheet [1][1][5] = "Engineering Graphics";
	//sem3
		marksheet [2][0][0] = "88(Pass)";
		marksheet [2][0][1] = "81(Pass)";		
		marksheet [2][0][2] = "76(Pass)";		
		marksheet [2][0][3] = "32(Fail)";
		marksheet [2][0][4] = "85(Pass)";		
		marksheet [2][0][5] = "78(Pass)";	
		marksheet [2][1][0]= "Data Structures";
		marksheet [2][1][1]= "Discrete Mathematics";
		marksheet [2][1][2]= "Digital Electronics";
		marksheet [2][1][3]= "Operating Systems";
		marksheet [2][1][4]= "Signals and Systems";
		marksheet [2][1][5]= "Object-Oriented Prog.";
		//sem 4
		marksheet [3][0][0] = "91(Pass)";
		marksheet [3][0][1] = "73(Pass)";		
		marksheet [3][0][2] = "19(Fail)";		
		marksheet [3][0][3] = "80(Pass)";
		marksheet [3][0][4] = "76(Pass)";		
		marksheet [3][0][5] = "87(Pass)";	
		marksheet [3][1][0]= "Algorithms";
		marksheet [3][1][1]= "Computer Networks";
		marksheet [3][1][2]= "Database Systems";
		marksheet [3][1][3]= "Microprocessors";
		marksheet [3][1][4]= "Communication Eng.";
		marksheet [3][1][5]= "Software Engineering";
		//sem5
		marksheet [4][0][0] = "86(Pass)";
		marksheet [4][0][1] = "88(Pass)";		
		marksheet [4][0][2] = "84(Pass)";		
		marksheet [4][0][3] = "95(Pass)";
		marksheet [4][0][4] = "73(Pass)";		
		marksheet [4][0][5] = "90(Pass)";			
		marksheet [4][1][0] = "Probability & Stats";
		marksheet [4][1][1] = "Machine Learning";
		marksheet [4][1][2] = "Compiler Design";
		marksheet [4][1][3] = "Theory of Computation";
		marksheet [4][1][4] = "Embedded Systems";
		marksheet [4][1][5] = "Computer Graphics";
		
	   System.out.println("Semester 3  Subject 4: " + marksheet[2][1][3]); 
	   System.out.println("Semester 3  Subject 5: " + marksheet[2][1][4]); 
	   System.out.println("Semester 5  Subject 3 Marks: " + marksheet[4][0][2]); 
	   System.out.println("Semester 5  Subject 6 Marks: " + marksheet[4][0][5]); 


			}

		}
		


