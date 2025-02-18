import java.util.Scanner;

public class Knapsack {

    public void solve(int[] wt, int[] val, int W, int N) {
        int[][] m = new int[N + 1][W + 1];
        boolean[][] sol = new boolean[N + 1][W + 1];

        for (int i = 0; i <= N; i++) {
            m[i][0] = 0;
        }
        for (int w = 0; w <= W; w++) {
            m[0][w] = 0;
        }

        for (int i = 1; i <= N; i++) {
            for (int w = 1; w <= W; w++) {
                if (wt[i] <= w) {
                    if (val[i] + m[i - 1][w - wt[i]] > m[i - 1][w]) {
                        m[i][w] = val[i] + m[i - 1][w - wt[i]];
                        sol[i][w] = true;
                    } else {
                        m[i][w] = m[i - 1][w];
                        sol[i][w] = false;
                    }
                } else {
                    m[i][w] = m[i - 1][w];
                    sol[i][w] = false;
                }
            }
        }

        System.out.println("Maximum value: " + m[N][W]);

        System.out.println("\nItems selected by knapsack algorithm:");
        int w = W;
        for (int i = N; i > 0; i--) {
            if (sol[i][w]) {
                System.out.print(val[i] + " ");
                w -= wt[i];
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Knapsack ks = new Knapsack();

        System.out.println("Enter number of elements ");
        int n = scan.nextInt();

        int[] wt = new int[n + 1];
        int[] val = new int[n + 1];

        System.out.println("Enter weight for " + n + " elements");
        for (int i = 1; i <= n; i++) {
            wt[i] = scan.nextInt();
        }

        System.out.println("Enter value for " + n + " elements");
        for (int i = 1; i <= n; i++) {
            val[i] = scan.nextInt();
        }

        System.out.println("Enter knapsack weight ");
        int W = scan.nextInt();

        ks.solve(wt, val, W, n);

        scan.close();
    }
}
