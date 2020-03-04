package org.example;

public class Casio extends BasicCalc implements Calculator {
    public int a;
    public int b;
    private int ans;


    @Override
    public int add(int a, int b) {
        ans = a + b;
        System.out.println("Casio - add " + a + " und " + b + "= " + ans);
        return ans;

    }

    @Override
    public int subtract(int a, int b) {
        ans = a - b;
        {
            System.out.println("Casio - subtract " + a + " und " + b
                    + "= " + ans);
            return ans;
        }
    }
    @Override
    public int multiply(int a, int b) {
            ans = a * b;
            System.out.println("Casio - multiply " + a + " und " + b + "= " + ans);
            return ans;
        }

    @Override
    public int min(int a, int b) {
        System.out.println("Casio - min " + a + " und " + b);
        if (a < b)
            return a;
        else
            return b;
    }

    @Override
    public int crossSum(int a) {
            System.out.println("Casio - crossSum " + a);
            int sum = 0;
            while (0 != a) {
                sum = sum + (a % 10);
                a = a / 10;
            }
            return sum;
    }
}
