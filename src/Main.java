import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("ArrayList done");
        doArrayList();
        System.out.println("LinkedList done");
        doLinkedList();
        System.out.println("HashList done");
        doHashSet();

    }

    private static void printList(List<Integer> listOfElements) {
        for (Integer el : listOfElements) {
            System.out.println(el);
        }
    }

    private static void doArrayList() {

        List<Integer> listOfElements = new ArrayList<>();
        Random rn = new Random();
        for (int i = 0; i < 5; i++) {
            listOfElements.add(rn.nextInt(100));
        }
        printList(listOfElements);
        System.out.println("________________________");
        listOfElements.remove(2);
        printList(listOfElements);
    }

    private static void doLinkedList() {
        List<Integer> listOfElements = new LinkedList<>();
        Random rn = new Random();
        for (int i = 0; i < 5; i++) {
            listOfElements.add(rn.nextInt(100));
        }
        printList(listOfElements);
        System.out.println("________________________");
        listOfElements.remove(2);
        printList(listOfElements);

    }

    private static void doHashSet() {
        Set<Integer> setOfElements = new HashSet<>();
        Random rn = new Random();
        for (int i = 0; i < 5; i++) {
            setOfElements.add(rn.nextInt(100));
        }
        for (Integer el : setOfElements) {
            System.out.println(el);
        }
        System.out.println("________________________");
//        setOfElements.remove
//        for (Integer el : setOfElements) {
//            System.out.println(el);
//        }

    }
}

