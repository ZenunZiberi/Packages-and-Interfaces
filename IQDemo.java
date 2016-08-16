package packagesAndInterfaces;

//import packages.IcharQ;

public class IQDemo {

	public static void main(String[] args) {

		FixedQueue q1 = new FixedQueue(10);
		DynQueue q2 = new DynQueue(5);
		CircularQueue q3 = new CircularQueue(10);
		
		IcharQ iQ;
		
		char ch;
		int i;
		
		try {
			
		iQ=q1;
		// put some characters into fixed queue
		for(i=0;i<10;i++)
			iQ.put((char)('A'+i));
		
		// show the queue
		System.out.print("contents of fixed queue: ");
		for(i=0;i<10;i++){
			ch=iQ.get();
			System.out.print(ch);
		}
		System.out.println();
		}
		catch (ArrayIndexOutOfBoundsException exc){
			System.out.println("after");
		}
		iQ=q2;
		// put some characters into dynamic queue
		for(i=0;i<10;i++)
			iQ.put((char)('Z'-i));
		
		// show the queue
		System.out.print("contents of dynamic queue: ");
		for(i=0;i<10;i++){
			ch=iQ.get();
			System.out.print(ch);
		}
		System.out.println();
		
		iQ=q3;
		// put some characters into circular queue
		for(i=0;i<10;i++)
			iQ.put((char)('A'+i));
		
		// show the queue
		System.out.print("contents of circular"+ " queue: ");
		for(i=0;i<10;i++){
			ch=iQ.get();
			System.out.print(ch);
		}
		System.out.println();
		
		// put more characters into circular queue
		for(i=10;i<20;i++)
			iQ.put((char)('A'+i));
		
		// show the queue
		try{
			
		
		System.out.print("contents of circular queue: ");
		for(i=0;i<10;i++){
			ch=iQ.get();
			System.out.print(ch);
		}
		}
		catch (ArrayIndexOutOfBoundsException exc2){
			System.out.println(" -  after the catch");
		}
		System.out.println("\nStore and consume from circular queue");
		try {
		//store in and consume from circular quueue
		for(i=0;i<20;i++){
			iQ.put((char)('A'+i));
			ch=iQ.get();
			System.out.print(ch);
	}
		}
	catch (ArrayIndexOutOfBoundsException exc2){
		System.out.println("catch 3 attempt");
	}
	}

}
