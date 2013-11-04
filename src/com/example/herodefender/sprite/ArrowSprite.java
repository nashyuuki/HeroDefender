package com.example.herodefender.sprite;

import android.graphics.Canvas;

import com.example.herodefender.GameConsts;
import com.example.herodefender.config.ImageConfig;

public class ArrowSprite extends Sprite
{
	public static final int MOVE=1;
	public static final int BROKEN=2;
	public static final int HIT=3;
	public static final int TYPE_ARROW=0;
	public static final int TYPE_BULLET=1;
	public static final int TYPE_CROSS=2;
	public static final int TYPE_SYRING=3;
	public static final int TYPE_BAT=4;
	private int speed;
	private int attack;
	private int type;
	public ArrowSprite(ImageConfig imageConfig)
	{
		super(imageConfig);
	}
	public void update()
	{
		if(state==MOVE)
		{
			this.nextScriptInt(GameConsts.ARROW_MOVE_SCRIPT[type].length);
		}
		else if(state==BROKEN)
		{
			if(this.nextScriptInt(GameConsts.ARROW_BROKEN_SCRIPT[type].length))
			{
				this.setState(DISABLE);
			}
		}
		else if(state==HIT)
		{
			if(this.nextScriptInt(GameConsts.ARROW_HIT_SCRIPT[type].length))
			{
				this.setState(DISABLE);
			}
		}
	}
	public void drawView(Canvas canvas)
	{
		if(state==MOVE)
		{
			this.drawImage(canvas, GameConsts.ARROW_MOVE_SCRIPT[type][scriptInt], x, y);
		}
		else if(state==BROKEN)
		{
			this.drawImage(canvas, GameConsts.ARROW_BROKEN_SCRIPT[type][scriptInt], x, y);
		}
		else if(state==HIT)
		{
			this.drawImage(canvas, GameConsts.ARROW_HIT_SCRIPT[type][scriptInt], x, y);
		}
	}
	public int getSpeed()
	{
		return speed;
	}
	public void setSpeed(int speed)
	{
		this.speed = speed;
	}
	public int getAttack()
	{
		return attack;
	}
	public void setAttack(int attack)
	{
		this.attack = attack;
	}
	public int getType()
	{
		return type;
	}
	public void setType(int type)
	{
		this.type = type;
	}
	
}
