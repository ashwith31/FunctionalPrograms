package com.FunctionalPrograms;

public class Triplet {

	public static void main(String[] args) {

		int[] arr = {1,2,3,-3,9,-5,6,-9,3,-5,-6,-1,-2};
        int sum, count = 0;
        
        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                for (int k=j+1; k<arr.length; k++) {
                    sum = arr[i]+arr[j]+arr[k];
                    if (sum == 0) {
                        count++;
                        System.out.println(arr[i]+" + "+arr[j]+" + "+arr[k]+"= " + 0 );
                    }
                }
            }
        }
        System.out.println("Triplets Count: " + count);
	}

}
