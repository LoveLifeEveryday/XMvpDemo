package com.xcynice.testmvpframe.app;


import com.xcynice.testmvpframe.contants.Contants;
import com.xmvp.xcynice.app.XMvp;

/**
 * @Author xucanyou666
 * @Date 2020/4/28 14:47
 * email：913710642@qq.com
 */
public class BaseApplication extends XMvp {
    @Override
    public String initBaseUrl() {
        return Contants.BASE_URL;
    }
}
