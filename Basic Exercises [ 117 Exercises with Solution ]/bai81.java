package allbaitap;

public class bai81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=======================BÀI 81=======================\n");
		int [] a = {20,30,40} ;
		for(int i=0; i<a.length-1; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]<a[j]) {
					int tam = a[i];
					a[i] = a[j];
					a[j] = tam;
				}
				
			}
		}
		for(int i=0; i<a.length; i++) 
		System.out.println(""+a[i]);
		
	}
}
