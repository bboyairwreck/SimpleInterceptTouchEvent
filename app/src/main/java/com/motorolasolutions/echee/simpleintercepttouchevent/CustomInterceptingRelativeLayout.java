package com.motorolasolutions.echee.simpleintercepttouchevent;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/**
 * Created by echee on 12/11/15.
 */
public class CustomInterceptingRelativeLayout extends RelativeLayout {
    public static final String TAG = CustomInterceptingRelativeLayout.class.getSimpleName();

    /**
     * Attempting to Intercept but not receiving the event
     * @param ev Motion event that is intercepted
     * @return boolean if intercepted
     */
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        super.onInterceptTouchEvent(ev);
        if (ev.getAction() == MotionEvent.ACTION_CANCEL) {
            Log.i(TAG, "Action cancel intercepted");    // not receiving this one either
            return true;
        }

        return false;
    }

    public CustomInterceptingRelativeLayout(Context context) {
        super(context);
    }
}
