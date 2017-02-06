public class Driver {

    public static void sop(String x) {
        System.out.println(x);
    }

    //TEST CASES
    public static void main(String[] args) {
        sop("Int Mean");
        sop("Expected: 4 Given: " + Stats.mean(3,5));

        sop("\ndouble Mean");
        sop("Expected: 4.0 Given: " + Stats.mean(3.0,5)); //proof mismatches work

        sop("\nint Max");
        sop("Expected: 5 Given: " + Stats.max(4,5));
        sop("Expected: 5 Given: " + Stats.max(5,4));

        sop("\ndouble Max");
        sop("Expected: 5.0 Given: " + Stats.max(3.14,5));
        sop("Expected: 5.123123 Given: " + Stats.max(3.343,5.123123));
        sop("Expected: 500.0 Given: " + Stats.max(500,722.0/7));

        sop("\nint geoMean");
        sop("Expected: 4 Given: " + Stats.geoMean(4,5));
        sop("Expected: 6 Given: " + Stats.geoMean(9,4));

        sop("\ndouble geoMean");
        sop("Expected: ~4.47 Given: " + Stats.geoMean(4.0,5));
        sop("Expected: 6.0 Given: " + Stats.geoMean(9.0,4));
    }
}
