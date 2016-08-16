package packagesAndInterfaces;

//import packages.IcharQ;

public class FixedQueue implements IcharQ {
	
	private char q[];  //this array  holds the queue
	private int putloc,getloc; // the put and get indicates
	
	public FixedQueue(int size){
		this.q=new char[size];  //alocate memory fro queue
		this.putloc=this.getloc=0;
	}
	
	public void put(char ch){
		if(putloc==q.length){
			System.out.println(" - queue is full");
			return;
		}
		q[putloc++]=ch;
	}
	
	public char get(){
		if(getloc==putloc){
			System.out.println(" - queue is empty");
			return (char) 0;
		}
		return q[getloc++];
	}
	
	

}
