import java.util.*;

public class Assign2_1 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> Rows = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int d = sc.nextInt();
            ArrayList<Integer> row = new ArrayList<>();
            for(int j = 0; j < d; j++){
                int number = sc.nextInt();
                row.add(number);
            }
            Rows.add(row);
        }
        ArrayList<ArrayList<Integer>> queries = new ArrayList<>();
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            ArrayList<Integer> query = new ArrayList<>();
            int x = sc.nextInt();
            query.add(x);
            int y = sc.nextInt();
            query.add(y);
            queries.add(query);
        }
        for (int i = 0; i < q; i++) {
            if(queries.get(i).get(0) <= Rows.size() && queries.get(i).get(1) <= Rows.get(queries.get(i).get(0)-1).size()) {
                System.out.println(Rows.get(queries.get(i).get(0) - 1).get(queries.get(i).get(1) - 1));
            }
            else{
                System.out.println("Error");
            }
        }
    }
}
