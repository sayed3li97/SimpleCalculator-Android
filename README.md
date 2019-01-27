# SimpleCalculator

This project is part of Introduction to Android workshop. The excrice is a Simple Calculator app 
that "Plus", "Minus" and "Multiplication" two numbers. This excrsis aims to intrdouce Java data types, 
casting and operations within the Android enviroment.

# Steps to re-create 
1. Create a new project in Android Studio (Choose the Empty Activity)
2. Navigate to app/res/layout/activity_main.xml
3. Open the Text view and the replace the xml code with the below code 
```
<?xml version="1.0" encoding="utf-8"?>
<!-- The Constraint Layout was changed to Linuer Layout + Orientation was added in the attributes -->
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/textView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Input 1"
        android:textColor="@android:color/black"
        android:textSize="18sp" />

    <EditText
        android:id="@+id/inputText1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:ems="10"
        android:inputType="number" />

    <TextView
        android:id="@+id/textView2"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Input 2"
        android:textColor="@android:color/black"
        android:textSize="18sp" />

    <EditText
        android:id="@+id/inputText2"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:ems="10"
        android:inputType="number" />

    <TextView
        android:id="@+id/results"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        android:textAlignment="center"
        android:textColor="@android:color/black"
        android:textSize="24sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="horizontal">

        <Button
            android:id="@+id/buttonplus"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:onClick="plus"
            android:text="+"
            android:textSize="30sp" />

        <Button
            android:id="@+id/button-"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:onClick="minus"
            android:text="-"
            android:textSize="30sp" />

        <Button
            android:id="@+id/buttonx"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:onClick="multi"
            android:text="x"
            android:textSize="30sp" />
    </LinearLayout>

</LinearLayout>
```
4. Open the java file for the main activity by opening the MainActivity.java from the following path app/java/"The first folder"/MainActivity.java 
5. Replace the code in that file with the below code ("Dont remove the first line starting with package")
```

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declare these Variable in this location to be accessed by all the functions in this class
    private EditText Input1;
    private EditText Input2;
    private TextView Results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Input1 = (EditText) findViewById(R.id.inputText1);
        Input2 = (EditText) findViewById(R.id.inputText2);
        Results = (TextView) findViewById(R.id.results);

    }

    public void plus(View view){
        int input1 = Integer.parseInt(Input1.getText().toString());
        int input2 = Integer.parseInt(Input2.getText().toString());
        String res = String.valueOf(input1 + input2);
        Results.setText(res);
    }

    public void minus(View view){
        int input1 = Integer.parseInt(Input1.getText().toString());
        int input2 = Integer.parseInt(Input2.getText().toString());
        String res = String.valueOf(input1 - input2);
        Results.setText(res);
    }

    public void multi(View view){
        int input1 = Integer.parseInt(Input1.getText().toString());
        int input2 = Integer.parseInt(Input2.getText().toString());
        String res = String.valueOf(input1 * input2);
        Results.setText(res);
    }
}

```

Thank you!

