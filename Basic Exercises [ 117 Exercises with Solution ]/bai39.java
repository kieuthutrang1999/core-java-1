package allbaitap;

public class bai39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("=======================B�I 39=======================\n");
		int amount = 0;
		for(int i = 1; i <= 4; i++){
			for(int j = 1; j <= 4; j++){
				for(int k = 1; k <= 4; k++){
					if(k != i && k != j && i != j){
						amount++;
						System.out.println(i + "" + j + "" + k);
					}
				}
			}
		}
		System.out.println("tong ba chu so la " + amount);
	}

}
