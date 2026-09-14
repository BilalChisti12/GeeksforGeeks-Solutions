class Solution {
    public boolean checkSubsequenceSum(int[] arr, int k) {
        // code here
        return checkSubsequenceSum(0, arr, 0, k);
    }
    public boolean checkSubsequenceSum(int i,int[] arr, int sum,int k){
        if(sum > k) return false;
        if(i== arr.length){
            if(sum == k){
                return true;
            }
            return false;
        }
            if (checkSubsequenceSum(i+1, arr, sum+arr[i], k)) return true;
            return checkSubsequenceSum(i+1, arr, sum, k);
    }
}