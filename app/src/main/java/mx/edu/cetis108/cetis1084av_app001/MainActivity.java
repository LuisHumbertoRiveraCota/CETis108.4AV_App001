package mx.edu.cetis108.cetis1084av_app001;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
    EditText edText;
    TextView txtview;
    Button btn;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edText=(EditText) findViewById(R.id.etxtIngresar);
        btn=(Button) findViewById(R. id.btnContinuar);
        txtview=(TextView) findViewById(R.id.resultado);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String palabra= edText.getEditableText().toString();
                txtview.setText(palabra);

            }
        });
    }
}
