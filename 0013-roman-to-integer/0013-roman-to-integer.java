class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;
        int prevValue = 0;

        for (char c : s.toCharArray()) {
            int currentValue = map.get(c);
            if (currentValue > prevValue) {
                sum += currentValue - 2 * prevValue;
            } else {
                sum += currentValue;
            }
            prevValue = currentValue;
        }

        return sum;
    }
}