package Stack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

            Scanner in = new Scanner(System.in);
            int n = in.nextInt();

            for(int i = 0; i < n; i++) {
                String s = in.next();
                MatchingBrackets matchingBrackets = new MatchingBrackets();
                System.out.println(matchingBrackets.check(s));
            }
    }
}
