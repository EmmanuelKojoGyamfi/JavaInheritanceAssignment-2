package javaInheritanceAssignment2;

public class Q1 {
	public class Author {
		   
		   private String name;
		   private String email;
		   private char gender;   
		 
		  
		   public Author(String name, String email, char gender) {
		      this.name = name;
		      this.email = email;
		      this.gender = gender;
		   }
		 
		  
		   public String getName() {
		      return name;
		   }
		   
		   public char getGender() {
		      return gender;
		   }
		   
		   public String getEmail() {
		      return email;
		   }
		  
		   public void setEmail(String email) {
		      this.email = email;
		   }
		 
		 
		   public String toString() {
		      return name + " (" + gender + ") at " + email;
		   }
		}

   public class TestAuthor {
	   public void main(String[] args) {
	      
	      Author ahTeck = new Author("Tan Ah Teck", "teck@nowhere.com", 'm');
	      System.out.println(ahTeck); 
	      
	      ahTeck.setEmail("teck@somewhere.com");
	      System.out.println(ahTeck);  
	      System.out.println("name is: " + ahTeck.getName());
	     
	      System.out.println("gender is: " + ahTeck.getGender());
	      
	      System.out.println("email is: " + ahTeck.getEmail());
	      
	   }
   }
}