package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Iterator;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzadt extends RelativeLayout {
    private static final float[] zzdef = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    private AnimationDrawable zzdeg;

    public zzadt(Context context, zzadu zzaduVar, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        Preconditions.checkNotNull(zzaduVar);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(zzdef, null, null));
        shapeDrawable.getPaint().setColor(zzaduVar.getBackgroundColor());
        setLayoutParams(layoutParams);
        com.google.android.gms.ads.internal.zzp.zzks();
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(zzaduVar.getText())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(zzaduVar.getText());
            textView.setTextColor(zzaduVar.getTextColor());
            textView.setTextSize(zzaduVar.getTextSize());
            zzwo.zzqm();
            int zze = zzayd.zze(context, 4);
            zzwo.zzqm();
            textView.setPadding(zze, 0, zzayd.zze(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<zzadv> zztd = zzaduVar.zztd();
        if (zztd != null && zztd.size() > 1) {
            this.zzdeg = new AnimationDrawable();
            Iterator<zzadv> it = zztd.iterator();
            while (it.hasNext()) {
                try {
                    this.zzdeg.addFrame((Drawable) ObjectWrapper.unwrap(it.next().zztg()), zzaduVar.zzte());
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.util.zzd.zzc("Error while getting drawable.", e);
                }
            }
            com.google.android.gms.ads.internal.zzp.zzks();
            imageView.setBackground(this.zzdeg);
        } else if (zztd.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) ObjectWrapper.unwrap(zztd.get(0).zztg()));
            } catch (Exception e2) {
                com.google.android.gms.ads.internal.util.zzd.zzc("Error while getting drawable.", e2);
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.zzdeg;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
