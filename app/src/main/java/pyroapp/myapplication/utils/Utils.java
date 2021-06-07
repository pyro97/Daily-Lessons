package pyroapp.myapplication.utils;

import android.graphics.Color;

public class Utils {

    public static int getColor(int position){
        switch (position){
            case 0:
                return Color.parseColor("#DC143C");
            case 2:
                return Color.parseColor("#FF8C00");
            case 3:
                return Color.parseColor("#FFD700");
            case 4:
                return Color.parseColor("#FFA500");
            default:
                return Color.parseColor("#6495ED");
        }
    }
}
