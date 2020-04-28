package com.xcynice.testmvpframe.module;


import com.xcynice.testmvpframe.api.LoginApi;
import com.xcynice.testmvpframe.bean.User;
import com.xmvp.xcynice.base.XBaseBean;
import com.xmvp.xcynice.base.XBaseObserver;
import com.xmvp.xcynice.base.XBasePresenter;
import com.xmvp.xcynice.util.XUtil;

/**
 * @Author xucanyou666
 * @Date 2020/4/28 14:55
 * email：913710642@qq.com
 */
public class LoginPresenter extends XBasePresenter<ILoginView> {
    LoginPresenter(ILoginView baseView) {
        super(baseView);
    }


    void login(String userName, String password) {
        XUtil.closeSoftKeyboard();
        addDisposable(retrofitService.createRs(LoginApi.class).login(userName, password),
                new XBaseObserver<XBaseBean<User>>(baseView, true) {
                    @Override
                    public void onSuccess(XBaseBean<User> bean) {
                        baseView.showLoginSuccess("登录成功（￣▽￣）");

                    }

                    @Override
                    public void onError(String msg) {
                        baseView.showLoginFailed(msg + "(°∀°)ﾉ");
                    }
                });
    }
}
