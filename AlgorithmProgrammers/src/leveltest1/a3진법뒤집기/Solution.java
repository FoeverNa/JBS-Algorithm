package leveltest1.a3진법뒤집기;

class Solution {
    public int solution(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        while (n >= 3) {
            stringBuilder.append(n % 3);
            n = n / 3;
        }
        if (n > 0) {
            stringBuilder.append(n);
        }
        String str = stringBuilder.toString();

        char[] chars = str.toCharArray();

        int count = 0;
        int sum = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            int temp = chars[i] - '0';
            count *= 3;
            if (i == chars.length-1) {
                sum += temp;
                count++;
                continue;
            }
            sum += (temp * count);

        }
        return sum;
    }
}
