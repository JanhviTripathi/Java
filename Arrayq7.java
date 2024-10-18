class Arrayq7{
	public static void main(String [] args){
	float [] f={23.4f,53.2f,64.3f,5.4f,79.2f};

		//for loop
	        //printing each elements
		for(int i = 0; i <= f.length-1;i++){
			System.out.println(f[i]);
		}
		System.out.println();

		//printing in reverse
		for(int j = f.length-1; j >= 0;j--){
			System.out.println(f[j]);
		}
		System.out.println();

		//while loop
		//printing each elements
		int k = 0;
		while(k <= f.length-1){
			System.out.println(f[k]);
			k++;
		}
		System.out.println();

		//printing in reverse
		int l = f.length-1;
		while(l >= 0){
			System.out.println(f[l]);
			l--;
		}
		System.out.println();

		//do-while loop
		//printing each elements
		int m = 0;
		do{
			System.out.println(f[m]);
			m++;
		}while(m <= f.length-1);
		System.out.println();

		//printing in reverse
		int n = f.length-1;
		do{
			System.out.println(f[n]);
			n--;
		}while(n >= 0);
		System.out.println();

		//for-each loop
		for(float s : f){
			System.out.println(s);
		}
	}
}