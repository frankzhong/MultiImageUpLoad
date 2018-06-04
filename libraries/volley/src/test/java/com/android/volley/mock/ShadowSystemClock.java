package com.android.volley.mock;

import android.os.SystemClock;

@Implements(value = SystemClock.class, callThroughByDefault = true)
public class ShadowSystemClock {
    public static long elapsedRealtime() {
        return 0;
    }
}
