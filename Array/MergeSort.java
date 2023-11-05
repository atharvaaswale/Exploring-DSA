class MergeSort {
    //merging procedure
    public static int[] merge(int[] A, int[] B, int[] C, int m, int n) {
        int i=0;int j=0;int k=0;
        while (i<m && j<n) {
            if (A[i] < B[j]) {
                C[k] = A[i];
                i++;
            } else {
                C[k] = B[j];
                i++;
            }
            k++;
        }
        while (i<m) {
            C[k] = A[i];
            i++;k++;
        }
        while (j<n) {
            C[k] = B[j];
            j++;k++;
        }
        return C;
    }
    public static void main(String[] args) {
        int[] A = {1, 3, 5, 7, 9};
        int[] B = {2, 4, 6, 8, 10};
        int C[] = new int[A.length + B.length];
        int m = A.length;
        int n = B.length;
        int cm[] = merge(A, B, C, m, n);
        for (int i: cm) {
            System.out.print(i + " ");
        }
        
    }
}