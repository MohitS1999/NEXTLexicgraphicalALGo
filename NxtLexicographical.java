//https://www.nayuki.io/page/next-lexicographical-permutation-algorithm
import java.util.*;
public class NxtLexicographical{
	public static void nextpermutation(int[] a,int n){
		int i=a.length-1;
		while(i>0&&a[i-1]>=a[i]){
			i--;
		}
		if(i<=0){
			System.out.println("last permutation Already exist");
		}
		int j=a.length-1;
		while(a[j]<=a[i-1]){
			j--;
		}
		//swaping
		int temp=a[i-1];
		a[i-1]=a[j];
		a[j]=temp;
		//reverse
		j=a.length-1;
		while(i<j){
			temp=a[i-1];
			a[i-1]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		System.out.println("output----");
		for(int k=0;k<n;k++){
		System.out.println(a[k]);
		}
	}
	public static void main(String[] args){	
		Scanner sc=new Scanner(System.in);
		//int t=sc.nextInt();
		//while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			nextpermutation(a,n);
	//	}
	}
}