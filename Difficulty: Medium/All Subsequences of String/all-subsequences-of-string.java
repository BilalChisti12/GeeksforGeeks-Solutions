class Solution {
    public void f(int i, String s, StringBuilder sb, List<String> res){
        if(i==s.length()){
            res.add(new String(sb.toString()));
            return;
        }
        sb.append(s.charAt(i));
        f(i+1, s, sb, res);
        sb.deleteCharAt(sb.length()-1);
        f(i+1, s, sb, res);
    }
    public List<String> powerSet(String s) {
        List<String> res = new ArrayList<>();
        f(0, s, new StringBuilder(), res);
        Collections.sort(res);
        return res;
    }
}