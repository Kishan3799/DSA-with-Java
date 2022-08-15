import java.util.LinkedList;

class LinkedL {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(3, 7);
        System.out.println(list.size());

        // System.out.print("Head->");
        // for(int i=0; i<list.size(); i++){
        //     System.out.print(list.get(i) + "->");
        // }
        // System.out.print("Null");
        
        // list.removeFirst();
        System.out.println(list);


    }
}