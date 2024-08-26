public class ArrayToStack {

    public static class Stack{
        private int a[]=new int[5];
        private int i=0;
        boolean isEmpty()
        {
            if(i==0)
            {
                return true;
            }
            else {
                return false;
            }
        }
        boolean isFull()
        {
            if(i==a.length)
            {
                return true;
            }
            return false;
        }
        void push(int x)
        {
            if(isFull())
            {
                return;
            }
            a[i]=x;
            i++;
        }
        int pop()
        {
            if(i==0)
            {
                return -1;
            }
            int top=a[i-1];
            a[i-1]=0;
            i--;
            return top;

        }
        int peek()
        {
            if(isEmpty())
            {
                System.out.println("stack is khaali");
                return -1;
            }
            return a[i-1];
        }
        int size()
        {
            return i;
        }
        void display()
        {
            for(int idx=0;i<=i-1;idx++)
            {
                System.out.print(a[idx]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args)
    {
        Stack st=new Stack();
        st.push(5);
        st.display();
        st.push(10);
        st.display();
        st.push(15);
        st.display();
        System.out.print(st.peek()+"  ");
        System.out.println(st.pop());
        System.out.println(st.peek());
        st.display();


    }
}
