package com.buyandsell.prafull.buyandsell;

/**
 * Created by prafull on 4/3/18.
 */

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * ItemFactory creates purchase items.
 */
public class ItemFactory {
    public static View createItem(Context context, Item item)
    {
        LinearLayout layout, headingLayout;

        layout = new LinearLayout(context);
        layout.setOrientation(LinearLayout.VERTICAL);

        headingLayout = new LinearLayout(context);
        headingLayout.setOrientation(LinearLayout.HORIZONTAL);

        ImageView icon = new ImageView(context);
        TextView title = new TextView(context);

        title.setText(item.name);
        headingLayout.addView(icon);
        headingLayout.addView(title);

        TextView description = new TextView(context);
        description.setText(item.description);
        layout.addView(description);

        LinearLayout layoutMoreInfo = new LinearLayout(context);
        layoutMoreInfo.setOrientation(LinearLayout.HORIZONTAL);

        TextView location = new TextView (context);
        location.setText(item.location);
        location.setGravity(Gravity.LEFT);

        TextView price = new TextView(context);
        price.setText(Double.toString(item.price));
        price.setGravity(Gravity.RIGHT);
        layoutMoreInfo.addView(location);
        layoutMoreInfo.addView(price);
        layout.addView(layoutMoreInfo);

        return layout;
    }
}
