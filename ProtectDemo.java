package packagesAndInterfaces;
import packagesAndInterfaces.Book;/// must be imported if u want to use this class 
public class ProtectDemo {

	public static void main(String[] args) {

		ExtBook books[]= new ExtBook[5];
		
		books[0]=new ExtBook("Java: a beginers guide", "Schildt",2014,"McGraw Hill-Professional");
		books[1]=new ExtBook("java: the complete reference","Schildt",2014,"McGraw Hill-Professional");
		books[2]=new ExtBook("the art of java", "Schildt and Holmes", 2003,"McGraw Hill-Professional");
		books[3]=new ExtBook("Red storm rising","Clancy",1986,"Putnam");
		books[4]=new ExtBook("On the road","Kerouac",1955,"Viking");

			
		for(int i=0; i <books.length;i++)
			books[i].show();
			
		System.out.println("showing all books by schildt");
		for(int i=0; i <books.length;i++)
			if(books[i].getAuthor()== "Schildt")
				System.out.println(books[i].getAuthor());
	}

}
