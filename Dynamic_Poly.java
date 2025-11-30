class A
{
	void show(){	
	System.out.println("show A");
	}
}

class B extends A
{
	//void show(){	
	//System.out.println("show B");
	//}

}

class Dynamic_Poly
{
	public static void main(String[] args) {
		A a = new B();
		a.show();

		
	}
}
