public class Exercise2 {
    public static void quickSort(int []a){
        quickSortInternal(a,0,a.length-1);
    }

    private static void quickSortInternal(int[] a, int left, int right) {
        if(left>=right){
            return;
        }
        int pivo=partition(a,left,right);
        quickSortInternal(a,left,pivo-1);
        quickSortInternal(a,pivo+1,right);
    }

    private static int partition(int[] a, int left, int right) {
        int i=left;
        int j=right;
        int pivot=a[left];
        while(i<j){
            while(i<j&&a[j]>=pivot){
                j--;
            }
            while(i<j&&a[i]<=pivot){
                i++;
            }
            swap(a,i,j);
        }
        swap(a,i,left);
        return i;
    }

    private static void swap(int[] a, int i, int j) {
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }

    public static void main(String[] args) {
        int[]a={1,2,3,4,6,8};
        int []b=a.clone();
        quickSort(b);
        System.out.println(b[b.length-1]);
        for(int i=0;i<a.length;i++){
            if(a[i]==b[b.length-1]){
                System.out.println(i);
            }
        }
    }
}
