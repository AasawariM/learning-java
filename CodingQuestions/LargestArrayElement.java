public class LargestArrayElement {
    public static void main(String[] args) {
     int[] arr={6,13,8,101};
     int max = arr[0];
     
     for(int i:arr){
        if(i>max){
            max =i;
        }
     }
     System.out.println(max);
    }
}
