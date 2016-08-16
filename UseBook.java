package packagesAndInterfaces;

import packagesAndInterfaces.Book;

public class UseBook {

	public static void main(String[] args) {

		Book books[]=new Book[5];
		books[0]=new Book("Java: a beginers guide", "Schildt",2014);
		books[1]=new Book("java: the complete reference","Schildt",2014);
		books[2]=new Book("the art of java", "Schildt and Holmes", 2003);
		books[3]=new Book("Red storm rising","Clancy",1986);
		books[4]=new Book("On the road","Kerouac",1955);
		
		for(int i=0;i<books.length;i++)
			books[i].show();
		

	}

}
