package com.example.herodefender.sprite;

import android.graphics.Canvas;

import com.example.herodefender.GameConsts;
import com.example.herodefender.config.ImageConfig;

public class WallSprite extends Sprite
{
	public static final int WALL_LONG=1;
	public static final int WALL=2;
	public WallSprite(ImageConfig imageConfig)
	{
		super(imageConfig);
	}
	@Override
	public void update()
	{
		if(state==WALL_LONG)
		{
			this.nextScriptInt(GameConsts.WALL_LONG_SCRIPT.length);
		}
		else if(state==WALL)
		{
			this.nextScriptInt(GameConsts.WALL_SCRIPT.length);
		}
	}
	@Override
	public void drawView(Canvas canvas)
	{
		if(state==WALL_LONG)
		{
			this.drawImage(canvas, GameConsts.WALL_LONG_SCRIPT[scriptInt], x, y);
		}
		else if(state==WALL)
		{
			this.drawImage(canvas, GameConsts.WALL_SCRIPT[scriptInt], x, y);
		}
	}
	
}
