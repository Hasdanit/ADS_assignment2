import java.util.*;
public class Assign2_2 {
    public static void main(String[] args) {
        ArrayList<Integer> seq = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int elem = sc.nextInt();
            seq.add(elem);
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            String toq = sc.next();
            if(toq.contentEquals("Insert")){
                int x = sc.nextInt();
                int y = sc.nextInt();
                if(seq.size()-1 < x){
                    seq.add(y);
                }
                else{
                    seq.set(x, y);
                }
            }
            else if (toq.contentEquals("Delete")){
                int x = sc.nextInt();
                seq.remove(x);
            }
        }
        System.out.println(seq);

    }
}
