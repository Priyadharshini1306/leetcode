class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            String s = String.valueOf(num);

            for (char c : s.toCharArray()) {
                list.add(c - '0');
            }
        }

        return list.stream()
                   .mapToInt(Integer::intValue)
                   .toArray();
    }
}