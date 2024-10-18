class Arrayq6{
	public static void main(String [] args){
	double[] d = {2.5552, 5645.5151, 9849.9849};

		//for loop
	        //printing each elements
		for(int i = 0; i <= d.length-1;i++){
			System.out.println(d[i]);
		}
		System.out.println();

		//printing in reverse
		for(int j = d.length-1; j >= 0;j--){
			System.out.println(d[j]);
		}
		System.out.println();

		//while loop
		//printing each elements
		int k = 0;
		while(k <= d.length-1){
			System.out.println(d[k]);
			k++;
		}
		System.out.println();

		//printing in reverse
		int l = d.length-1;
		while(l >= 0){
			System.out.println(d[l]);
			l--;
		}
		System.out.println();

		//do-while loop
		//printing each elements
		int m = 0;
		do{
			System.out.println(d[m]);
			m++;
		}while(m <= d.length-1);
		System.out.println();

		//printing in reverse
		int n = d.length-1;
		do{
			System.out.println(d[n]);
			n--;
		}while(n >= 0);
		System.out.println();

		//for-each loop
		for(double s : d){
			System.out.println(s);
		}
	}
}