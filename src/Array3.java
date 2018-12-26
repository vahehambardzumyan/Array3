import java.sql.SQLOutput;
        import java.util.Scanner;

public class Array3 {

    public static void main(String[] args) {
        int[] a=new int[3];
        a = new int[] {0,9,8};
        int[] b=new int[2];
        b = new int[] {1,3};

        System.out.println(start1(a,b));
    }


    public static int start1(int[] a, int[] b){

        if (a[0]!=1&&b[0]!=1){
            return 0;
        }else if(a[0]==1&&b[0]==1){
            return 2;
        }else return 1;

    }


}
