package com.eightstudio.danboru.siasat.splash;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

import com.eightstudio.danboru.siasat.MainActivity;
import com.eightstudio.danboru.siasat.R;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash_screen);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                try{

                    Log.i("SplashScreen", "Berhasil Set Timer Sleep");
                    Thread.sleep(3000); //ini bagian set duration lamanya splashScreen

                }catch(Exception e){

                    /**
                     *
                     * ini bagian penanganan saat terjadi kesalahan
                     * sering terjadi kesalahan dalam set Time
                     * Duration dalam satuan milisecon
                     *
                     * **/

                    Log.i("SplashScreen", "Terjasi kesalahan saat Set Duration Sleep");
                    e.printStackTrace();

                }

                Intent i = new Intent(getBaseContext(), MainActivity.class);
                startActivity(i);
                finish();

            }
        });

        Log.d("SplashScreen", "Mulai menjalankan Thread");
        thread.start();

    }
}
