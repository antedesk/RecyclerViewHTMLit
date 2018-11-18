package it.antedesk.recyclerviewhtmlit.utils;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;

import it.antedesk.recyclerviewhtmlit.R;

public class ColorUtils {
    public static int getViewHolderBackgroundColorFromInstance(Context context, int instanceNum) {
        switch (instanceNum) {
            case 0:
                return ContextCompat.getColor(context, R.color.material100OrangeYellow);
            case 1:
                return ContextCompat.getColor(context, R.color.material150OrangeYellow);
            case 2:
                return ContextCompat.getColor(context, R.color.material200OrangeYellow);
            case 3:
                return ContextCompat.getColor(context, R.color.material250OrangeYellow);
            case 4:
                return ContextCompat.getColor(context, R.color.material300OrangeYellow);
            case 5:
                return ContextCompat.getColor(context, R.color.material350OrangeYellow);
            case 6:
                return ContextCompat.getColor(context, R.color.material400OrangeYellow);
            case 7:
                return ContextCompat.getColor(context, R.color.material450OrangeYellow);
            case 8:
                return ContextCompat.getColor(context, R.color.material500OrangeYellow);
            case 9:
                return ContextCompat.getColor(context, R.color.material550OrangeYellow);
            case 10:
                return ContextCompat.getColor(context, R.color.material600OrangeYellow);
            case 11:
                return ContextCompat.getColor(context, R.color.material650OrangeYellow);
            case 12:
                return ContextCompat.getColor(context, R.color.material700OrangeYellow);
            case 13:
                return ContextCompat.getColor(context, R.color.material750OrangeYellow);
            case 14:
                return ContextCompat.getColor(context, R.color.material850OrangeYellow);

            default:
                return Color.WHITE;
        }
    }

}
