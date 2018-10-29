
package com.anky.swiperefresh;

/**
 * Created by ms on 2016/7/26.
 */
public interface SwipeMenuCreator {

    /**
     * Create menu for recyclerVie item.
     *
     * @param swipeLeftMenu  The menu on the left.
     * @param swipeRightMenu The menu on the right.
     * @param viewType       The view type of the new view.
     */
    void onCreateMenu(SwipeMenu swipeLeftMenu, SwipeMenu swipeRightMenu, int viewType);

}
