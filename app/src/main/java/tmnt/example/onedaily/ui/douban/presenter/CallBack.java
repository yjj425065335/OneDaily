package tmnt.example.onedaily.ui.douban.presenter;

/**
 * Created by tmnt on 2017/4/12.
 */

public interface CallBack<T> {

    T onSuccess();

    void onError(Exception e);


}
