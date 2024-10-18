class Arrayq2{
	public static void main(String [] args){
		long [] e= {5234343l,6234343l,4434343l};

		//for loop
	        //printing each elements
		for(int i = 0; i <= e.length-1;i++){
			System.out.println(e[i]);
		}
		System.out.println();

		//printing in reverse
		for(int j = e.length-1; j >= 0;j--){
			System.out.println(e[j]);
		}
		System.out.println();

		//while loop
		//printing each elements
		int k = 0;
		while(k <= e.length-1){
			System.out.println(e[k]);
			k++;
		}
		System.out.println();

		//printing in reverse
		int l = e.length-1;
		while(l >= 0){
			System.out.println(e[l]);
			l--;
		}
		System.out.println();

		//do-while loop
		//printing each elements
		int m = 0;
		do{
			System.out.println(e[m]);
			m++;
		}while(m <= e.length-1);
		System.out.println();

		//printing in reverse
		int n = e.length-1;
		do{
			System.out.println(e[n]);
			n--;
		}while(n >= 0);
		System.out.println();

		//for-each loop
		for(long s : e){
			System.out.println(s);
		}
	}
}