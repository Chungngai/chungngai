public class Fab {
    public  static int fab ( int n){
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            return fab(n - 1) + fab(n - 2);
        }
    }
}
