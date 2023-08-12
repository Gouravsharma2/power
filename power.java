import java.util.*;
public class power {
    public static int powero(int a, int n) {
        if (n==0) {
            return 1;
        }
        int halfpowersq = powero(a,n/2) * powero(a,n/2);
        if (n%2 != 0) {
            int halfpowersq =a * (powero(a,n/2) * powero(a,n/2));
        }
    }
    public static void main (String args[]) {
        int a =2;
        int n=5;
        System.out.println(powero (a,n));
    }
} 