

    public class myname{
    public static int findsum(int A[], int N){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < A.length; i++){
            if(max < A[i]){
                max = A[i];
            }
            if(min > A[i]){
                min = A[i];
            }
        }
        return max + min;
    }
    public static void main(String[] args) {
        int A[] = {1, 3, 4, 1};
        int N = 4;

        System.out.println(findsum(A, N));
    }
    }
