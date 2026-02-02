package hacker_rank.easy_level;

import java.io.*;
import java.util.*;

public class Compare_the_Triplets {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        int aScore = 0, bScore = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) aScore++;
            else if (a.get(i) < b.get(i)) bScore++;
        }

        return Arrays.asList(aScore, bScore);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        List<Integer> a = Arrays.asList(sc.nextInt(), sc.nextInt(), sc.nextInt());
        List<Integer> b = Arrays.asList(sc.nextInt(), sc.nextInt(), sc.nextInt());

        List<Integer> result = compareTriplets(a, b);

        System.out.println(result.get(0) + " " + result.get(1));
    }
}
