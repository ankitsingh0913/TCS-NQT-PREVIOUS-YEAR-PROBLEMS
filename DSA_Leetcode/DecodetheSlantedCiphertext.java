package DSA_Leetcode;

/*
PROBLEM NO> 2705. Decode the Slanted Ciphertext
*/

import java.util.Scanner;

public class DecodetheSlantedCiphertext {


    //--------OPTIMIZED SOLUTION--------//
    static String decodeCiphertext(String encodedText, int rows) {
        if (rows == 1) return encodedText;
        int l = encodedText.length();
        int cols = l / rows;
        StringBuilder res = new StringBuilder();
        
        for(int col = 0;col<cols;col++){
            int i= 0,j = col;
            while(i < rows && j < cols){
                res.append(encodedText.charAt(i * cols + j));
                i++;
                j++;
            }
        }
        return res.toString().replaceAll("\\s+$", "");
    }

    // --------First Approach--------//
    // static String decodeCiphertext(String encodedStr, int rows){
    //     int l = encodedStr.length();
    //     int m = rows, n = l / m;
    //     char[][] mat = new char[m][n];
    //     String res = "";
    //     for(int i = 0;i<m;i++){
    //         for(int j = 0;j<n;j++){
    //             mat[i][j] = encodedStr.charAt(j + i * n); 
    //         }
    //     }
    //     for(int col = 0;col<n;col++){
    //         int x= 0,y = col;
    //         while(x < m && y < n){
    //             res += mat[x][y];
    //             x++;
    //             y++;
    //         }
    //     }

    //     return res;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String encodedText = sc.nextLine();
        int rows = sc.nextInt();

        String decodedText = decodeCiphertext(encodedText, rows);
        System.out.println(decodedText);
    }
}
