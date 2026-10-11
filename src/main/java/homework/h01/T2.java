package homework.h01;

// https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/description/

class T2 {
    public int countOdds(int low, int high) {
        int countOfOdd = 0;

        for (int i = low; i <= high; i++) {
            if (i % 2 != 0) {
                countOfOdd += 1;
            }
        }

        return countOfOdd;
    }

    public void main() {
        int lowTest = 5;
        int highTest = 10;

        System.out.println(countOdds(lowTest,highTest));
    }
}