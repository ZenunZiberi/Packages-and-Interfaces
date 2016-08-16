package packagesAndInterfaces;

public class SeriesDemo {

	public static void main(String[] args) {

		ByTwos obj = new ByTwos();
	   	ByThrees obj1 = new ByThrees();
    	 ByThrees obj2 = new ByThrees(obj1);
		
		/*for class ByTwos*/
		
		for(int i=0;i<5;i++)
			
			System.out.println("Next value is : "+obj.getNext());

			System.out.println("\nResetting");
			obj.reset();
			
			for(int i=0;i<5;i++)
				System.out.println("Next value is : "+obj.getNext());
			System.out.println("\nStarting at 100");
			
			obj.setStart(100);
			
			for(int i=0;i<5;i++)
				System.out.println("Next value is : "+obj.getNext());
		System.out.println();
			System.out.println("ByThrees class\n");
			/*for class ByThrees*/
	

			for(int i=0;i<5;i++)
				
				System.out.println("Next value is : "+obj1.getNext());

				System.out.println("\nResetting");
				obj1.reset();
				
				for(int i=0;i<5;i++)
					System.out.println("Next value is : "+obj1.getNext());
				System.out.println("\nStarting at 100");
				
				obj1.setStart(100);
				
				for(int i=0;i<5;i++)
					System.out.println("Next value is : "+obj1.getNext());
			
				/*for class ByThrees with object passing*/
				
				for(int i=0;i<5;i++)
					
					System.out.println("Next value is : "+obj2.getNext());

					System.out.println("\nResetting");
					obj2.reset();
					
					for(int i=0;i<5;i++)
						System.out.println("Next value is : "+obj2.getNext());
					System.out.println("\nStarting at 100");
					
					obj2.setStart(100);
					
					for(int i=0;i<5;i++)
						System.out.println("Next value is : "+obj2.getNext());
	}

}
