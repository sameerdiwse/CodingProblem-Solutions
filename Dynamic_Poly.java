class A
{
	void show(){	
	System.out.println("show A");
	}
}

class B extends A
{
	void show(){	
	System.out.println("show B");
	}

}

class Dynamic_Poly
{
	public static void main(String[] args) {
		//B b = new A();//Will give a type mismatch compilation error
		////Below is the corrected code
		A a = new B();
		a.show();//Even if B doesn't have show function, A's show() will be picked up here.

		//String immutability practice
		String s1 = new String("Java");
		String s2 = new String("Java");
		System.out.println("checking reference equality: "+(s1==s2));
		//Above code returns false, because two new objects are created and both object references are pointing at two 
		//different objects.
		System.out.println("checking the content: "+(s1.equals(s2)));

		//find out the longest word
		String str = "I am a Java Programmer, I like to code.";

		String[] strArr = str.split(" ");
		String maxLen = "";
		for (String string : strArr) {
			if(string.length()>maxLen.length())
		{
				maxLen = string;
			}
		}
		System.out.println("this is the max length word: "+maxLen);	
	}
}
