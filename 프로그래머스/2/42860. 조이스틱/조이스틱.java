public class Solution {
    public int solution(String name) {
        int cnt = 0;
        for (char c : name.toCharArray()) {
            int a = Math.abs(c - 'A');
            int b = 26 - a;
            cnt += Math.min(a, b);
        }

    
        int len = name.length();
        int move = len - 1;
        for (int i = 0; i < len; i++) {
            int index = i + 1;
            while (index < len && name.charAt(index) == 'A') {
                index++;
            }
            int rightThenLeft = i + (len - index) + Math.min(i, len - index);
            int leftThenRight = (len - index) + i + Math.min(i, len - index);
            move = Math.min(move, Math.min(rightThenLeft, leftThenRight));
        }

        return cnt + move;
    }
}