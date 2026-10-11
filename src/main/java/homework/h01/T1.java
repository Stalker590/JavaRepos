package homework.h01;

// https://leetcode.com/problems/smallest-even-multiple/description/
class T1 {
    public int smallestEvenMultiple(int n) {
        for (int i = 1; true; i += 1){
            if (i % 2 == 0 && i % n == 0){
                return i;
            }
        }
    }

    public void main() {
        int testNumber1 = 5;

        System.out.println(smallestEvenMultiple(testNumber1));
    }
}