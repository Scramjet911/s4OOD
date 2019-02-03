import java.io.*;

import java.util.*;

public class ShashankMenon_56 {
    public static void main(String[] args) {
        int n1,n2;
        System.out.println("Enter The Number of Rows of the Diamond : ");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        System.out.println("Enter The Thickness of the Boundary (in number of 1's) : ");
        n2 = sc.nextInt();
        
        int i = 0, j = 0, k = 0;
        for(i = 0;i<n1;i++){
            if(2*i>=n1-1)
                k=n1-i-1;
            else
                k=i;
            for(j = k;j<n1;j++){
                System.out.print(" ");
            }
            if(i==0||i==n1){
                System.out.println("1");
                continue;
            }
            for(j = 0;j<=2*k;j++){
                if((j<n2)||(j > (2*k-n2)))
                    System.out.print("1");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
