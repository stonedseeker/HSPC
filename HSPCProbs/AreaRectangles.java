

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.abs;

public class AreaRectangles {
    public static void main(String[] args) {
        float[][] rectInputs =  takingInput();
        RectangleArea(rectInputs);
    }

    static float[][] takingInput(){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of Rectangles you want to compare");
        int n = in.nextInt();

        float[][] rectInputs = new float[n][6];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < 6; col++) {
                rectInputs[row][col] = in.nextFloat();
            }
        }
        return rectInputs;
    }

    static void RectangleArea(float[][] rectInputs) {


        for (int i = 0; i < rectInputs.length; i++) {
            System.out.println(Arrays.toString(rectInputs[i]));
        }
        float[] areas = new float[rectInputs.length];

        for (int i = 0; i < rectInputs.length; i++) {
            areas[i] = abs(rectInputs[i][0] * (rectInputs[i][3] - rectInputs[i][5]) + rectInputs[i][2] * (rectInputs[i][5] - rectInputs[i][1]) + rectInputs[i][4] * (rectInputs[i][1] - rectInputs[i][3]));
        }

        System.out.println(Arrays.toString(areas));

        for (int i = 0, j = 0; i < rectInputs.length && j < rectInputs[i].length; i++, j++) {
            System.out.println("The area of the rectangle with the vertices" + "(" + rectInputs[i][j] + ")" + " is " + areas[i]);
        }

    }

    }

