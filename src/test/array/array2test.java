package test.array;

public class array2test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr1 = new int[2][];
		int n = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = new int[3];
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = ++n;
				
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
			
		}
	}

}
