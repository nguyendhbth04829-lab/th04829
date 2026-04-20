package vn.fpoly.th04829_20042026.methods;

public class MyUtil {
    public int tinhTongChan(int n){
        if (n<=0){
            throw new IllegalArgumentException("n khong hop le");
        }
        int tong = 0;
        for (int i = 0; i<=n;i++){
            if (i%2==0){
                tong+=i;
            }
        }
        return tong;
    }
}
