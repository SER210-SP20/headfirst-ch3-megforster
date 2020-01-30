package edu.quinnipiac.ser210.mymessanger;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

import android.os.Bundle;

public class activity_create_message extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    public void onSendMessage(View view){
        EditText messageView = (EditText) findViewById(R.id.message);
        String messageText = messageView.getText().toString();
       Intent intent = new Intent(Intent.ACTION_SEND);
       intent.setType("test/plain");
       intent.putExtra(Intent.EXTRA_TEXT, messageText);
       String chooserTitle = getString(R.string.chooser);
       Intent chosenIntent = Intent.createChooser(intent, chooserTitle);
        startActivity(chosenIntent);
    }
}
