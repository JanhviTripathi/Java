class Arrayq5{
	public static void main(String [] args){
		String [] st = {"Hy","Hello","Bye","String"};

		//for loop
	        //printing each elements
		for(int i = 0; i <= st.length-1;i++){
			System.out.println(st[i]);
		}
		System.out.println();

		//printing in reverse
		for(int j = st.length-1; j >= 0;j--){
			System.out.println(st[j]);
		}
		System.out.println();

		//while loop
		//printing each elements
		int k = 0;
		while(k <= st.length-1){
			System.out.println(st[k]);
			k++;
		}
		System.out.println();

		//printing in reverse
		int l = st.length-1;
		while(l >= 0){
			System.out.println(st[l]);
			l--;
		}
		System.out.println();

		//do-while loop
		//printing each elements
		int m = 0;
		do{
			System.out.println(st[m]);
			m++;
		}while(m <= st.length-1);
		System.out.println();

		//printing in reverse
		int n = st.length-1;
		do{
			System.out.println(st[n]);
			n--;
		}while(n >= 0);
		System.out.println();

		//for-each loop
		for(String s : st){
			System.out.println(s);
		}
	}
}