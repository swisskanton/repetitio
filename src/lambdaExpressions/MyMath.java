package lambdaExpressions;

public class MyMath {

    //public MyMath() {}

    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    PerformOperation isOdd() {
        return (n) -> n % 2 != 0;
    }

    PerformOperation isPrime() {
        return (n) -> {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };
    }

    PerformOperation isPalindrome() {
        return (n) -> {
            String strNum = Integer.toString(n);
            StringBuilder sb = new StringBuilder(strNum);
            return sb.toString().equals(sb.reverse().toString());
        };
    }
}
