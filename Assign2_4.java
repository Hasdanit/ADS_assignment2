import java.util.*;
public class Assign2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> rStack = new Stack<>();
        while (sc.hasNextInt()){
            int input = sc.nextInt();
            stack.push(input);
        }
        reverseStack(stack, rStack);
        System.out.println(rStack);
    }
    public static void reverseStack(Stack<Integer> stack, Stack<Integer> rStack){
        if(stack.isEmpty()){

        }
        else{
            rStack.push(stack.pop());
            reverseStack(stack, rStack);
        }

    }
}
