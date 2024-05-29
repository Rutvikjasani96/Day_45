public class Question_1 {
//    Given N Distinct sorted elements, Check if there Exists a Pair(i,j), arr[i] + arr[j] = k, i!=j
    public static void main(String[] args) {
        int[] array = {3, 7, 8, 12, 19};
        int k = 15;
        System.out.println("ans : "+checkPair(array,k));
    }
    static boolean checkPair(int[] array,int k){
        int i=0,j= array.length-1;
        while(i<j){
            if(array[i]+array[j]==k){
                return true;
            }else if(array[i]+array[j]>k){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
}
