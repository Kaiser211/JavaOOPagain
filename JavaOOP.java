 class Calculation {
   int z;
	
   public void addition(int x, int y) {
      z = x + y;
      System.out.println("The sum of the given numbers:"+z);
   }
	
   public void Subtraction(int x, int y) {
      z = x - y;
      System.out.println("The difference between the given numbers:"+z);
   }
}

public class JavaOOP extends Calculation {
   public void multiplication(int x, int y) {
      z = x * y;
      System.out.println("The product of the given numbers:"+z);
   }
	
   public static void main(String args[]) {
      int a = 20, b = 10;
      JavaOOP demo = new JavaOOP();
      demo.addition(a, b);
      demo.Subtraction(a, b);
      demo.multiplication(a, b);
   }
}

/////////////////////////////////////////////////////////////////////

class Super_class {
   int num = 20;

   // display method of superclass
   public void display(){
      System.out.println("This is the display method of superclass");
   }
}

public class JavaOOP extends Super_class {
   int num = 10;

   // display method of sub class
   public void display(){
      System.out.println("This is the display method of subclass");
   }

   public void my_method(){
      // Instantiating subclass
      JavaOOP sub = new JavaOOP();
      // Invoking the display() method of sub class
      sub.display();
      // Invoking the display() method of superclass
      super.display();

        // printing the value of variable num of subclass
       System.out.println("value of the variable named num in sub class:"+ sub.num);
       // printing the value of variable num of superclass
       System.out.println("value of the variable named num in super class:"+ super.num);
   }
   public static void main(String[] args) {
      JavaOOP obj = new JavaOOP();
      obj.my_method();
   }
}
///////////////////////////////////////////////////////////////////

   class Superclass {
      int age;
      Superclass(int age){
         this.age =  age;     
     }
     public void getAge(){
      System.out.println("The value of the variable named age in super class is: " +age);
     }
   }
    public class JavaOOP extends Superclass {
    	JavaOOP( int age) {
    		super(age);
    	}

    	public static void main(String[] args) {
    		JavaOOP s = new JavaOOP(24);
    		s.getAge();
    	}
    }

class Animal {
}

class Mammal extends Animal {
}

class Reptile extends Animal {
}

public class JavaOOP extends Mammal {

   public static void main(String args[]) {
      Animal a = new Animal();
      Mammal m = new Mammal();
      JavaOOP d = new JavaOOP();

      System.out.println(m instanceof Animal);
      System.out.println(d instanceof Mammal);
      System.out.println(d instanceof Animal);
   }
}


    interface Animal {}
	class Mammal implements Animal{}

	public class JavaOOP extends Mammal {

		public static void main(String[] args) {
			 Mammal m = new Mammal();
			 JavaOOP d = new JavaOOP();

			 System.out.println(m instanceof Animal);
			 System.out.println(m instanceof Mammal);
			 System.out.println(m instanceof Animal);
		}
	}
////////////////////////////////////////

public class Person {
	private String name;
	private int age;

	public Person(String name, int age){
		this.age = age;
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setName(String name ){
		this.name = name;
	}

	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}

	public void eat(){
		System.out.println(this.name + " is eating");
	}
	public void sleep(){
		System.out.println(this.name + " is sleeping");
	}

	public void walk() {
		System.out.println(this.name + " is walking");
	}

}

public class Employee extends Person{
	private int ID;

	public Employee(String name , int age, int ID){
		super(name, age);
		this.ID= ID;		
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
	public void work() {
		System.out.println(this.getName() + " is working");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		super.sleep();
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		super.walk();
	}
	}
    public class JavaOOP {

	public static void main(String[] args) {
		Person  employee1 = new Employee("Kaka", 23, 78978); 
		Person person = new Person("hh" , 22 );
		Employee employee2 = new Employee("JJ", 40, 897879);
		
		person.eat();
		employee1.eat();
		employee2.eat();
		employee2.work();
	}

}

/////////////////////////

class Animal {
	public void move(){
		System.out.println("Animals can move");
	}
}

class Dog extends Animal {
	public void move(){
		super.move();// invokes the super class method
		System.out.println("Dogs can walk and run");
	}
}

public class JavaOOP {

	public static void main(String[] args) {
		Animal b = new Dog();// Animal reference but Dog object
		b.move();// runs the method in Dog class
	}
}

///////////////////////////////////////////////

public abstract class Employee {
	private String name;
	private String address;
	private int number;

	public Employee(String name, String address, int number){
		System.out.println("Constructing an Employee");
		this.name = name;
		this.address = address;
		this.number  = number;
	}

	public double computePay(){
		System.out.println("Inside Employee computePay");
		return 0.0;
	}
	public void mailCheck(){
		System.out.println("Mailing a check to " + this.name + " " + this.address);
	}

	public String toString(){
		return name + " " + address + " " +number;
	}

	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public void setAddress(String newAddress){
		address = newAddress;
	}
	public int getNumber(){
		return number;
	}
}
 public class JavaOOP {

 	public static void main(String[] args) {
 		Employee e = new Employee("George W.", "Houston, TX", 43);
 		System.out.println("\n Call mailCheck using Employee reference --");
 		e.mailCheck();
 	}
 }



//////////////////////////////////////


public class JavaOOP {
   private String name;
   private String idNum;
   private int age;

   public int getAge() {
      return age;
   }

   public String getName() {
      return name;
   }

   public String getIdNum() {
      return idNum;
   }

   public void setAge( int newAge) {
      age = newAge;
   }

   public void setName(String newName) {
      name = newName;
   }

   public void setIdNum( String newId) {
      idNum = newId;
   }
}

public class RunEncap {

   public static void main(String args[]) {
      JavaOOP encap = new JavaOOP();
      encap.setName("James");
      encap.setAge(20);
      encap.setIdNum("12343ms");

      System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
   }
}


//////////////////////////////////////

interface Animal {
   public void eat();
   public void travel();
}

public class JavaOOP implements Animal {

   public void eat() {
      System.out.println("Mammal eats");
   }

   public void travel() {
      System.out.println("Mammal travels");
   } 

   public int noOfLegs() {
      return 0;
   }

   public static void main(String args[]) {
      JavaOOP m = new JavaOOP();
      m.eat();
      m.travel();
   }
} 



////////////////////////////////////


public class JavaOOP {
   // generic method printArray
   public static < E > void printArray( E[] inputArray ) {
      // Display array elements
      for(E element : inputArray) {
         System.out.printf("%s ", element);
      }
      System.out.println();
   }

   public static void main(String args[]) {
      // Create arrays of Integer, Double and Character
      Integer[] intArray = { 1, 2, 3, 4, 5 };
      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
      Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

      System.out.println("Array integerArray contains:");
      printArray(intArray);   // pass an Integer array

      System.out.println("\nArray doubleArray contains:");
      printArray(doubleArray);   // pass a Double array

      System.out.println("\nArray characterArray contains:");
      printArray(charArray);   // pass a Character array
   }
}


//////////////////////////////////////

public class JavaOOP {
   // determines the largest of three Comparable objects
   
   public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
      T max = x;   // assume x is initially the largest
      
      if(y.compareTo(max) > 0) {
         max = y;   // y is the largest so far
      }
      
      if(z.compareTo(max) > 0) {
         max = z;   // z is the largest now                 
      }
      return max;   // returns the largest object   
   }
   
   public static void main(String args[]) {
      System.out.printf("Max of %d, %d and %d is %d\n\n", 
         3, 4, 5, maximum( 3, 4, 5 ));

      System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n",
         6.6, 8.8, 7.7, maximum( 6.6, 8.8, 7.7 ));

      System.out.printf("Max of %s, %s and %s is %s\n","pear",
         "apple", "orange", maximum("pear", "apple", "orange"));
   }
}
 
////////////////////////////

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class SendEmail {

   public static void main(String [] args) {    
      // Recipient's email ID needs to be mentioned.
      String to = "abcd@gmail.com";

      // Sender's email ID needs to be mentioned
      String from = "web@gmail.com";

      // Assuming you are sending email from localhost
      String host = "localhost";

      // Get system properties
      Properties properties = System.getProperties();

      // Setup mail server
      properties.setProperty("mail.smtp.host", host);

      // Get the default Session object.
      Session session = Session.getDefaultInstance(properties);

      try {
         // Create a default MimeMessage object.
         MimeMessage message = new MimeMessage(session);

         // Set From: header field of the header.
         message.setFrom(new InternetAddress(from));

         // Set To: header field of the header.
         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

         // Set Subject: header field
         message.setSubject("This is the Subject Line!");

         // Now set the actual message
         message.setText("This is actual message");

         // Send message
         Transport.send(message);
         System.out.println("Sent message successfully....");
      } catch (MessagingException mex) {
         mex.printStackTrace();
      }
   }
}














