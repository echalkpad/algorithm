package multiplicationchart;

public class MultiplicationChartTest {

	/**
	 * Multiplication chart printed from the right side
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++){
			for(int k = 0; k < 9-i+1; k++) System.out.print("          ");
			for(int j = i; j >= 1; j--){
				System.out.print(i+" * "+j+"   ");
			}
			System.out.println();
		}
	}

}
