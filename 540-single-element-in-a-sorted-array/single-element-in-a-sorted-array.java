class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid % 2 == 1) {
                mid--;  // Make sure mid is an even index
            }
            if (arr[mid] != arr[mid + 1]) {
                right = mid;
            } else {
                left = mid + 2;
            }
        }
        return arr[left];
    }
}