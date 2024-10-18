class Arrayq9{
	public static void main(String [] args){
	int [] n={23,532,64,54,79};

		//for loop
	        //printing each elements
		for(int i = 0; i <= n.length-1;i++){
			System.out.println(n[i]);
		}
		System.out.println();

		//printing in reverse
		for(int j = n.length-1; j >= 0;j--){
			System.out.println(n[j]);
		}
		System.out.println();

		//while loop
		//printing each elements
		int k = 0;
		while(k <= n.length-1){
			System.out.println(n[k]);
			k++;
		}
		System.out.println();

		//printing in reverse
		int l = n.length-1;
		while(l >= 0){
			System.out.println(n[l]);
			l--;
		}
		System.out.println();

		//do-while loop
		//printing each elements
		int m = 0;
		do{
			System.out.println(n[m]);
			m++;
		}while(m <= n.length-1);
		System.out.println();

		//printing in reverse
		int o = n.length-1;
		do{
			System.out.println(n[o]);
			o--;
		}while(o >= 0);
		System.out.println();

		//for-each loop
		for(int s : n){
			System.out.println(s);
		}
	}
}