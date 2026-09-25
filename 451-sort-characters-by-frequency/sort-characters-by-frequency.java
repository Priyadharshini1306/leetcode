class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        List<Character>[] buc = new List[s.length()+1];
        for(Character ch:map.keySet()) {
            int num = map.get(ch);
            if(buc[num]==null) {
                buc[num] = new ArrayList<>();
            }
            buc[num].add(ch);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=buc.length-1;i>=0;i--) {
            if(buc[i]!=null) {
                for(Character ch:buc[i]) {
                    for(int j=0;j<i;j++) {
                        sb.append(ch);
                    }
                }
            }
        }
        return sb.toString();
    }
}