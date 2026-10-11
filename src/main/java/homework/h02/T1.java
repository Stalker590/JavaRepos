package homework.h02;

public class T1 {
    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + (num - 1) % 9;
    }

    public static void main(String[] args) {
        T1 sol = new T1();
        System.out.println(sol.addDigits(38));
    }
}