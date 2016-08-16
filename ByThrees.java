package packagesAndInterfaces;

public class ByThrees implements Series{

		int start;
		int val;
		
		ByThrees(ByThrees obj){
			this.start=obj.start;
			this.val=obj.val;
		}
		
		ByThrees(){
			this.start=0;
			this.val=0;
			
		}
		
		public int getNext(){
			val+=3;
			return val;
		}
		
		public void reset(){
			val=start;
		}
		
		public void setStart(int x){
			start=val=x;
			
		}
		
		
}
