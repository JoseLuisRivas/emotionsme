package com.example.root.emotiosme;

import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Cargo el TextViev para manipularlo y asignarle la fuente Personalizada
        // por medio del método setTypeFace()
        // Declaro la variable fuente Nunito-Regular
/*
        TextView fontNunito = (TextView) findViewById(R.id.tv_nombre);


        // Ruta de la fuente dentro de la carpeta assets
        //String fontPath_Nunito_Popular = "fonts/Nunito-Regular.ttf";

        String fontPath_Nunito_Popular = "fonts/Nunito/Nunito-Light.ttf";


        // Cargamos la fuente
          Typeface myFontNunito_Popular = Typeface.createFromAsset(getAssets(),fontPath_Nunito_Popular);


        // Aplicamos la fuente al TextView

       fontNunito.setTypeface(myFontNunito_Popular);
*/

/*
        Typeface fontFamily = Typeface.createFromAsset(getAssets(), "fonts/awesome/fontawesome.ttf");
        TextView sampleText = (TextView) findViewById(R.id.TextView04);
        sampleText.setTypeface(fontFamily);
        sampleText.setText("\uF0C0");

        TextView sampleText1 = (TextView) findViewById(R.id.TextView05);
        sampleText1.setTypeface(fontFamily);
        sampleText1.setText("\uf08a");
*/

        /**
         * Para Glyphicons
         */

        Typeface iconsFamily = Typeface.createFromAsset(getAssets(), "fonts/glyphIcons/glyphIcons.ttf");

 /**/
        TextView iconHeart = (TextView) findViewById(R.id.tv_icon_heart);
        iconHeart.setTypeface(iconsFamily);
        iconHeart.setText("\ue601");

        TextView iconComment = (TextView) findViewById(R.id.tv_comment_bubble);
        iconComment.setTypeface(iconsFamily);
        iconComment.setText("\ue610");


        TextView iconFollowers = (TextView) findViewById(R.id.tv_user);
        iconFollowers.setTypeface(iconsFamily);
        iconFollowers.setText("\ue600");

    }



@Override
public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
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
