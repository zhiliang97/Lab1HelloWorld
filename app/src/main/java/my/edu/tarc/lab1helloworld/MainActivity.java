package my.edu.tarc.lab1helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Global or module level variables
    private EditText editTextName, editTextAge;
    private TextView textViewMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView shoes UI
        //R = resource class
        setContentView(R.layout.activity_main);

        //Linking UI to program
        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextAge = (EditText) findViewById(R.id.editTextAge);
        textViewMessage = (TextView) findViewById(R.id.textView);
    }
    //A button is an instance of the View class
    //method that handle View must have a View parameter
    public void displayMessage (View view){
        String name;
        int age;
        name = editTextName.getText().toString();
        age = Integer.parseInt(editTextAge.getText().toString());
        age++;
        textViewMessage.setText("Hi " + name + ", you will be " + age + " year old in 2018.");
    }
}
