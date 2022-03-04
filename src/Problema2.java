public class Problema1 {
    public  String numerosEntre1y2() {
        String palabra1 = "Fizz";
        String palabra2 = "Buzz";
        String palabra3 = "Fizzbuzz";
        String n = "";
        for (int i = 1; i <= 20; i++) {
            if (esMultiploDe3y5(i)) {
                n = n + palabra3;
            } else if (esMultiploDe3(i)){
                n = n + palabra1;
            } else if (esMultiploDe5(i)) {
                n = n + palabra2;
            } else {
                n = n + i;
            }
        }
        return n;
    }

    private boolean esMultiploDe3(Integer n) {
        return n % 3 == 0;
    }

    private boolean esMultiploDe5(Integer n) {
        return n % 5 ==0;
    }

    private boolean esMultiploDe3y5(Integer n) {
        return n / 3.0 == 5.0;
    }
}
