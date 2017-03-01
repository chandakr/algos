
public class AlgoTests {


	public void bubbleSort(){
		int arra
	
	}
	public void findDupsInAnArray(){
		
		String[] sts ={"abc","def","fff","ggg","abc"};
		
		for (int i = 0; i < sts.length; i++) {
			
		}
		
	}
	
	public static void removeDupsInString(){
		String str = "abca";
		
		
	}
	public static void main(String[] args){
		
		boolean[] charSet = new boolean[256];
		
		String str = "abca";
		boolean b= true;
		
		for(int i=0; i < str.length();i++){
			int val= str.charAt(i);
			if(charSet[val]){
				b=false;
				break;
			}
			charSet[val]=true;
		}
	}
}
