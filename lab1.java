import java.util.Scanner;
class lab1{  
    // factorial

    // static int fact(int n){
    //     int fact=1;
    //     for(int i=1;i<=n;i++){
    //         fact*=i;
    //     }
    //     return fact;
    // }
    // public static void main(String args[]){  
    //        Scanner myobj=new Scanner(System.in);
    //        int n=myobj.nextInt();
    //     System.out.println(fact(n));
    // }  


    // fibonacci



    // static int[] fib(int n){
    //     int[] arr=new int[n];
    //     arr[0]=0;
    //     arr[1]=1;
    //     for(int i=2;i<n;i++){
    //         arr[i]=arr[i-1]+arr[i-2];
    //     }
    //     return arr;
    // }
    // public static void main(String args[]){
    //     Scanner myobj=new Scanner(System.in);
    //     int n=myobj.nextInt();
    //     int[] ans=fib(n);
    //     for(int i=0;i<n;i++){
    //         System.out.println(ans[i]);
    //     }
    // }

    
    // prime

    public static void main(String args[]){
        Scanner myobj=new Scanner(System.in);
        int n=myobj.nextInt();
        int[] arr =new int[n];
        int i=0;
        int z=2;
        while(i<n){
            int j=2;
            for(j=2;j<z;j++){
                if(z%j==0) break;
            }
            if(j==z){
                arr[i]=z;
                i++;
            } 
            z++;
        }
        for(int j=0;j<n;j++){
            System.out.println(arr[j]);
        }
    }


    // calculator

    // public static void main(String args[]){
    //     Scanner myobj = new Scanner(System.in);
    //     System.out.println("choose any these operator *,+,-,/");
    //     char op = myobj.next().charAt(0);
    //     System.out.println("enter first num:");
    //     double n1=myobj.nextDouble();
    //     System.out.println("enter second num:");
    //     double n2=myobj.nextDouble();
    //     double result;
    //     switch(op){
    //         case '+':result=n1+n2;
    //         System.out.println(result);
    //         break;
    //         case '-':result=n1-n2;
    //         System.out.println(result);
    //         break;
    //         case '*':result=n1*n2;
    //         System.out.println(result);
    //         break;
    //         case '/':result=n1/n2;
    //         System.out.println(result);
    //         break;
    //         default:
    //             System.out.println("operator is not correct");
    //     }
    // }
}  