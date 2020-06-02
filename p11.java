import java.util.*;
class p11 {
    public static void main(String[] args) {
        String[] s = new String[15];
        s[0] = "75";
        s[1] = "95 64";
        s[2] = "17 47 82";
        s[3] = "18 35 87 10";
        s[4] = "20 04 82 47 65";
        s[5] = "19 01 23 75 03 34";
        s[6] = "88 02 77 73 07 63 67";
        s[7] = "99 65 04 28 06 16 70 92";
        s[8] = "41 41 26 56 83 40 80 70 33";
        s[9] = "41 48 72 33 47 32 37 16 94 29";
        s[10]= "53 71 44 65 25 43 91 52 97 51 14";
        s[11]= "70 11 33 28 77 73 17 78 39 68 17 57";
        s[12]= "91 71 52 38 17 14 91 43 58 50 27 29 48";
        s[13]= "63 66 04 68 89 53 67 30 73 16 69 87 40 31";
        s[14]= "04 62 98 27 23 09 70 98 73 93 38 53 60 04 23";
        int A[][] = new int[15][15];
        for(int i=0;i<15;i++) {
            String r[] = s[i].split(" ");
            for(int j=0;j<=i;j++) {
                A[i][j] = Integer.parseInt(r[j]);
            }
        }
        int sum=0;
        sum = callRec(0, A, 15, 0,0);
        System.out.println(sum);
    }
    public static int callRec(int sum, int[][] A, int size, int row, int col) {
        if(row>=size) return 0;
        int max=A[row][col];
        max=max + Math.max( callRec(sum, A, size, row+1, col),callRec(sum, A, size, row+1, col+1));
        return max;
    }
}