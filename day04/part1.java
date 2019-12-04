import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        String input = "134564-585159";
        String[] parts = input.split("-");
        int start = Integer.parseInt(parts[0]);
        int end = Integer.parseInt(parts[1]);
        int n = 0;
        for (int i = start; i <= end; i += 1) {
            char[] chars = Integer.toString(i).toCharArray();
            if (chars.length != 6) {
                continue;
            }

            if (
                    chars[0] > chars[1] || chars[1] > chars[2] ||
                    chars[2] > chars[3] || chars[3] > chars[4] ||
                    chars[4] > chars[5]
            ) {
                    continue;
            }


            Boolean adjacentSame = false;
            char prev = chars[0];
            for (int j = 1; j < chars.length; j += 1) {
                if (prev == chars[j]) {
                    adjacentSame = true;
                    break;
                }
                prev = chars[j];
            }

            if (!adjacentSame) {
                continue;
            }

            n += 1;
        }
        System.out.println(n);
    }
}
