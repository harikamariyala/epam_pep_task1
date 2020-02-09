import java.io.*;
import java.util.*;
class Chef{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		System.out.println("Hello!!");
		while(t-->0){
			float count=0;
			int m=sc.nextInt();
			float n=sc.nextFloat();
			float k=sc.nextFloat();
			float l=sc.nextFloat();
			while(n>0){
				if(n-l >=0){
					count=l+count;
					n=n-l;

				}
				else{
					count+=n;
				}
				if(n-k>=0){
					n=n-k;
				}
			}
			int p=(int)count;
			System.out.println(p);
		}
	}
}
					
