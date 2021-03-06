package main.java.practice.dynamicprogramming.knapsack;

public interface IKnapsack {

  int maxProfitRecursive(int[] wt, int[] val, int W, int n);

  int maxProfitDP(int[] wt, int[] val, int W, int n);

  boolean subsetSumDP(int[] arr, int sum, int n);

  boolean equalSumPartition(int[] arr, int n);

  int countOfSubsetsSum(int[] arr, int sum, int n);

  int minimumSubsetSumDifference(int[] arr, int n);

  int countOfSubsetsWithDifference(int[] arr, int diff, int n);

  int targetSumWithNegativeAndPositives(int[] arr, int sum, int n);
}
