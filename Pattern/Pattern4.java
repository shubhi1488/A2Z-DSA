1
2 2
3 3 3 
4 4 4 4 
5 5 5 5 5 
#code-------------------------------------------------------------------------------------------------------------------------------------------
class Program{
  public static void Pattern(int n){
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print(i+" ");
      }
      System.out.println();
    }
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Pattern(n);
  }
}
