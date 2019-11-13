public class text{
	public static void main(String[] args) {
		wenti();
	}
	public static void wenti() {
		int c,temp;
		int[] a = new int[50];
		int[] b = new int[50];
		char c;
		int result[] = new int[50];
		for(int i = 1; i <= 50; i++) 
                                              {
			Random random = new Random();
			a[i - 1] = random.nextInt(101);
			b[i - 1] = random.nextInt(101);
			c = random.nextInt(2);
			c(a, b);
			if (c == 1) 
                                               {
				c= '+';
				while(a[i - 1] + b[i -1] > 100) 
                                              {
					if(a[i - 1] > 50)
						a[i - 1] = a[i - 1] - 50;
					else
						b[i -1] = b[i -1] - 50;
				}
			}
			else {
				if(a[i - 1] < b[i -1])
                                               {
					temp = a[i - 1];
					b[i -1] = a[i - 1];
					a[i - 1] = b[i -1];
				}
				c= '-';
			}
			result[i - 1] = result(a[i - 1],b[i -1],c);
			System.out.print(i + "." + a[i -1] + " " +c+ " " + b[i - 1] + "=\t");
			for(int j = 1;j < 13; j++)
				if(i == 4 * j)
					System.out.println();
			}
			System.out.println();
			printResult(result);
	}
	public static void daan(int[] result) 
               {
		for(int i = 1; i <= 50; i++)
                               {
			System.out.print("µÚ" + i + "Ìâ´ð°¸£º" + result[i - 1] + "\t");
		for(int j = 1;j < 13; j++)
			if(i == 4 * j)
				System.out.println();
		}
	}
	public static int fuhao(int a, int b,char fuhao) {
		if(fuhao == '+')
			return a + b;
		else
			return a - b;
	}
	public static void norepeat(int[] a,int[] b) {
		Random random = new Random();
		for(int i = 0; i < 50; i++)         
{
			for(int j = 0;j < i; j++) 
               {
				if(a[i] == a[j]) 
                                {
					a[i] = random.nextInt(101);
					continue;
			}
				if(b[i] == b[j])
                                                                 {
					b[i] = random.nextInt(101);
					continue;
				 }
			}
		}
	}
}

