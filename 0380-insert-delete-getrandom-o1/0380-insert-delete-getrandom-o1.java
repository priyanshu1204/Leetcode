import java.util.*;

class RandomizedSet {
    ArrayList<Integer> arr;
    HashMap<Integer, Integer> mp;
    Random random;

    public RandomizedSet() {
        arr = new ArrayList<>();
        mp = new HashMap<>();
        random = new Random();
    }
    
    public boolean insert(int val) {
        if (mp.containsKey(val)) return false;
        mp.put(val, arr.size()); 
        arr.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if (!mp.containsKey(val)) return false;

        int index = mp.get(val);  
        int lastElement = arr.get(arr.size() - 1);
        arr.set(index, lastElement);
        mp.put(lastElement, index); 
        arr.remove(arr.size() - 1);
        mp.remove(val); 

        return true;
    }
    
    public int getRandom() {
        return arr.get(random.nextInt(arr.size()));
    }
}