/*
 * AUTHOR：ms
 *
 * DESCRIPTION：create the File, and add the content.
 *
 * Copyright © www.mamaqunaer.com. All Rights Reserved
 *
 */
package com.anky.swiperefresh.widget;

import android.support.annotation.ColorInt;

/**
 * Created by ms on 2018/7/6.
 *
 * @deprecated use {@link DefaultItemDecoration} instead.
 */
@Deprecated
public class GridItemDecoration extends DefaultItemDecoration {

    public GridItemDecoration(@ColorInt int color) {
        super(color);
    }

    public GridItemDecoration(@ColorInt int color, int dividerWidth, int dividerHeight, int... excludeViewType) {
        super(color, dividerWidth, dividerHeight, excludeViewType);
    }
}
