/*
    peter rabbit lives in a colony and he is the only rabbit in his colony who 
    is not able to hop, on this 5th birthday his father rabbit gifted him a pogo stick. 
    He is excited by playing with his pogo stick and he wanted is the coordinates of peter rabbit's house (3,4),
    he travelled till (x2,y2) coordinates which is his friends house coordinates.
    Note: Pogo -stick travel only on a straight line and it hops 1 unit per jump
*/
import java.util.Scanner;
class PETER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        x = x-3;
        y = y-4;
        x = x*x;
        y = y*y;
        double res = x+y;
        res = Math.sqrt(res);
        System.out.println((int)res);
    }
}