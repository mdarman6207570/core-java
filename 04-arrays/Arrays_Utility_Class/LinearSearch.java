package utilityclasses;

//[Linear Search
public class LinearSearch {
	
	public static void main(String[] args) 
	{
		int arr[] = { 5, 2, 4, 6, 8, 1, 4 };
		int ele = 4;
		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				System.out.println("Found at index :" + i);
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("Not Found");
		}

	}

}