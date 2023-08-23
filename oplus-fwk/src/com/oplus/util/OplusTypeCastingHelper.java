package com.oplus.util;

import android.content.res.Configuration;
import android.content.res.OplusBaseConfiguration;

public class OplusTypeCastingHelper {
    public OplusTypeCastingHelper() {}
    public static Object typeCasting(Class<OplusBaseConfiguration> configuration, Configuration context) {
        return context;
    }
}