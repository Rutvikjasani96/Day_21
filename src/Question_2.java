public class Question_2 {
//    given a,n,p, find a power of n % p
    public static void main(String[] args) {
        int a = 2;
        int n = 5;
        int p = 7;
        int power = pow(a,n,p);
        System.out.println("power : "+power);
    }
    static int pow(int a, int n, int p){
        if(n==1){
            return a;
        }
        int half = pow(a,n/2,p) % p;
        if(n%2==0){
            return (half * half) % p;
        }else{
            return (half * half * (a % p)) % p;
        }
    }
}
