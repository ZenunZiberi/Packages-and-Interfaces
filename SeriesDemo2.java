package packagesAndInterfaces;

public class SeriesDemo2 {

	public static void main(String[] args) {

		ByTwos twosobj=new ByTwos();
		ByThrees threesobj=new ByThrees();
		Series obj;
		
		for(int i=0;i<5;i++) {
		
		obj=twosobj;
		
		System.out.println("Next ByTwos value is: "+obj.getNext());
		
		obj=threesobj;
		
		System.out.println("Next ByThrees value is: "+obj.getNext());

	}

}
}