import java.util.*;
public class Assign2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Deque<Integer> shelf = new LinkedList<>();
        List<Integer> removalResults = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int ops = scanner.nextInt();
            if (ops == 1) {
                int diskn = scanner.nextInt();
                shelf.addFirst(diskn);
            } else if (ops == 2) {
                int diskn = scanner.nextInt();
                shelf.addLast(diskn);
            } else if (ops == 3) {
                removalResults.add(shelf.removeFirst());
            } else if (ops == 4) {
                removalResults.add(shelf.removeLast());
            }
        }
        for (int number : removalResults) {
            System.out.println(number);
        }
    }
}
