package com.bobomee.android.mentions.text.span;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bobomee.android.mentions.ConfigFactory;
import com.bobomee.android.mentions.listener.manager.ListenerManager;
import com.bobomee.android.mentions.model.Range;

/**
 *
 * Resume:
 *
 * @author 汪波
 * @version 1.0
 * @since 2017/4/4 汪波 first commit
 */
public class AtSpan extends ClickableSpan {

  private final Range mAtRange;
  private final ListenerManager mListenerManager = ListenerManager.INSTANCE;

  public AtSpan(Range range) {
    this.mAtRange = range;
  }

  @Override public void updateDrawState(TextPaint ds) {
    ds.setColor(ConfigFactory.INSTANCE.config().getMentionTextColor());
    ds.setUnderlineText(false); //去掉下划线
  }

  @Override public void onClick(View widget) {
    mListenerManager.notifySpanClickListener(widget, mAtRange);
  }
}
