package packagesAndInterfaces;

//import packages.IcharQ;

public class DynQueue implements IcharQ{
	
	private char q[];  //this array  holds the queue
	private int putloc,getloc; // the put and get indicates

	
	public DynQueue(int size){
		this.q=new char[size];  //alocate memory fro queue
		this.putloc=this.getloc=0;
	}
	
	public void put(char ch){
		if(putloc==q.length){
			//increase queue size
			char t[]=new char[q.length*2];
			
			//copy elements into new queue
			for(int i=0;i<q.length;i++)
				t[i]=q[i];
			
			q=t;
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
