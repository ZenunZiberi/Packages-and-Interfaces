package packagesAndInterfaces;

public class ByTwos implements Series {
	
	int start;
	int val;
	int prev;
	
	ByTwos(){
		 start=0;
		 val=0;
		prev=-2;
	}
	
	public int getNext(){
		prev=val;
		 val+=2;
		 return val;
	}
	
	public void reset(){
		this.val=this.start;
		prev=start-2;
		
	}
	
	public void setStart(int x){
		this.start=x;
		this.val=x;
		this.prev=x-2;
	}

	int getPrevious(){
		return prev;
	}
	
	
	
	
	
	
	
	
	
	
	
	

		
}
