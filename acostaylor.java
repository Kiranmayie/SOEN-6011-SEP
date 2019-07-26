public class Taylor {

    // return n!
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n-1);
    }


    public static void main(String[] args) { 

        // number of terms
        int N = Integer.parseInt(args[0]);

        // Taylor series for e^x
        RationalPolynomial e = RationalPolynomial.ZERO;
        for (int i = 0; i < N; i++) {
            BigRational coef = new BigRational(1, factorial(i));
            RationalPolynomial term = new RationalPolynomial(coef, i);
            e = e.plus(term);
        }
        StdOut.println("e^x = " + e);

        // Taylor series for acos(x)
        RationalPolynomial acos = RationalPolynomial.ZERO;
        for (int i = 0; i < N; i++) {
            BigRational coef;
            if      (i % 4 == 0) coef = BigRational.ZERO;
            else if (i % 4 == 1) coef = new BigRational(1, factorial(i));
            else if (i % 4 == 2) coef = BigRational.ZERO;
            else                 coef = new BigRational(-1, factorial(i));
            RationalPolynomial term = new RationalPolynomial(coef, i);
            acos= acos.plus(term);
        }
        StdOut.println("acos(x) = " + acos);

        StdOut.println("e^x acos(x) = " + e.times(acos).truncate(N));

   }

}
