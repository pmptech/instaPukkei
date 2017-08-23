package pmp.com.instapukkei.utils;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;


/**
 * Adapter class for the logo images
 * Created by mgohain on 8/20/2017.
 */
public class LogoImageAdapter extends BaseAdapter{
    private Context context;
    private Integer[] logoIds;
    public LogoImageAdapter(Context context, Integer[] logoIds) {
        this.context = context;
        this.logoIds = logoIds;
    }
    @Override
    public int getCount() {
        return logoIds.length;
    }

    @Override
    public Object getItem(int position) {
        return logoIds[position];
    }

    @Override
    public long getItemId(int position) {
        return logoIds[position];
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView logoImage;
        if (convertView == null) {
            logoImage = new ImageView(context);
            logoImage.setLayoutParams(new GridView.LayoutParams(200,200));
            logoImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            logoImage = (ImageView) convertView;
        }
        logoImage.setImageResource(logoIds[position]);
        return logoImage;
    }
}
