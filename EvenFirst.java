class EvenFirst
{

  public static void main(String [] args)
  {
    int [] arr = {1,2,3,4,5,6,7,8,9,10};
	firstEvenAndOdd(arr);
  }
  
  public static void firstEvenAndOdd(int arr1 [])
  {
	  int [] a = new int [arr1.length];
	  int count = 0;
	for(int i = 0; i<arr1.length; i++)
	{
		if(arr1[i] % 2 == 0)
		{
			a[count] = arr1[i];
			count++;
		}
	}
	for(int i = 0; i<arr1.length; i++)
	{
		if(arr1[i] % 2 != 0)
		{
		  a[count] = arr1[i];
		  count++;
		}
	}
	for(int i = 0; i<arr1.length; i++)
	{
		System.out.println(a[i]);
	}
  }
}