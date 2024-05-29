public class Question_2 {
//    Given N Distinct Sorted Elements, Check if there exists a Pair(i,j),
//    such that arr[j] - arr[i] = k && k>0 && i!=j
    public static void main(String[] args) {
        int[] array = {-3, 0, 1, 3, 6, 8, 11, 14, 18, 25};
        int k = 5;
        System.out.println("ans : "+checkPair(array,k));
    }
    static boolean checkPair(int[] array,int k){
        int p1=0,p2=1;
        while(p2<array.length){
            if(array[p2]-array[p1]==k){
                return true;
            }else if(array[p2]-array[p1]>k){
                p1++;
                if(p1==p2){
                    p2++;
                }
            }else{
                p2++;
            }
        }
        return false;
    }
}
