package hacker_rank.easy_level;

import java.io.*;
import java.util.*;

class PlusMinusResult {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {

        int p = 0, n = 0, z = 0;

        for (Integer num : arr) {
            if (num > 0)
                p++;
            else if (num < 0)
                n++;
            else
                z++;
        }

        System.out.println((double) p / arr.size());
        System.out.println((double) n / arr.size());
        System.out.println((double) z / arr.size());
    }
}

public class Plus_Minus {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine()
                .replaceAll("\\s+$", "")
                .split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(arrTemp[i]));
        }

        // Changed from Result.plusMinus(arr);
        PlusMinusResult.plusMinus(arr);

        bufferedReader.close();
    }
}