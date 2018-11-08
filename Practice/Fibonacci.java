public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci sol = new Fibonacci();
        for (int i = 0; i <= 1; i++) {
            System.out.println(sol.fib(i) + ", " + sol.fib2(i) + ", " + sol.fib3(i));
        }

        System.out.println(sol.fib4(8181));
    }

    public int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    public int fib2(int n) {
        if (n <= 1) return n;
        int[] f = new int[n + 1];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n; i++)
            f[i] = f[i - 1] + f[i - 2];
        return f[n];
    }

    public int fib3(int n) {
        if (n <= 1) return n;
        int f0 = 0, f1 = 1;
        for (int i = 2; i <= n; i++) {
            int tmp = f1;
            f1 = f0 + f1;
            f0 = tmp;
        }
        return f1;
    }

    public String fib4(int n) {
        if (n <= 1) return String.valueOf(n);
        String f0 = "0", f1 = "1";
        for (int i = 2; i <= n; i++) {
            String tmp = f1;
            f1 = BigNumAdd.add(f0, f1);
            f0 = tmp;
        }
        return f1;
    }
}
