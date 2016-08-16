package packagesAndInterfaces;

//import packages.IcharQ;

public class CircularQueue implements IcharQ {
	
	private char q[];  //this array  holds the queue
	private int putloc,getloc; // the put and get indicates

	
	public CircularQueue(int size){
		this.q=new char[size+1];  //alocate memory fro queue
		this.putloc=this.getloc=0;
	}
	
	public void put(char ch){
		if(putloc+1==getloc || ((putloc==q.length-1) && (getloc==0))){
			System.out.println(" - queue is full");
			return;
		}
		q[putloc++]=ch;
		if(putloc==q.length) putloc=0;  // loop back
	}
	
	public char get(){
		if(getloc==putloc){
			System.out.println(" - queue is empty");
			return (char) 0;
		}
		char ch=q[getloc++];
		if(putloc==q.length) getloc=0;  // loop back
		return ch;
}
}