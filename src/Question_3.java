public class Question_3 {
//    Given N array elements, Where each arr[i] represents Height of each Wall,
//    Pick any 2 Walls such, that MAx Water is accumulated Between Them.
    public static void main(String[] args) {
        int[] array = {3, 7, 4, 5, 2};
        System.out.println("Maximum Water : "+maxWater(array));
    }
    static int maxWater(int[] array){
        int p1=0,p2=array.length-1;
        int water,max_water=0;
        while(p1<p2){
            water = (p2-p1) * Math.min(array[p1],array[p2]);
            max_water = Math.max(max_water,water);
            if(array[p1]<array[p2]){
                p1++;
            }else{
                p2--;
            }
        }
        return max_water;
    }
}
