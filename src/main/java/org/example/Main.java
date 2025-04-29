package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        }
        public static void bubbleSort(int[] nums) {
        bubbleSort(nums, true);
        }

    public static void bubbleSort(int[] nums, boolean ascending) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length -1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    boolean condition = ascending
                     ? nums[j] > nums[j + 1]
                     : nums[j] < nums[j + 1];
                     if (condition) {
                         int temp = nums[j];
                         nums[j] = nums[j + 1];
                         nums[j + 1] = temp;
                     }
                }
            }
        }
    }

        public static void selectionUniform(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int minIdx = nums[i];
            for (int j = i;j < nums.length; j++) {
                if (nums[j] < nums[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIdx];
            nums[minIdx] = temp;
        }
        }

        /*
         3    15214
         1   35214
         13   5214
         123  514

         */
        public static void insertionSort(int[] nums) {
            for (int i = 1; i < nums.length;i++) {
               int key = nums[i];
               int j = i - 1;
               while (j >= 0 && nums[j] > key) {
                   nums [j + 1] = nums[j];
                   j--;
               }
               nums[j +1] = key;
            }
        }
}