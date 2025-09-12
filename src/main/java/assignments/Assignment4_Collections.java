package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment4_Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Store student 1 details in HashMap
 Map <String,String> Student1map = new HashMap <String,String> ();
 Student1map.put("Name","John Doe");
 Student1map.put("Age","Twenty");
 Student1map.put("Gender","Male");
 Student1map.put("Roll Number","SBA12345");
 Student1map.put("Grade","A++");
 Student1map.put("Major","Computer Science");
 Student1map.put("GPA","A3.8");
 Student1map.put("Email","john@example.com");
 Student1map.put("PAN Number","SDF6543210");
 Student1map.put("Address","123 Elm St");

	//Store student 2 details in HashMap
 Map <String,String> Student2map = new HashMap <String,String> ();
 Student2map.put("Name","Jane Smith");
 Student2map.put("Age","Twenty One");
 Student2map.put("Gender","Female");
 Student2map.put("Roll Number","SBA12346");
 Student2map.put("Grade","B+");
 Student2map.put("Major","Mathematics");
 Student2map.put("GPA","A3.5");
 Student2map.put("Email","jane@example.com");
 Student2map.put("PAN Number","REW6543211");
 Student2map.put("Address","456 Oak St");

	//Store student 3 details in HashMap
 Map <String,String> Student3map = new HashMap <String,String> ();
 Student3map.put("Name","Mike Brown");
 Student3map.put("Age","Twenty two");
 Student3map.put("Gender","Male");
 Student3map.put("Roll Number","SBA12347");
 Student3map.put("Grade","A+");
 Student3map.put("Major","Physics");
 Student3map.put("GPA","A3.9");
 Student3map.put("Email","mike@example.com");
 Student3map.put("PAN Number","TYR6543212");
 Student3map.put("Address","789 Pine St");

/*print student details from map
 System.out.println("print student details from map");
 System.out.println(Student1map);
 System.out.println(Student2map);
 System.out.println(Student3map);*/
 
 //store all students data in student list
 
 List <Map<String,String>> studentlist = new ArrayList <Map<String,String>> ();
 
 studentlist.add(Student1map);
 studentlist.add(Student2map);
 studentlist.add(Student3map);
 
 /*print from student list
 System.out.println("print from student list");
 System.out.println(studentlist.get(0));
 System.out.println(studentlist.get(1));
 System.out.println(studentlist.get(2));
 System.out.println(studentlist);*/
 
 
//Store Employee 1 details in HashMap
Map <String,String> Employee1map = new HashMap <String,String> ();
Employee1map.put("Employee ID","E001");
Employee1map.put("Name","Alice Green");
Employee1map.put("Age","Thirty");
Employee1map.put("Gender","FeMale");
Employee1map.put("Department","Engineering");
Employee1map.put("Position","Software Engineer");
Employee1map.put("Salary","75K Pounds");
Employee1map.put("Email","alice@example.com");
Employee1map.put("PAN Number","SDF6543210");

//Store Employee 2 details in HashMap
Map <String,String> Employee2map = new HashMap <String,String> ();
Employee2map.put("Employee ID","E002");
Employee2map.put("Name","Bob Johnson");
Employee2map.put("Age","Thirty Five");
Employee2map.put("Gender","Male");
Employee2map.put("Department","Marketing");
Employee2map.put("Position","Marketing Manager");
Employee2map.put("Salary","85K Pounds");
Employee2map.put("Email","bob@example.com");
Employee2map.put("PAN Number","REW6543211");


//Store Employee 2 details in HashMap
Map <String,String> Employee3map = new HashMap <String,String> ();
Employee3map.put("Employee ID","E003");
Employee3map.put("Name","Carol White");
Employee3map.put("Age","Twenty Eight");
Employee3map.put("Gender","FeMale");
Employee3map.put("Department","Sales");
Employee3map.put("Position","Sales Executive");
Employee3map.put("Salary","65K Pounds");
Employee3map.put("Email","carol@example.com");
Employee3map.put("PAN Number","TYR6543212");

/*print Employee details from map
System.out.println("print Employee details from map");
System.out.println(Employee1map);
System.out.println(Employee2map);
System.out.println(Employee3map);*/

//store all students data in student list
List <Map<String,String>> emplist = new ArrayList <Map<String,String>> (); 
emplist.add(Employee1map);
emplist.add(Employee2map);
emplist.add(Employee3map);

/*print from Employee list
System.out.println("print from Employee list");
System.out.println(emplist.get(0));
System.out.println(emplist.get(1));
System.out.println(emplist.get(2));
System.out.println(emplist);*/

//Store product details 1 in Map
Map <String,String> prod1map = new HashMap <String,String> ();
prod1map.put("Product ID", "P001");
prod1map.put("Name", "Laptop");
prod1map.put("Category", "Electronics");
prod1map.put("Price", "12K Pounds");
prod1map.put("Stock Quantity", "Not Available");
prod1map.put("Supplier", "Tech Supplies");
prod1map.put("Warranty", "2 years");
prod1map.put("Rating", "4.5 Stars");
prod1map.put("Manufacturing Date", "Aug 2023");
prod1map.put("Expiry Date", "Aug 2028");

//Store product details 2 in Map
Map <String,String> prod2map = new HashMap <String,String> ();
prod2map.put("Product ID", "P002");
prod2map.put("Name", "Desk Chair");
prod2map.put("Category", "Furniture");
prod2map.put("Price", "150K Pounds");
prod2map.put("Stock Quantity", "Two");
prod2map.put("Supplier", "Office Depot");
prod2map.put("Warranty", "1 year");
prod2map.put("Rating", "4 Stars");
prod2map.put("Manufacturing Date", "Sep 2024");
prod2map.put("Expiry Date", "N/A");

//Store product details 3 in Map
Map <String,String> prod3map = new HashMap <String,String> ();
prod3map.put("Product ID", "P003");
prod3map.put("Name", "Coffee Maker");
prod3map.put("Category", "Kitchen");
prod3map.put("Price", "75 Pounds");
prod3map.put("Stock Quantity", "Two Hundred");
prod3map.put("Supplier", "KitchenWorld");
prod3map.put("Warranty", "6 months");
prod3map.put("Rating", "4.2 Stars");
prod3map.put("Manufacturing Date", "Jan 2025");
prod3map.put("Expiry Date", "Jan 2027");

/*print Product details from map
System.out.println("print Product details from map");
System.out.println(prod1map);
System.out.println(prod2map);
System.out.println(prod3map);*/

//Store product details in list
List <Map<String,String>> prodlist = new ArrayList <Map<String,String>> ();
prodlist.add(prod1map);
prodlist.add(prod2map);
prodlist.add(prod3map);

/*print from product list
System.out.println("print from product list");
System.out.println(prodlist.get(0));
System.out.println(prodlist.get(1));
System.out.println(prodlist.get(2));
System.out.println(prodlist);*/

//Store all 3 details in List

Map <String, List<Map<String,String>>> data = new HashMap <String, List<Map<String,String>>> ();
data.put("Student Details", studentlist);
data.put("Employee Details", emplist);
data.put("Product details", prodlist);

// Print the data from Product details > Supplier Name > Office Depot 

//System.out.println(data.get("Product details"));
System.out.println(data.get("Product details").get(1).get("Supplier"));
	}

}
