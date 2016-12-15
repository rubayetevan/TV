package com.errorstation.tv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import tcking.github.com.giraffeplayer.GiraffePlayer;

public class MainActivity extends AppCompatActivity {
  String url="http://103.198.135.226/hls/channel_9.m3u8";
  
  GiraffePlayer player;
  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    player = new GiraffePlayer(this);
    player.play(url);

  }

  @Override protected void onResume() {
    super.onResume();

  }

  @Override protected void onStop() {
    player.stop();
    super.onStop();
  }
}
