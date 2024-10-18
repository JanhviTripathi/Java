class Arrayq1{
	public static void main(String [] args){
		short [] a = {52,62,44};

		//for loop
	        //printing each elements
		for(int i = 0; i <= a.length-1;i++){
			System.out.println(a[i]);
		}
		System.out.println();

		//printing in reverse
		for(int j = a.length-1; j >= 0;j--){
			System.out.println(a[j]);
		}
		System.out.println();

		//while loop
		//printing each elements
		int k = 0;
		while(k <= a.length-1){
			System.out.println(a[k]);
			k++;
		}
		System.out.println();

		//printing in reverse
		int l = a.length-1;
		while(l >= 0){
			System.out.println(a[l]);
			l--;
		}
		System.out.println();

		//do-while loop
		//printing each elements
		int m = 0;
		do{
			System.out.println(a[m]);
			m++;
		}while(m <= a.length-1);
		System.out.println();

		//printing in reverse
		int n = a.length-1;
		do{
			System.out.println(a[n]);
			n--;
		}while(n >= 0);
		System.out.println();

		//for-each loop
		for(short s : a){
			System.out.println(s);
		}
	}
}