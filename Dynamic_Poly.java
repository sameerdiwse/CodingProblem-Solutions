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
		//Below is the corrected code
		A a = new B();
		a.show();//Even if B doesn't have show function, A's show() will be picked up here.

		
	}
}
