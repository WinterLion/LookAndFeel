package qcox.tacoma.uw.edu.lookandfeel;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AnimationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animations_activty);
    }

    public void animateSpin(View view) {
        View v = findViewById(R.id.animate_me);
        AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(this,
                R.animator.rotate_and_spin);
        set.setTarget(v);
        set.start();
    }

    public void animateMove(View view) {
        View v = findViewById(R.id.animate_me);
        AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(this,
                R.animator.move);
        set.setTarget(v);
        set.start();
    }

    public void animateFade(View view) {
        View v = findViewById(R.id.animate_me);
        AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(this,
                R.animator.fade);
        set.setTarget(v);
        set.start();
    }

    public void animateCustom(View view) {
        View v = findViewById(R.id.animate_me);
        AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(this,
                R.animator.custom);
        set.setTarget(v);
        set.start();
    }


}
