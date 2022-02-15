package com.company;

public class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3)
            return false;

        int mid = arr[0];
        int midIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > mid) {
                mid = arr[i];
            } else if (arr[i] < mid) {
                midIndex = i - 1;
                break;
            } else {
                return false;
            }
        }
        if (midIndex == 0) {
            return false;
        } else {
            for (int j = midIndex + 1; j < arr.length; j++) {
                if (arr[j] < mid) {
                    mid = arr[j];
                } else {
                    return false;
                }
            }
        }
        return true;

    }
}
