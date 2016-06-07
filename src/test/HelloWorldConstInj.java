package test;

public class HelloWorldConstInj {
	 private String message;
	 
	 public HelloWorldConstInj(String message)
	   {
		   System.out.println("Inside HelloWorldConstructorInjection constructor.");
		   this.message=message;
		   System.out.println("Your Message :"+message);
	   }
	 
}
