package WrapperClasses;

import java.util.ArrayList;

public class ArrayListTopics {

	public static void main(String[] args) {
		
		ArrayList<String> data = new ArrayList <String>();
		
		data.add("one");
		data.add("two");
		data.add("three");
		
for (int i = 0; i < data.size(); i++) {
	
	System.out.println("forLoop " + data.get(i));
	
}	

for(String i: data) {
	System.out.println("forEach "+ i);
	
}


ArrayList<Integer> data2 = new ArrayList<Integer>();

data2.add(12);
data2.add(13);
data2.add(6);

for (Integer i : data2) {
	System.out.println("Integer in ArrayList " + i);
}

	}

}
