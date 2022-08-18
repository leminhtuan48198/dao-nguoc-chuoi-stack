import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<Integer>();
        int[] array={1,2,3,4,5};
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            array[i]=stack.pop();
        }
        for (int e:array
             ) {
            System.out.println(e);

        }

        Stack<String> wStack=new Stack<>();
        String string ="meo an cho";
        String[] arr= string.split(" ");

        for (int i = 0; i < arr.length; i++) {
            wStack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]=wStack.pop();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i]+" ");
        }
    }
}
