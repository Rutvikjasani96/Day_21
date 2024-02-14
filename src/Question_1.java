public class Question_1 {
//    given a & n, return n power of a
    public static void main(String[] args) {
        int a = 2;
        int n = 5;
//        int power = pow(a,n);
        int power = reducedPow(a,n);
        System.out.println("power : "+power);
    }
    static int pow(int a, int n){
        if(n==1){
            return a;
        }
        return pow(a,n-1)*a;
    }
    static int reducedPow(int a, int n){
        if(n==1){
            return a;
        }
        int half = reducedPow(a,n/2);
        if(n%2==0){
            return half * half;
        }else{
            return half * half * a;
        }
    }
}
