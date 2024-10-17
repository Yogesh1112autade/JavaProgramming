package ExceptionHandling;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int arr[]= {1,2,3,4,5};
			System.out.println(arr[3]);
		}
		catch(Exception e) {
			System.out.println("Something went wrong");
		}

		finally
		{
			System.out.println("the try catch is finally done");
		}
	}

}
