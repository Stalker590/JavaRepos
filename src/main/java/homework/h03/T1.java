package homework.h03;

public class T1 {
    public double average(int[] salary) {
        int min = salary[0];
        int max = salary[0];
        int sum = salary[0];

        for (int i = 1; i < salary.length; i++) {
            if (salary[i] < min) {
                min = salary[i];
            }
            if (salary[i] > max) {
                max = salary[i];
            }
            sum += salary[i];
        }
        return (double) (sum - min - max) / (salary.length - 2);
    }

    public static void main(String[] args) {
        T1 sol = new T1();

        int[] salary1 = {4000, 3000, 1000, 2000};
        System.out.println(sol.average(salary1));

        int[] salary2 = {1000, 2000, 3000};
        System.out.println(sol.average(salary2));
    }
}