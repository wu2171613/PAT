package pat.level.basic;

import java.util.Scanner;

public class P1056 {

    public int practise(String input) {
        String[] strs = input.split(" ");

        int n0 = Integer.parseInt(strs[0]);
        if (n0 <= 0 || n0 >= 10) {
            return -1;
        }

        int output = 0;
        for (int i = 1; i < strs.length; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (!strs[i].equals(strs[j])) {
                    String num = strs[i] + strs[j];
                    output += Integer.parseInt(num);
                }
            }
        }

        return output;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(new P1056().practise(scanner.nextLine()));;
        scanner.close();
    }

}
