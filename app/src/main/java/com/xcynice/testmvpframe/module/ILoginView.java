package com.xcynice.testmvpframe.module;

import com.xmvp.xcynice.base.XBaseView;

/**
 * Description : ILoginView
 *
 * @author XuCanyou666
 * @date 2020/2/8
 */

public interface ILoginView extends XBaseView {

    /**
     * 显示登陆成功
     *
     * @param successMessage 成功信息
     */
    void showLoginSuccess(String successMessage);

    /**
     * 显示登陆失败
     *
     * @param errorMessage 失败信息
     */
    void showLoginFailed(String errorMessage);


}
