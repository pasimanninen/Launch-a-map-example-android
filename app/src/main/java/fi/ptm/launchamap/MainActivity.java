package fi.ptm.launchamap;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

/**
 * Created by PTM on 14/09/15.
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showMap(View view) {
        // get lat and lng values
        EditText editText1 = (EditText) findViewById(R.id.editText);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        String numberOne = editText1.getText().toString();
        String numberTwo = editText2.getText().toString();
        double lat = Double.parseDouble(numberOne);
        double lng = Double.parseDouble(numberTwo);
        // show map
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:" + lat + "," + lng));
        startActivity(intent);
    }


}
