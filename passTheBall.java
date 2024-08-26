public class passTheBall {
    public  static  int passTheBall(int receiver[], int time) {

        int n=receiver.length;
        if(n==time)
        {
            return receiver[n-1];
        }
        if(time<n)
        {
            int t=n-1-time;
            return receiver[t];
        }
        if(time>n)
        {
            int i=time%n-1;
            return receiver[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        int a[]={2,4,1,5,3};
        int t=6;
        System.out.println(passTheBall(a,6));
    }
}
