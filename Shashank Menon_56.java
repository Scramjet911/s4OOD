import java.io.*;

import java.util.*;

public class Pattern {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int i = 0, j = 0, k = 0;
        for(i = 0;i<n;i++){
            if(2*i>=n-1)
                k=n-i-1;
            else
                k=i;
            for(j = k;j<n;j++){
                System.out.print(" ");
            }
            if(i==0||i==n){
                System.out.println("1");
                continue;
            }
            for(j = 0;j<=2*k;j++){
                if((j<11)||(j > (2*k-11)))
                    System.out.print("1");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
