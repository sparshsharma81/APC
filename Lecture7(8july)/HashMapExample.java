public class HashMapExample{
    public static void main(String args[]){
        Map<Integer,String>map = new HashMap<>();
        map.put(1,"Wasif");
        map.put(2,"Vansh");
        map.put(3,"Rohit");
        System.out.println(map);
        //there is put all method also ....
        Map<Integer,String>map1 = new HashMap<>();
        map.put(4,"Shubham");
        map.put(5,"Ayush");
        map.putAll(map1);
        System.out.println(map1);
        //like here...if there is duplicate values..then it will overwride...
        System.out.println(map.values()); ///you can use it 
    }
}