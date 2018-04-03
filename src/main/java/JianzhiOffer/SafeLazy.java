package JianzhiOffer;

/**
 * created by xdCao on 2018/3/6
 */

public class SafeLazy {

    private volatile static SafeLazy instance;

    private SafeLazy() {
    }

    public static SafeLazy getInstance() {
        if (instance==null){
            synchronized (SafeLazy.class){
                if (instance==null){
                    instance=new SafeLazy();
                }
            }
        }
        return instance;
    }
}
