public class Print2N {

    public static void func(int N){
        if(N == 0){
            return;
        }
        func(N-1);
        System.out.println(N);
    }
    public static void funcRev(int N){
        if(N == 0){
            return;
        }
        System.out.println(N);
        funcRev(N-1);
    }


    public static void funcBoth(int N){
        if(N == 0){
            return;
        }
        System.out.println(N);
        funcBoth(N-1);
        System.out.println(N);

    }



    public static void funcBothRev(int N, int i){
//        int i = 0;
        if(i==N+1){
            return;
        }
        System.out.println(i);
        funcBothRev(N,i+1);
        System.out.println(i);

    }

    public static void main(String[] args) {
        funcBothRev(5,0);
    }



}
