package com.anky.loading;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/**
 * @author: Anky
 * @time: 2018
 * @desc:
 */

@SuppressLint("AppCompatCustomView")
public class LoadingView extends ImageView {
    private LoadingDrawable mLoadingDrawable;
    private LoadingLevelRenderer mLoadingRenderer;

    public LoadingView(Context context) {
        super(context);
    }

    public LoadingView(Context context, AttributeSet attrs) {
        super(context, attrs);

        mLoadingRenderer = new LoadingLevelRenderer(context);
        mLoadingDrawable = new LoadingDrawable(mLoadingRenderer);
        setImageDrawable(mLoadingDrawable);
    }

    /**
     * Set several colors of the circle.
     */
    public void setCircleColors(int r1, int r2, int r3) {
        mLoadingRenderer.setCircleColors(r1, r2, r3);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        startAnimation();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopAnimation();
    }

    @Override
    protected void onVisibilityChanged(View changedView, int visibility) {
        super.onVisibilityChanged(changedView, visibility);
        if (visibility == View.VISIBLE) {
            startAnimation();
        } else {
            stopAnimation();
        }
    }

    private void startAnimation() {
        if (mLoadingDrawable != null) {
            mLoadingDrawable.start();
        }
    }

    private void stopAnimation() {
        if (mLoadingDrawable != null) {
            mLoadingDrawable.stop();
        }
    }
}
