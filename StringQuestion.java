public class StringQuestion
{
	public static void main(String[] args) {
		//Reverse words in given string

		String string = "I Love Java";
		String[] str = string.split(" ");
		String revString = "";	
		for(int i = str.length-1; i>=0; i--)
		{
			revString+=str[i]+" ";
		}
		System.out.println("this is reversed string: "+revString);
	}
}
