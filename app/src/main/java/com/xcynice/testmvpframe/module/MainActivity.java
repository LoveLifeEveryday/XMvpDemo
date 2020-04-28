package com.xcynice.testmvpframe.module;

import android.widget.Button;
import android.widget.EditText;

import com.xcynice.testmvpframe.R;
import com.xmvp.xcynice.base.XBaseActivity;
import com.xmvp.xcynice.util.ToastUtil;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Description : MainActivity
 *
 * @author XuCanyou666
 * @date 2020/4/28
 */


public class MainActivity extends XBaseActivity<LoginPresenter> implements ILoginView {

    @BindView(R.id.et_name)
    EditText mEtName;
    @BindView(R.id.et_password)
    EditText mEtPassword;
    @BindView(R.id.btn_login)
    Button mBtnLogin;

    @Override
    protected LoginPresenter createPresenter() {
        return new LoginPresenter(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    /**
     * 初始化布局信息，比如： mHomeRecyclerView.setLayoutManager(new LinearLayoutManager(this));
     */
    @Override
    protected void initView() {
    }

    /**
     * 初始化数据信息，比如：presenter.getArticleList();
     */
    @Override
    protected void initData() {

    }

    @Override
    public void showLoginSuccess(String successMessage) {
        ToastUtil.showToast(successMessage);
    }

    @Override
    public void showLoginFailed(String errorMessage) {
        ToastUtil.showToast(errorMessage);
    }

    @OnClick(R.id.btn_login)
    public void onViewClicked() {
        presenter.login(mEtName.getText().toString(), mEtPassword.getText().toString());
    }
}
