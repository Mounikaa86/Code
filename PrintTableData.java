import java.util.HashMap;

public class PrintTableData {
	
	private static void printTableData() {
		
		
		HashMap<String, String> info = new HashMap<String,String>();
		
		info.put("id", "00A12");
		info.put("name", "Mounika");
		info.put("phone", "99999999");
		info.put("address", "ARIZONA");
		
		System.out.println(info);
	}
	
	
	
	
	public static void main(String[] args) {
		
		PrintTableData.printTableData();
	}

}
