1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
#code---------------------------------------------------------------------------------------------------------------------------------------
import java.util.*;
public class Main
{
    public static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print(n-j+1+" ");
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		pattern(n);
	}
}
