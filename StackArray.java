
import java.util.ArrayList;

public class StackArray {

    private ArrayList<Object> stack=new ArrayList<>;

    public void push(Object item){

        stack.add(index:0,item)

    }
    public Object pop(){
        return stack.remove(index:0);
    }
    public void peek(){
        if(this.isEmpty()){
            System.out.println("stack is empty");
            return;
        }
        System.out.println("top element is" + stack.get(0));

    }
     public boolean isEmpty(){
        return stack.size()==0;
     }
    public Object pop(){
        return this.isEmpty()? null:stack.remove();
    }



}
