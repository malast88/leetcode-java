package malast88.leetcode.problems.mergesortedarray;

public class MergeSortedArray {

    /**
     * Solution for https://leetcode.com/problems/merge-sorted-array/
     * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
     * Note:
     * The number of elements initialized in nums1 and nums2 are m and n respectively.
     * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int n1Idx = m - 1;
        int n2Idx = n - 1;
        int n1IdxMerge = n + m - 1;
        while (n2Idx >= 0) {
            if (n1Idx < 0 || nums2[n2Idx] > nums1[n1Idx]) {
                nums1[n1IdxMerge] = nums2[n2Idx];
                n2Idx--;
            } else {
                nums1[n1IdxMerge] = nums1[n1Idx];
                n1Idx--;
            }
            n1IdxMerge--;
        }
    }
}
