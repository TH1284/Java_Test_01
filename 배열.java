
public class 배열 {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		
		int[] arr2 = arr;
		int[] arr3 = arr2;
		arr3[0] = 10;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
//	System.out.println(arr[0]);
//	System.out.println(arr2[0]);
//	System.out.println(arr3[0]);
	}
}
