package com.example.nitinnegi.ndksample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mEditTextNew;
    private Button mBtnNew;

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        mEditText = findViewById(R.id.sample_edit_text);

        mEditTextNew = findViewById(R.id.sample_edit_text_new);
        mBtnNew = findViewById(R.id.newButton);

        mBtnNew.setOnClickListener(this);

    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native boolean isPrime(int number);

    public void isPrime(View view) {

        String number = mEditText.getText().toString();
        if (number != null && !number.isEmpty()) {
            int i = Integer.valueOf(number);
            if (isPrime(i)) {
                Toast.makeText(this, "Prime Number", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "Not a prime Number", Toast.LENGTH_LONG).show();
            }
        } else {
            Toast.makeText(this, "Enter the number", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.newButton:
                Toast.makeText(this, "New Button Clicked", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
