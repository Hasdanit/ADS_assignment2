import java.util.*;
public class Assign2_5 {
    public static void main(String[] args) {
        ArrayDeque<Integer> students = new ArrayDeque<>();
        Stack<Integer> samsas = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        String[] numbers1 = line1.split("\\s+");
        String[] numbers2 = line2.split("\\s+");
        for (int i = 0; i < numbers1.length; i++) {
            students.add(Integer.parseInt(numbers1[i]));
        }
        for (int i = numbers2.length-1; i >= 0; i--) {
            samsas.add(Integer.parseInt(numbers2[i]));
        }
        while(!samsas.isEmpty()){
            if(samsas.peek() == students.peek()){
                samsas.pop();
                students.poll();
            }
            else{
                students.add(students.poll());
            }
        }
        System.out.println(students.size());
    }
}
