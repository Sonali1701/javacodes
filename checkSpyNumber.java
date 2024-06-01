import java.util.*;

class checkSpyNumber{
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        if(n==0){
            System.out.println("Number is Spy number");
        }
        int sum=0;
        int mul=1;
        while(n>0){
            int r=n%10;
            sum=r+sum;
            mul=r*mul;
            n=n/10;
        }
        if(sum==mul){
            System.out.println("Number is Spy number");
        }else{
            System.out.println("Number is not Spy number");
        }

    }
}