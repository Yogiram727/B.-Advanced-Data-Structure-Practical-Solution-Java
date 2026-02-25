package B_Stack;

public class Practice2 {
    int n=5;
    int[]stack=new int[n];
    int top=-1;

    public void push(int value){
        if(top==n-1){
            System.out.println("Stack is full");
            return;
        }
        top++;
        stack[top]=value;
    }

    public void pop(){
        if(top==-1){
            System.out.println("Stack is empty");
            return;
        }
        top--;
    }

    public void display(){
        if(top==-1){
            System.out.println("Stack is empty");
            return;
        }
        for(int i=top;i>=0;i--){
            System.out.println(stack[i]);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Practice2 st=new Practice2();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Givne Stack: ");
        st.display();
        System.out.println("Stack afte partial deletion: ");
        st.pop();
        st.pop();
        st.pop();
        st.display();
        System.out.println("Stack after full deletion: ");
        st.pop();
        st.pop();
        st.display();
        System.out.println();
    }
}
