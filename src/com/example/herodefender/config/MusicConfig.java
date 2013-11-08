package com.example.herodefender.config;

import android.content.Context;

public class MusicConfig
{
	private Context context;
	public static final int BURST = 1;

	public MusicConfig(Context context)
	{
		this.context = context;
	}

	public void play(int music)
	{
		switch (music)
		{
			case BURST:
				// MediaPlayer mediaPlayer=MediaPlayer.create(context,
				// R.raw.burst);
				// mediaPlayer.start();
				break;
		}
	}

}
