package sg.edu.rp.c346.id22011587.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cbEnabled;
    Button btnCheck;
    TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbEnabled = findViewById(R.id.checkBoxDiscount);
        btnCheck = findViewById(R.id.buttonCheck);
        tvShow = findViewById(R.id.textView);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MyActivity", "Inside onClick()");

                //Check the state of the CheckBox
                boolean isChecked = cbEnabled.isChecked();

                //Set the text message based on the CheckBox state
                TextView textView = findViewById(R.id.textView);

                String message;
                if (isChecked) {
                    message = "The discount is given.";
                } else {
                    message = "The discount is not given.";
                }
                //Display the text message in a Toast
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();

            }
        });

    }
}
