package test;

public class quickSort {
    public static void solution(int[] arr, int begin, int end) {
        if(begin < end) {
            int flag = arr[begin];
            int i = begin;
            int j = end;
            int tmp = arr[i];
            while(i<j){
                while(i < j && arr[j] >= flag){
                    j--;
                }
                while(i < j && arr[i] <= flag){
                    i++;
                }
                if(i < j){
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
            arr[begin] = arr[i];
            arr[i] = flag;
            solution(arr, begin, i-1);
            solution(arr, i+1, end);
        }
    }

    public static void solution2(int[] arr, int begin, int end) {
        if(begin < end) {
            int flag = arr[begin];
            int i = begin;
            int j = end;
            int tmp = arr[i];
            while(i < j) {
                while(i < j && flag < arr[j]) {
                    j--;
                }
                if(i < j)
                    arr[i++] = arr[j];
                while(i < j && flag > arr[i]) {
                    i++;
                }
                if(i < j)
                    arr[j--] = arr[i];
            }
            arr[j] = flag;
            solution2(arr, begin, i);
            solution2(arr, i+1, end);
        }

    }

    public static void main(String[] args) {
        int[] a = {5,3,6,8,21,1,9};
        solution2(a, 0, a.length-1);
        for(int x:a){
            System.out.printf("%d\t", x);
        }
    }

}
