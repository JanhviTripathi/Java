class Arrayq8{
	public static void main(String [] args){
	byte [] b={23,53,64,5,79};

		//for loop
	        //printing each elements
		for(int i = 0; i <= b.length-1;i++){
			System.out.println(b[i]);
		}
		System.out.println();

		//printing in reverse
		for(int j = b.length-1; j >= 0;j--){
			System.out.println(b[j]);
		}
		System.out.println();

		//while loop
		//printing each elements
		int k = 0;
		while(k <= b.length-1){
			System.out.println(b[k]);
			k++;
		}
		System.out.println();

		//printing in reverse
		int l = b.length-1;
		while(l >= 0){
			System.out.println(b[l]);
			l--;
		}
		System.out.println();

		//do-while loop
		//printing each elements
		int m = 0;
		do{
			System.out.println(b[m]);
			m++;
		}while(m <= b.length-1);
		System.out.println();

		//printing in reverse
		int n = b.length-1;
		do{
			System.out.println(b[n]);
			n--;
		}while(n >= 0);
		System.out.println();

		//for-each loop
		for(byte s : b){
			System.out.println(s);
		}
	}
}