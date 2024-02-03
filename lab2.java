import java.util.Scanner;
class lab2{
    static int[][] spiral(int n){
        int[][] ans=new int[n][n];
        int sc=0;
        int sr=0;
        int ec=n-1;
        int er=n-1;
        int k=1;
        while(k<=n*n){
            for(int j=sc;j<=ec;j++){
                ans[sr][j]=k;
                k++;
            }
            if(++sr>er) break;
            for(int i=sr;i<=er;i++){
                ans[i][ec]=k;
                k++;
            }
            if(--ec<sc) break;
            for(int j=ec;j>=sc;j--){
                ans[er][j]=k;
                k++;
            }
            if(--er<sr) break;
            for(int i=er;i>=sr;i--){
                ans[i][sc]=k;
                k++;
            }
            if(++sc>ec) break;
        }
        return ans;
        
    }
    public static void main(String args[]){
        Scanner myobj=new Scanner(System.in);
        System.out.print("enter the size of square matrix : ");
        int n=myobj.nextInt();
        int[][] result= spiral(n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}