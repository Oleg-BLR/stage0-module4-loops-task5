package school.mjc.stage0.loops.task5;

public class Rectangle {
    public static void main(String[] args) {
        printRectangleFrom8s(5, 4);
    }
    public static void printRectangleFrom8s(int length, int height){
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= length; j++) {
                if (i == 1 || i == height) {
                    System.out.print("8");
                } else if (j == 1 || j == length) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}
