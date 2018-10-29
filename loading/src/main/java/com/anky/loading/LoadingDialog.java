package com.anky.loading;

import android.app.Dialog;
import android.content.Context;
import android.widget.TextView;

/**
 * @author: Anky
 * @time: 2018
 * @desc:
 */

public class LoadingDialog extends Dialog{
    private LoadingView mLoadingView;
    private TextView mTvMessage;

    public LoadingDialog(Context context) {
        super(context, R.style.loadingDialog_Loading);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        setContentView(R.layout.loading_wait_dialog);

        mLoadingView = (LoadingView) findViewById(R.id.loading_view);
        mTvMessage = (TextView) findViewById(R.id.loading_tv_message);
    }

    /**
     * Set several colors of the circle.
     */
    public void setCircleColors(int r1, int r2, int r3) {
        mLoadingView.setCircleColors(r1, r2, r3);
    }

    /**
     * Set message.
     */
    public void setMessage(int resId) {
        mTvMessage.setText(resId);
    }

    /**
     * Set message.
     */
    public void setMessage(String message) {
        mTvMessage.setText(message);
    }
}
