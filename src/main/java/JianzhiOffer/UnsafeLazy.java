package JianzhiOffer;

/**
 * created by xdCao on 2018/3/6
 */

public class UnsafeLazy {

    private static UnsafeLazy instance;

    private UnsafeLazy() {
    }

    public static UnsafeLazy getInstance(){
        if (instance==null){
            instance=new UnsafeLazy();
        }
        return instance;
    }

}
