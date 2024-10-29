package week3;

//**Display right angle triangle of @ using nested for loops
//@
//@@
//@@@
//@@@@
//@@@@@
public class RightAngleTriangle {

    public static void main(String[] args) {
        //nested loop logic
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                //expected symbole to print
                System.out.print("@");
            }
            //expected outcome
            System.out.println();
        }
    }
}
