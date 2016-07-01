package com.mariostudio.texteditorpanel.activitys;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Rasterizer;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.DynamicDrawableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.RasterizerSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;

import com.mariostudio.texteditorpanel.R;

/**
 * Created by MarioStudio on 2016/6/5.
 */

public class ShowActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        TextView textView = (TextView) findViewById(R.id.text01);

//        SpannableString spannableString = new SpannableString("万丈高楼平地起");
//
//        RelativeSizeSpan sizeSpan01 = new RelativeSizeSpan(1.2f);
//        RelativeSizeSpan sizeSpan02 = new RelativeSizeSpan(1.4f);
//        RelativeSizeSpan sizeSpan03 = new RelativeSizeSpan(1.6f);
//        RelativeSizeSpan sizeSpan04 = new RelativeSizeSpan(1.8f);
//        RelativeSizeSpan sizeSpan05 = new RelativeSizeSpan(1.6f);
//        RelativeSizeSpan sizeSpan06 = new RelativeSizeSpan(1.4f);
//        RelativeSizeSpan sizeSpan07 = new RelativeSizeSpan(1.2f);
//
//        spannableString.setSpan(sizeSpan01, 0, 1, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
//        spannableString.setSpan(sizeSpan02, 1, 2, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
//        spannableString.setSpan(sizeSpan03, 2, 3, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
//        spannableString.setSpan(sizeSpan04, 3, 4, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
//        spannableString.setSpan(sizeSpan05, 4, 5, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
//        spannableString.setSpan(sizeSpan06, 5, 6, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
//        spannableString.setSpan(sizeSpan07, 6, 7, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);



//        SpannableString spannableString = new SpannableString("设置文字的前景色为淡蓝色");
//        ForegroundColorSpan colorSpan = new ForegroundColorSpan(Color.parseColor("#0099EE"));
//        spannableString.setSpan(colorSpan, 9, spannableString.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);



//        SpannableString spannableString = new SpannableString("设置文字的背景色为淡绿色");
//        BackgroundColorSpan colorSpan = new BackgroundColorSpan(Color.parseColor("#AC00FF30"));
//        spannableString.setSpan(colorSpan, 9, spannableString.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);



//        SpannableString spannableString = new SpannableString("为文字设置下划线");
//        UnderlineSpan underlineSpan = new UnderlineSpan();
//        spannableString.setSpan(underlineSpan, 5, spannableString.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);



//        SpannableString spannableString = new SpannableString("为文字设置删除线");
//        StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
//        spannableString.setSpan(strikethroughSpan, 5, spannableString.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);



//        SpannableString spannableString = new SpannableString("为文字设置上标");
//        SuperscriptSpan superscriptSpan = new SuperscriptSpan();
//        spannableString.setSpan(superscriptSpan, 5, spannableString.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);



//        SpannableString spannableString = new SpannableString("为文字设置下标");
//        SubscriptSpan subscriptSpan = new SubscriptSpan();
//        spannableString.setSpan(subscriptSpan, 5, spannableString.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);



//        SpannableString spannableString = new SpannableString("为文字设置超链接");
//        URLSpan urlSpan = new URLSpan("http://www.jianshu.com/users/dbae9ac95c78");
//        spannableString.setSpan(urlSpan, 5, spannableString.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
//        textView.setMovementMethod(LinkMovementMethod.getInstance());
//        textView.setHighlightColor(Color.parseColor("#36969696"));



//        SpannableString spannableString = new SpannableString("为文字设置点击事件");
//        MyClickableSpan clickableSpan = new MyClickableSpan("http://www.jianshu.com/users/dbae9ac95c78");
//        spannableString.setSpan(clickableSpan, 5, spannableString.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
//        textView.setMovementMethod(LinkMovementMethod.getInstance());
//        textView.setHighlightColor(Color.parseColor("#36969696"));



//        SpannableString spannableString = new SpannableString("为文字设置粗体、斜体风格");
//        StyleSpan styleSpan_B  = new StyleSpan(Typeface.BOLD);
//        StyleSpan styleSpan_I  = new StyleSpan(Typeface.ITALIC);
//        spannableString.setSpan(styleSpan_B, 5, 7, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
//        spannableString.setSpan(styleSpan_I, 8, 10, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
//        textView.setMovementMethod(LinkMovementMethod.getInstance());
//        textView.setHighlightColor(Color.parseColor("#36969696"));



//        SpannableString spannableString = new SpannableString("在文本中添加表情（表情）");
//        Drawable drawable = getResources().getDrawable(R.mipmap.a9c);
//        drawable.setBounds(0, 0, 42, 42);
//        ImageSpan imageSpan = new ImageSpan(drawable);
//        spannableString.setSpan(imageSpan, 6, 8, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
//        textView.setMovementMethod(LinkMovementMethod.getInstance());
//        textView.setHighlightColor(Color.parseColor("#36969696"));



//        SpannableString spannableString = new SpannableString("为文字设置图片（图片）");
//        Drawable drawable = getResources().getDrawable(R.mipmap.ic_launcher);
//        drawable.setBounds(0, 0, 36, 36);
//        ImageSpan imageSpan = new ImageSpan(drawable);
//        spannableString.setSpan(imageSpan, 5, 7, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
//        textView.setMovementMethod(LinkMovementMethod.getInstance());
//        textView.setHighlightColor(Color.parseColor("#36969696"));

//        textView.setText(spannableString);
    }

    class MyClickableSpan extends ClickableSpan {

        private String content;

        public MyClickableSpan(String content) {
            this.content = content;
        }

        @Override
        public void updateDrawState(TextPaint ds) {
            ds.setUnderlineText(false);
        }

        @Override
        public void onClick(View widget) {
            Intent intent = new Intent(ShowActivity.this, OtherActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("content", content);
            intent.putExtra("bundle", bundle);
            startActivity(intent);
        }
    }
}
