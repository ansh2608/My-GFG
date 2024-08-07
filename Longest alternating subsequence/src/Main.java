import java.util.Stack;

public class Main {
    public static int alternatingMaxLength(int[] arr) {
        Stack<Integer> stack=new Stack<>();
        stack.push(arr[0]);
        int n=arr.length;
        int idx=1;
        while(idx<n&&arr[idx]==arr[0]) idx++;
        boolean small=false;
        if(idx<n&&arr[idx]<stack.peek()) stack.push(arr[idx]);
        else{
            small=true;
            if(idx<n) stack.push(arr[idx]);
        }
        idx++;
        for(int i=idx;i<n;i++){
            if(small){
                if(arr[i]<stack.peek()){
                    stack.push(arr[i]);
                    small=false;
                }else if(arr[i]>stack.peek()){
                    stack.pop();
                    stack.push(arr[i]);
                }
            }else{
                if(arr[i]>stack.peek()){
                    stack.push(arr[i]);
                    small=true;
                }else if(arr[i]<stack.peek()){
                    stack.pop();
                    stack.push(arr[i]);
                }
            }
        }
        return stack.size();
    }
    public static void main(String[] args) {
        int[] arr= {1, 5, 4};
        System.out.println(alternatingMaxLength(arr));
    }
}