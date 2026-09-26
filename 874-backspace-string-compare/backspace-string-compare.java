class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        StringBuilder sb = new StringBuilder();

        // Process s
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '#') {
                if(!s1.isEmpty()) {
                    s1.pop();
                }
            } else {
                s1.push(s.charAt(i));
            }
        }

        while(!s1.isEmpty()) {
            sb.append(s1.pop());
        }

        s = sb.reverse().toString();

        sb.setLength(0);

        // Process t
        for(int i = 0; i < t.length(); i++) {
            if(t.charAt(i) == '#') {
                if(!s1.isEmpty()) {
                    s1.pop();
                }
            } else {
                s1.push(t.charAt(i));
            }
        }

        while(!s1.isEmpty()) {
            sb.append(s1.pop());
        }

        t = sb.reverse().toString();

        return s.equals(t);
    }
}