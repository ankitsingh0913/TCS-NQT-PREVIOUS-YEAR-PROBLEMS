
import java.util.Scanner;

public class HappyStateOrSadState{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        
        double h = n;
        double s = 0;
        for(int i = 0;i<4;i++){
            double nh = 0.3 * h + 0.5*s;
            double ns = 0.7 * h + 0.5*s;

            h = nh;
            s = ns;
        }
        System.out.println((int)h+" "+(int)s);;
    }
}