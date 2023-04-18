class SortBigDecimalTest {

    public static void main(String[] args) {

        String[] s = new String[] {"-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34", "000.000"};

        //Output:
        //        90
        //        56.6
        //        50
        //        02.34
        //        0.12
        //        .12
        //        0
        //        000.000
        //        -100

        s = SortBigDecimal.sortBigDecimal(s);
        SortBigDecimal.printBigDigits(s);
    }

}