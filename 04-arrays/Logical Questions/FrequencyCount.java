package array;

public class FrequencyCount 
{
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,2,1,5,2,3,6,7,4};
		boolean visited[] = new boolean[arr.length];
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(visited[i])
				continue;
			
			int count = 1;
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					visited[j] = true;
					count++;
				}
			}
			
			System.out.println(arr[i]+": appears :"+count+" times in array.");
		}
	}

}
