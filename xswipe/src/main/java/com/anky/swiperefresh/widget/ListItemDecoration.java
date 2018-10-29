
package com.anky.swiperefresh.widget;

import android.support.annotation.ColorInt;

/**
 * <p>
 * RecyclerView's Item Split Line.
 * </p>
 * Created by ms on 2016/7/27.
 *
 * @deprecated use {@link DefaultItemDecoration} instead.
 */
@Deprecated
public class ListItemDecoration extends DefaultItemDecoration {

    public ListItemDecoration(@ColorInt int color) {
        super(color);
    }

    public ListItemDecoration(@ColorInt int color, int dividerWidth, int dividerHeight, int... excludeViewType) {
        super(color, dividerWidth, dividerHeight, excludeViewType);
    }
}
