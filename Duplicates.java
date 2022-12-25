import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
class Duplicates
{
	public static void main(String[] args)
	{
	 String [] str = {"Sameer", "Sameer", "akshay", "anku", "Narayan", "Bhujanga"};
     Map<String,Integer> name = new HashMap<>();
	 
	 for(String s : str)
	 {
	    Integer count = name.get(s);
		if(count == null)
		{
			name.put(s,1);
		}
		else
		{
			name.put(s,++count);
		}
	 }
	 
	 Set<Entry<String,Integer>> e = name.entrySet();
	 for(Entry<String,Integer> d : e)
	 {
		 if(d.getValue()>1)
		 {
			 System.out.println("Repeated Names : " +d.getKey() +" "+ d.getValue());
		 }
	 }
	 
	}
}