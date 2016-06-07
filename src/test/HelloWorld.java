package test;

import org.springframework.util.StringUtils;

public class HelloWorld {
		   private String message;
		   String s1 = "  o  ";
		   
		   

		   public void setMessage(String message){
		      this.message  = message;
		   }

		   public void getMessage(){
		      System.out.println("Your Message : " + message);
		   }
		   
		   public void init(){
			      System.out.println("HelloBean is going through init.");
			      if(StringUtils.isEmpty(s1))
			      {
			    	  System.out.println("String is Empty");
			      }
			   }
			   
		   public void destroy(){
			      System.out.println("HelloBean will destroy now.");
			   }
		}
