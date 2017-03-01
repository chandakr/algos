
public class LogMessage {
	private String machineId; 
	private String description;
	
	public LogMessage (String message) {
		String machine= "";
		int counter=0;
		for (int i=0; i<message.length();i++) {
			if (message.charAt(i)==':') {
				machineId=machine;
				counter++;
				break;
			}
			else {
				machine=machine+message.substring(i, i+1);
				counter++;	
			}
			
		}
		description= message.substring(counter);
		
	}
	public String getDescription () {
		return description;
	}
	public String getMachineID () {
		return machineId;
	}
	public boolean containsWord (String keyword) {
		if (keyword.length()>description.length())
			return false;
		if (description.equals(keyword)) {
			return true;
		}
		else if (description.indexOf(keyword + " ")==0) {
			return true;
		}
		else if (description.indexOf(" " + keyword + " ") != -1) {
			return true;
		}
		else {
			if (description.substring(description.length()-keyword.length()-1, description.length()).contains(" "+ keyword)) {
				return true;
			}
			return false;
		}
	}
	public static void main(String [] args) {
		LogMessage k= new LogMessage("Yo: I have the diSk");
		boolean s= k.containsWord("disk");
		System.out.println(s);
	}
}
