class Tester {
	public static void main(String[] args) {
		int n=1623;
		int x=n,lucky=0,flag=0;
		String s=Integer.toString(n);
		for(char i:s.toCharArray()){
		    int a=i-'0';
		    if(flag==0) flag=1;
		    else{
		        lucky+=a*a;
		        flag=0;
		    }
		}
		if(lucky%9==0) System.out.print("The number "+n+" is a lucky number");
		else System.out.print("The number "+n+" is not a lucky number");
	}
}
