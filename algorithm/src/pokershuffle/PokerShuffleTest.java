package pokershuffle;

public class PokerShuffleTest {

	/**
	 * Poker Shuffle
	 * @param args
	 */
	public static void main(String[] args) {
		int[] poker = init();
		poker = shuffle(poker);
		print(poker);
	}
	
	protected static int[] init() {
		int[] poker = new int[54];
		for(int i = 0; i < 54; i++){
			poker[i] = i+1;
		}
		return poker;
	}

	protected static int[] shuffle(int[] poker) {
		for(int i = 0; i < poker.length; i++){
			int j = (int) (poker.length * Math.random());
			swap(poker, i, j);
		}
		return poker;
	}
	
	private static void swap(int[] poker, int i, int j){
		if(i == j)
			return;
		/*poker[i] = poker[i] + poker[j];
		poker[j] = poker[i] - poker[j];
		poker[i] = poker[i] - poker[j];*/
		int temp = poker[i];
		poker[i] = poker[j];
		poker[j] = temp;
	}
	
	private static void print(int[] poker) {
		for (int i = 0; i < poker.length; i++) {  
            System.out.print(poker[i] + "\t");  
        }  
        System.out.println();  
	}
	
}
