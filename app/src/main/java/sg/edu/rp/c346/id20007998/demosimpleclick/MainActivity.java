package sg.edu.rp.c346.id20007998.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    //step1:declare the field variables
    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tgBtnDisplay;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Step2: Link the field variables to UI components in layout
        tvDisplay =findViewById(R.id.textViewDisplay);
        btnDisplay =findViewById(R.id.buttonDisplay);
        etInput =findViewById(R.id.editTextInput);
        tgBtnDisplay =findViewById(R.id.toggleButtonEnabled);
        rgGender =findViewById(R.id.radioGroupGender);

        btnDisplay.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Code for the action
                etInput.getText().toString();
                String stringResponse = etInput.getText().toString();
                tvDisplay.setText(stringResponse);

                if (tgBtnDisplay.isChecked()==true){
                    etInput.setEnabled(true);
                }
                else{
                    etInput.setEnabled(false);

                }
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.radioButtonGenderMale){
                    tvDisplay.setText("He says "+stringResponse);
                }
                else{
                    tvDisplay.setText("She says "+stringResponse);
                }
            }
        });
    }
}