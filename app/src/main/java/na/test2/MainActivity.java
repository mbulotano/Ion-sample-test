package na.test2;

import android.media.Image;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.koushikdutta.ion.Ion;
import com.koushikdutta.ion.builder.AnimateGifMode;
import com.squareup.picasso.Picasso;

import java.io.File;


public class MainActivity extends ActionBarActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView)findViewById(R.id.image);
        Uri test = Uri.parse("drawable://" + R.drawable.test3);
        test.getPath();

        Ion
                .with(imageView)
                .animateGif(AnimateGifMode.ANIMATE)
                .load("resource://" + getPackageName() + "drawable/test3.gif");
                //.load("android.resource://" + getPackageName() + "drawable/test3.gif"); doesn't work
                // .load("file:///storage/sdcard0/Pictures/test3.gif"); works

        //Picasso.with(getBaseContext()).load("http://i.imgur.com/M5FOv58.jpg?1").into(imageView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
