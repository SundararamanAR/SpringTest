package test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpringApp {
   private static AbstractApplicationContext context;

public static void main(String[] args) {
	   context = new ClassPathXmlApplicationContext("Beans.xml");

	  //To illustrate constructor Injection
	  HelloWorldConstInj objC = (HelloWorldConstInj) context.getBean("helloWorldConstInj");
	      
	  //To illustrate Setter Injection
      HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
      objA.setMessage("I'm object A");
      objA.getMessage();

      //To illustrate bean scope, beanpostprocessors
      HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
      objB.getMessage();
      context.registerShutdownHook();
           
      //To illustrate inner bean
      TextEditor te = (TextEditor) context.getBean("textEditor");
      te.spellCheck();
      
      //To illustrate autowiring by name/type/constructor
      try{
      Autowire aw = (Autowire) context.getBean("autowire");
      aw.doWiring();
      }
      catch(Exception e)
      {
    	  e.printStackTrace();
    	  //System.out.println();    	
      }
      //To illustrate passing plural values to a bean (Collection)
      JavaCollection jc=(JavaCollection)context.getBean("javaCollection");
      jc.getCountryList();
      jc.getCountrySet();
      jc.getCountryMap();
      jc.getCountryProp();
   }
}