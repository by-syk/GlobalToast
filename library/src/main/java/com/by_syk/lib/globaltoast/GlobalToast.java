/*
 * Copyright 2016-2017 By_syk
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.by_syk.lib.globaltoast;

import android.content.Context;
import android.widget.Toast;

/**
 * A package of {@link android.widget.Toast} and keep just one Toast instance.
 *
 * Created by By_syk on 2016-03-11.
 */

public class GlobalToast {
    private static Toast toast;

    private static int defGravity;
    private static int offsetX;
    private static int offsetY;

    public static void show(Context context, String msg, boolean isLong, int gravity) {
        if (context == null || msg == null) {
            return;
        }

        if (toast == null) { // Create Toast firstly.
            toast = Toast.makeText(context.getApplicationContext(), msg,
                    isLong ? Toast.LENGTH_LONG : Toast.LENGTH_SHORT);
            defGravity = toast.getGravity();
            offsetX = toast.getXOffset();
            offsetY = toast.getYOffset();
        } else {
            toast.setDuration(isLong ? Toast.LENGTH_LONG : Toast.LENGTH_SHORT);
            toast.setText(msg);
        }

        if (gravity == -1) {
            toast.setGravity(defGravity, offsetX, offsetY);
        } else {
            toast.setGravity(gravity, 0, 0);
        }

        toast.show();
    }

    public static void show(Context context, String msg, int gravity) {
        show(context, msg, false, gravity);
    }

    public static void showLong(Context context, String msg, int gravity) {
        show(context, msg, true, gravity);
    }

    public static void show(Context context, String msg) {
        show(context, msg, -1);
    }

    public static void showLong(Context context, String msg) {
        showLong(context, msg, -1);
    }

    public static void show(Context context, int strId, int gravity) {
        show(context, context.getString(strId), gravity);
    }

    public static void showLong(Context context, int strId, int gravity) {
        show(context, context.getString(strId), true, gravity);
    }

    public static void show(Context context, int strId) {
        show(context, context.getString(strId));
    }

    public static void showLong(Context context, int strId) {
        showLong(context, context.getString(strId), -1);
    }

    public static void copyAndShow(Context context, String msg) {
        ExtraUtil.copy2Clipboard(context, msg);
        show(context, context.getString(R.string.globaltoast_toast_copied, msg));
    }

    public static void copyAndShowLong(Context context, String msg) {
        ExtraUtil.copy2Clipboard(context, msg);
        showLong(context, context.getString(R.string.globaltoast_toast_copied, msg));
    }
}