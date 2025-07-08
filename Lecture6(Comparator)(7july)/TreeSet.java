public class TreeSet{
    public static void main(String args[]){
        //write a program to insert objects into TreeSet where sorting order is descending order 
        TreeSet t = new TreeSet(new MyComparator());
        t.add(10);
        t.add(15);
        t.add(0);
        t.add(5);
        compare(5,10); 
    }
    class MyComparator implements Comparator{
        public int compare(Object obj1, Object obj2){
            Integer i1 = (Integer)obj1;
            Integer i2 = (Integer)obj2;
            if(i1<i2){
                return +1;
            }
            else if(i1>i2)return -1;
            else return 0;
            }
            
    }
}