package kr.hs.emirim.wodms5772.simpledialog;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button but=(Button)findViewById(R.id.but_dialog);
        but.setOnClickListener(this);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setTitle("First Dialog");
        dialog.setMessage("This is message part <3 ");
        dialog.setIcon(R.drawable.first_icon);
        dialog.setPositiveButton("OK",null);
        dialog.show();
    }
}
