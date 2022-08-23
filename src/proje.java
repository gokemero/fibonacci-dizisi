import java.util.Scanner;
public class proje {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("dizinin kaçıncı elemanı bulunsun :");
        int a = input.nextInt();
        int k = 1,l = 1,m=1;
        if(a <=2) System.out.println("1");
        else{
        for(int i = 0;a-2>i;i++){
            m=k+l;
            l=k;
            k=m;

        }
            System.out.println(m);
        }
    }
}
