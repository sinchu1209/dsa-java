import java.util.HashMap;

public class HashMapCountNo {

    public static void main(String[] args) {
      int[] arr = {2, 3, 2, 5, 3, 3};
      HashMap<Integer, Integer> map = new HashMap<>();
      for(int i=0;i<arr.length;i++){
      map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
      }
for(Integer key: map.keySet()){ 
    System.out.println(key + " occurs " + map.get(key) + " times");
    }
}
}
