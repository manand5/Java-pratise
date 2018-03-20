package ADT;

class Testarray {
	public static void main(String args[]) {

		int arr[] = { 4, 4, 5 };
		int ar[][] = { { 4, 5, 6 }, { 6, 7, 13 }, { 7, 9, 1 } };
		int br[][] = { { 4, 5, 6 }, { 6, 7, 13 }, { 7, 9, 1 } };
		int cr[][] = { { 1, 2 }, { 3, 4 } };
		int dr[][] = { { 5, 6 }, { 7, 8 } };
		Testarray m = new Testarray();
		//m.matrixAddition(ar, br);
		m.matrixmultiplication(cr, dr);
		m.printMatrix(ar);
		System.out.println("   ");
		m.printMatrix(br);

	}

	public void matrixAddition(int[][] a, int[][] b) {
		int c[][] = new int[3][3];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + "  ");
			}
			System.out.println(" ");

		}

	}
	public void printMatrix(int a[][]){
		for(int i=0; i<a.length;i++){
			for(int j=0; j<a.length;j++){
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void matrixmultiplication(int a[][], int b[][]) {
		int c[][] = new int[3][3];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				for(int k=0; k< c.length;k++){
				
					
					System.out.print(c[i][j] + "  ");
				}
	
			}
			System.out.println(" ");

		}

	}
}
