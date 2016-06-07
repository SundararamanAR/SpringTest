package test;

public class Autowire {
	private HelloWorldAutowire helloWorldAutowire1;
	private String name;

		/*public Autowire()
		{
			System.out.println("no arguement constructor");
		}*/
		public Autowire(HelloWorldAutowire helloWorldAutowire)
		   {
				System.out.println("single arguement constructor");
			   this.helloWorldAutowire1 = helloWorldAutowire;
		   }
		public Autowire(HelloWorldAutowire helloWorldAutowire,HelloWorldConstInj HelloWorldConstInj,String name)
	   {
			System.out.println("double arguement constructor");
		   this.helloWorldAutowire1 = helloWorldAutowire;
		   this.name= name;
	   }
		// a setter method to inject the dependency.
	   public HelloWorldAutowire getHelloWorldAutowire() {
			return helloWorldAutowire1;
		}
	   
	   // a getter method to return spellChecker
		public void setHelloWorldAutowire(HelloWorldAutowire helloWorldAutowire) {
			this.helloWorldAutowire1 = helloWorldAutowire;
		}
	   
	   public String getName() {
		      return name;
		   }
	   
	   public void setName(String name) {
		      this.name = name;
		   }

	   public void doWiring() {
		   helloWorldAutowire1.showWiredMessage();
	   }
	}