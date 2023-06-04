package timus;

import java.util.*;
import java.lang.*;

public class Task_1197 {
    public static void main(String[] args) {

        Scanner inScanner= new Scanner(System.in);
        int[] move_row=new int[]{-2,-2,-1,-1, 1,1, 2,2};
        int[] move_col=new int[]{-1, 1,-2, 2,-2,2,-1,1};
        int input=inScanner.nextInt();
        String[] pos=new String[input];
        for(int i=0;i<pos.length;i++){
            pos[i]=inScanner.next();
        }


        for (String po : pos) {
            int ans = 0;

            int row = po.charAt(0) - 'a';

            int col = Character.getNumericValue(po.charAt(1)) - 1;

            for (int j = 0; j < 8; j++) {
                int row2;
                int col2;
                row2 = row + move_row[j];
                col2 = col + move_col[j];
                if (row2 >= 0 && row2 < 8 && col2 >= 0 && col2 < 8) ans++;
            }
            System.out.println(ans);
        }
    }
}