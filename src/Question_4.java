public class Question_4 {
//    Given 3 Sorted arrays a[], b[], c[] of size N. Find i, j, k such that max(a[]i, b[j], c[k])
//    min(a[i], b[j], c[k]) is Minimized.
    public static void main(String[] args) {
        int[] a = {3, 14, 16 ,20, 29, 40};
        int[] b = {-6, 23, 24 ,30, 35, 50};
        int[] c = {-15, 15, 26, 31, 39, 42};
        System.out.println("Minimized : "+findMaxMin(a,b,c));
    }
    static int findMaxMin(int[] a,int[] b,int[] c){
        int p1 = 0,p2 = 0,p3 = 0;
        int difference,min_difference = Integer.MAX_VALUE;
        while(p1<a.length && p2<b.length && p3<c.length){
            difference = Math.max(a[p1],Math.max(b[p2],c[p3])) -Math.min(a[p1],Math.min(b[p2],c[p3]));
            min_difference = Math.min(min_difference,difference);
            if(a[p1]<b[p2] && a[p1]<c[p3]){
                p1++;
            }else if(b[p2]<a[p1] && b[p2]<c[p3]){
                p2++;
            }else{
                p3++;
            }
        }
        return min_difference;
    }
}
