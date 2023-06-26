package com.aniketjain.patternprogramsinjava;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.github.chrisbanes.photoview.PhotoView;

import io.github.rosemoe.sora.langs.java.JavaLanguage;
import io.github.rosemoe.sora.widget.CodeEditor;
import io.github.rosemoe.sora.widget.EditorColorScheme;
import io.github.rosemoe.sora.widget.schemes.SchemeVS2019;

public class FullViewActivity extends AppCompatActivity {

    TextView ques_textView, n_textView;
    CardView ques_cardView;
    PhotoView ques_imageView, ques_imageView_ans;
    CodeEditor codeEditor;
    EditorColorScheme colorScheme = new SchemeVS2019();
    RelativeLayout show_answer_btn;
    Animation fade_in, fade_out, fade_out_fast;

    private boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.full_view_activity);

        findViews();
        //codeEditor Settings
        codeEditor_Settings();
        getValue_From_Intent();
        fade_animation();
        onClick_Listeners();
    }

    public void findViews() {
        ques_textView = findViewById(R.id.ques_no_textView);
        n_textView = findViewById(R.id.n_textView);
        ques_cardView = findViewById(R.id.ques_cardView_imageView);
        ques_imageView = findViewById(R.id.ques_imageView);
        ques_imageView_ans = findViewById(R.id.ques_imageView_ans);
        codeEditor = findViewById(R.id.code);
        show_answer_btn = findViewById(R.id.show_answer_btn);
    }

    public void codeEditor_Settings() {
        codeEditor.setEditorLanguage(new JavaLanguage());
        codeEditor.setEditable(false);
        codeEditor.setColorScheme(colorScheme);
    }

    public void getValue_From_Intent() {
        ques_textView.setText(getIntent().getStringExtra("ques"));
        n_textView.setText(getIntent().getStringExtra("n"));
        ques_imageView.setImageResource(getIntent().getIntExtra("image", 0));
        ques_imageView_ans.setImageResource(getIntent().getIntExtra("image_ans", 0));
        codeEditor.setText(getIntent().getStringExtra("code"));
    }

    private void fade_animation() {
        fade_in = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        fade_out = AnimationUtils.loadAnimation(this, R.anim.fade_out);
        fade_out_fast = AnimationUtils.loadAnimation(this, R.anim.fade_out_fast);
    }

    private void onClick_Listeners() {
        show_answer_btn.setOnClickListener(v -> {
            //FALSE for intent of answer imageView2 picture shared effect
            flag = false;
            //setFillAfter for fadeIn & fadeOut
            fade_in.setFillAfter(true);
            fade_out.setFillAfter(true);
            fade_out_fast.setFillAfter(true);

            //GONE Show Answer Button & VISIBLE CodeEditor
            codeEditor.setVisibility(View.VISIBLE);
            codeEditor.startAnimation(fade_in);
//            show_answer_btn.startAnimation(fade_out);
            show_answer_btn.setVisibility(View.GONE);
            /*
            because of codeEditor click, when we click on the same position where the button is
            so it will perform same fade_in() & fade_out() animation.
            */
            show_answer_btn.setEnabled(false);

            //ANSWER VISIBLE
            ques_imageView_ans.setVisibility(View.VISIBLE);
            ques_imageView_ans.startAnimation(fade_in);
        });
    }

    @Override
    public void onBackPressed() {
        //if codeEditor is Enable, then flag = false;
        if (!flag) {
            codeEditor.startAnimation(fade_out_fast);
        }
        super.onBackPressed();
    }
}