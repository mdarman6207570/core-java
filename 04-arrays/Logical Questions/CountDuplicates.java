package array;

public class CountDuplicates {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 3, 4, 6, 2,2,4, 5, 4};


        boolean visited[] = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) 
                continue; 

            int cnt = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true; 
                    cnt++;
                }
            }

            if (cnt > 1)
            	System.out.print(" "+arr[i]);
        }

        
    }
}
