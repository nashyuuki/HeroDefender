package com.example.herodefender.sprite;

import android.graphics.Canvas;

import com.example.herodefender.config.ImageConfig;

public class BackgroundSprite extends Sprite
{
	public static final int GAME = 1;

	public BackgroundSprite(ImageConfig imageConfig)
	{
		super(imageConfig);
	}

	@Override
	public void drawView(Canvas canvas)
	{
		if (state == GAME)
		{
			this.drawImage(canvas, ImageConfig.BACKGROUND_GAME, x, y);
		}
	}

}
