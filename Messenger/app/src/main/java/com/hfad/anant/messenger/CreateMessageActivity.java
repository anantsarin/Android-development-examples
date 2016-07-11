package com.hfad.anant.messenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    //Call onSendMessage() when the button is clicked
    public void onSendMessage(View view) {
        EditText message = (EditText) findViewById(R.id.message);
        String msg = message.getText().toString() ;
        //Intent intent = new Intent(this, ReceiveMessageActivity.class);
        //
        //intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, msg);
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, msg);
        String choosertitle = getString(R.string.chooser);
        Intent cooserIntent =  Intent.createChooser(intent,choosertitle);
        startActivity(cooserIntent);
        //startActivity(intent);

    }
}
