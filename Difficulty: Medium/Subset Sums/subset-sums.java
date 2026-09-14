class Solution {
    public void f(int i, int[] arr, int sum, ArrayList<Integer> temp, ArrayList<Integer> res){
        if(i == arr.length){
            res.add(sum);
            return;
        }
        temp.add(arr[i]);
        f(i+1, arr, sum+arr[i], temp, res);
        temp.removeLast();
        f(i+1, arr, sum, temp, res);
    }
    public ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        f(0, arr, 0, new ArrayList<>(), res);
        return res;
    }
}