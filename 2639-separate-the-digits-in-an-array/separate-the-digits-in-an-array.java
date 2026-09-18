class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> l = new ArrayList<>();

        for (int i : nums) {
            List<Integer> temp = new ArrayList<>();

            while (i > 0) {
                temp.add(i % 10);
                i = i / 10;
            }

            for (int j = temp.size() - 1; j >= 0; j--) {
                l.add(temp.get(j));
            }
        }

        return l.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}