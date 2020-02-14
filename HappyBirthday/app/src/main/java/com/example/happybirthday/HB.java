package com.example.happybirthday;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Handler;

import pl.droidsonroids.gif.GifImageView;

public class HB extends Activity {

    private final int duracion = 6000;
    GifImageView g;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hb);
        g = (GifImageView) findViewById(R.id.gif);
        mp = MediaPlayer.create(this, R.raw.guardians);
        mp.start();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                g.setImageResource(R.drawable.deadpool);
                if(mp.isPlaying()){
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            g.setImageResource(R.drawable.rocket);
                            if(mp.isPlaying()){
                                new Handler().postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        g.setImageResource(R.drawable.spiderman);
                                        if(mp.isPlaying()){
                                            new Handler().postDelayed(new Runnable() {
                                                @Override
                                                public void run() {
                                                    g.setImageResource(R.drawable.widow);
                                                    if(mp.isPlaying()){
                                                        new Handler().postDelayed(new Runnable() {
                                                            @Override
                                                            public void run() {
                                                                g.setImageResource(R.drawable.antman);
                                                                if(mp.isPlaying()){
                                                                    new Handler().postDelayed(new Runnable() {
                                                                        @Override
                                                                        public void run() {
                                                                            g.setImageResource(R.drawable.thor);
                                                                            if(mp.isPlaying()){
                                                                                new Handler().postDelayed(new Runnable() {
                                                                                    @Override
                                                                                    public void run() {
                                                                                        g.setImageResource(R.drawable.ironmanhb);
                                                                                        if(mp.isPlaying()){
                                                                                            new Handler().postDelayed(new Runnable() {
                                                                                                @Override
                                                                                                public void run() {
                                                                                                    g.setImageResource(R.drawable.ironmanhb2);
                                                                                                    if(mp.isPlaying()){
                                                                                                        new Handler().postDelayed(new Runnable() {
                                                                                                            @Override
                                                                                                            public void run() {
                                                                                                                g.setImageResource(R.drawable.hulk);
                                                                                                                if(mp.isPlaying()){
                                                                                                                    new Handler().postDelayed(new Runnable() {
                                                                                                                        @Override
                                                                                                                        public void run() {
                                                                                                                            g.setImageResource(R.drawable.cheers);
                                                                                                                            if(mp.isPlaying()){
                                                                                                                                new Handler().postDelayed(new Runnable() {
                                                                                                                                    @Override
                                                                                                                                    public void run() {
                                                                                                                                        g.setImageResource(R.drawable.ironmanhb3);
                                                                                                                                        if(mp.isPlaying()){
                                                                                                                                            new Handler().postDelayed(new Runnable() {
                                                                                                                                                @Override
                                                                                                                                                public void run() {
                                                                                                                                                    g.setImageResource(R.drawable.all);
                                                                                                                                                    if(mp.isPlaying()){
                                                                                                                                                        new Handler().postDelayed(new Runnable() {
                                                                                                                                                            @Override
                                                                                                                                                            public void run() {
                                                                                                                                                                g.setImageResource(R.drawable.groot);
                                                                                                                                                                if(mp.isPlaying()){
                                                                                                                                                                    new Handler().postDelayed(new Runnable() {
                                                                                                                                                                        @Override
                                                                                                                                                                        public void run() {
                                                                                                                                                                            g.setImageResource(R.drawable.enjoy);
                                                                                                                                                                            if(mp.isPlaying()){
                                                                                                                                                                                new Handler().postDelayed(new Runnable() {
                                                                                                                                                                                    @Override
                                                                                                                                                                                    public void run() {
                                                                                                                                                                                        g.setImageResource(R.drawable.fine);
                                                                                                                                                                                        if(mp.isPlaying()){
                                                                                                                                                                                            new Handler().postDelayed(new Runnable() {
                                                                                                                                                                                                @Override
                                                                                                                                                                                                public void run() {
                                                                                                                                                                                                    g.setImageResource(R.drawable.ca);
                                                                                                                                                                                                    if(mp.isPlaying()){
                                                                                                                                                                                                        new Handler().postDelayed(new Runnable() {
                                                                                                                                                                                                            @Override
                                                                                                                                                                                                            public void run() {
                                                                                                                                                                                                                g.setImageResource(R.drawable.happybirthday);
                                                                                                                                                                                                                if(mp.isPlaying()){
                                                                                                                                                                                                                    new Handler().postDelayed(new Runnable() {
                                                                                                                                                                                                                        @Override
                                                                                                                                                                                                                        public void run() {
                                                                                                                                                                                                                            mp.stop();
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }, 30000);
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }, duracion);
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }, duracion);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }, duracion);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }, duracion);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }, duracion);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }, duracion);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }, duracion);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }, duracion);
                                                                                                                }
                                                                                                            }
                                                                                                        }, duracion);
                                                                                                    }
                                                                                                }
                                                                                            }, duracion);
                                                                                        }
                                                                                    }
                                                                                }, duracion);
                                                                            }
                                                                        }
                                                                    }, duracion);
                                                                }
                                                            }
                                                        }, duracion);
                                                    }
                                                }
                                            }, duracion);
                                        }
                                    }
                                }, duracion);
                            }
                        }
                    }, duracion);
                }
            }
        }, 7000);

    }
}
