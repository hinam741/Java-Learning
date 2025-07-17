import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt(); //giá trị khởi đầu
            int b = in.nextInt(); //giá trị nhân với lũy thừa của 2
            int n = in.nextInt(); //số phần tử trong dãy

            int sum = a; //khởi tạo biến sum = a

            for(int j = 0; j < n; j++){
                sum += (int)Math.pow(2,j) * b; //2^j * b
                System.out.print(sum + " ");
            }
            System.out.println();
        }
        in.close();
    }
}