package packagesAndInterfaces;

public class Book {    		//book must be public in order to use by other packages
	
	protected String title;
	protected String author;
	protected int date;
	
	public Book(String t, String a, int d){				//now public constructor
		this.title=t;
		this.author=a;
		this.date=d;
		}

		public void show(){
			System.out.println(title+" "+ author +" "+date);
			System.out.println(author+" "+date);
			System.out.println(date);
			System.out.println();
		}
}
