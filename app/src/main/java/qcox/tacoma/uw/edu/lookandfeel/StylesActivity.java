package qcox.tacoma.uw.edu.lookandfeel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class StylesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_styles);
    }

    protected void startAnimation(View view) {
        Intent intent = new Intent(this, AnimationsActivity.class);
        startActivity(intent);
    }

    protected void clearFields(View view) {
        EditText theEmail = (EditText) findViewById(R.id.emailTextView);
        EditText thePassword = (EditText) findViewById(R.id.passwordTextView);
        theEmail.setText("");
        thePassword.setText("");
    }
}
