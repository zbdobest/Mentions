package com.bobomee.android.mentions.text.listener;

import android.view.View;
import com.bobomee.android.mentions.listener.ListenerImpl;
import com.bobomee.android.mentions.model.Range;
import java.util.List;

/**
 *
 * Resume:
 *
 * @author 汪波
 * @version 1.0
 * @since 2017/4/3 汪波 first commit
 */
public class SpanClick extends ListenerImpl<SpanClickListener> {

  public void click(View widget,Range mRange) {
    if (hasListener()) {
      List<SpanClickListener> from = from();
      for (SpanClickListener spanClickListener : from) {
        if (null != spanClickListener) {
          spanClickListener.click(widget,mRange);
        }
      }
    }
  }
}
