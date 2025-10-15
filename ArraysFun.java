public class ArraysFun {
	public static void main(String[] args) {
		//Print all elements of a 2D array.
		int [][] intArr = {
		{1,2,3},
		{4,5,6},
		{7,8,9}
		};

		for(int i = 0; i<intArr.length; i++)
		{
			for(int j = 0; j<intArr[i].length; j++)
			{
				System.out.println("this is a 2D array: "+intArr[i][j]);
			}
		}
	}
	
}
