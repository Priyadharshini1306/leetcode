class Solution {
    public int finalValueAfterOperations(String[] o) {
        int num = 0;
        for(int i = 0;i<o.length;i++) {
            if(o[i].equals("--X") || o[i].equals("X--")) {
                num--;
            } else {
                num++;
            }
        }
        return num;
    }
}