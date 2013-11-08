package com.example.herodefender.sprite;

import android.graphics.Canvas;

import com.example.herodefender.GameConsts;
import com.example.herodefender.config.ImageConfig;

public class BurstSprite extends Sprite
{
	public static final int BURST = 1;

	public BurstSprite(ImageConfig imageConfig)
	{
		super(imageConfig);
	}

	@Override
	public void update()
	{
		if (state == BURST)
		{
			if (this.nextScriptInt(GameConsts.BURST_SCRIPT.length))
			{
				this.setState(DISABLE);
			}
		}
	}

	@Override
	public void drawView(Canvas canvas)
	{
		if (state == BURST)
		{
			this.drawImage(canvas, GameConsts.BURST_SCRIPT[scriptInt], x, y);
		}
	}

}
