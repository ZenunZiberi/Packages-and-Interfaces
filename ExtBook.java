package packagesAndInterfaces;

import packagesAndInterfaces.Book;

public class ExtBook extends Book {
	
	 private String publisher;
	 
	 public ExtBook(String t, String a, int d, String p){
		 super(t,a,d);
		 this.publisher=p;
	 }
	 
	 public void show() {
		 super.show();
		 System.out.println(publisher);
		 System.out.println();
	 }
	 
	 public String getPublisher(){
		 return publisher;
	 }
	 
	 public void setPublisher(String p){
		 this.publisher=p;
	 }
	 
	 public String getTitle(){
		 return title;
	 }
	 
	 public void setTitle(String t){
		 this.title=t;
	 }
	 
	 public String getAuthor(){
		 return author;
	 }
	 
	 public void setAuthor(String a){
		 this.author=a;
	 }
	 
	 public int getDate(){
		 return date;
	 }
	 
	 public void setDate(int d){
		 this.date=d;
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
