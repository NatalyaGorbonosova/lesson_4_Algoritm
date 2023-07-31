import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        tree.add(5);
        tree.add(9);
        tree.add(8);
        tree.add(7);
        tree.add(6);

        //System.out.println(tree.contain(10));

        tree.print();


//    Pair<String, Integer> pair1 = new Pair<>("B", 5);
//    Pair<String, Integer> pair2 = new Pair<>("H", 2);
//    Pair<String, Integer> pair3 = new Pair<>("K", 9);
//    Pair<String, Integer> pair4 = new Pair<>("A", 7);
//
////    System.out.println(pair1.key.hashCode() %4);
////    System.out.println(pair2.key.hashCode() %4);
////        System.out.println(pair3.key.hashCode() %4);
////        System.out.println(pair4.key.hashCode() %4);
//        Pair<String, Integer>[] pairs = new Pair[4];
//
//        int hash1 = pair1.key.hashCode()%pairs.length;
//        int hash2 = pair2.key.hashCode()%pairs.length;
//        int hash3 = pair3.key.hashCode()%pairs.length;
//        int hash4 = pair4.key.hashCode()%pairs.length;
//
//        pairs[hash1]=pair1;
//        pairs[hash2]=pair2;
//        pairs[hash3]=pair3;
//        pairs[hash4]=pair4;
//
//        for (int i=0; i < pairs.length; i++){
//            System.out.print("["+pairs[i].key+":" + pairs[i].value+"]");
//        }
    }
}
class Pair<K, V>{
    K key;
    V value;
    Pair(K key, V value){
        this.key = key;
        this.value = value;
    }
}