class Tester {
    public static void main(String[] args) {
        int n = 371;
        int x = n, cnt = 0, arm = 0;
        while (x != 0) {
            cnt++;
            x /= 10;
        }

        x = n;
        while (x != 0) {
            int y = x % 10;
            arm = arm + (int)Math.pow(y, cnt);
            x /= 10;
        }

        if (n == arm) 
            System.out.print(n + " is an Armstrong number");
        else 
            System.out.print(n + " is not an Armstrong number");
    }
}
