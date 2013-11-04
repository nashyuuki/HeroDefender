package com.example.herodefender.sprite;

import android.graphics.Canvas;

import com.example.core.VectorMath;
import com.example.herodefender.GameConsts;
import com.example.herodefender.config.ImageConfig;

public class AirSprite extends Sprite
{
	public static final int MOVE=1;
	public static final int GATHER=2;
	private int speed;
	private VectorMath vector;
	private int endX;
	private int endY;
	private int alpha;
	private int heroInt;
	private int type;
	public AirSprite(ImageConfig imageConfig)
	{
		super(imageConfig);
	}

	public void update()
	{
		if(state==GATHER)
		{
			alpha=alpha-10;
			if(alpha<0)
			{
				this.setState(DISABLE);
			}
		}
	}
	
	public void drawView(Canvas canvas)
	{
		if(state==MOVE)
		{
			this.drawImage(canvas, GameConsts.MONSTER_AIR_SCRIPT[type][0], x, y);
			this.drawImage(canvas, GameConsts.MONSTER_AIR_SCRIPT[type][1], x, y, alpha);
		}
		else if(state==GATHER)
		{
			this.drawImage(canvas, GameConsts.MONSTER_AIR_SCRIPT[type][0], x, y, alpha);
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
	public void setVector(int x1,int y1,int x2,int y2)
	{
		vector=new VectorMath(x1,y1,x2,y2);
	}
	public int getSpeedX(int dir)
	{
		return vector.getX(dir);
	}
	public int getSpeedY(int dir)
	{
		return vector.getY(dir);
	}
	public int getEndX()
	{
		return endX;
	}
	public void setEndX(int endX)
	{
		this.endX = endX;
	}
	public int getEndY()
	{
		return endY;
	}
	public void setEndY(int endY)
	{
		this.endY = endY;
	}
	public int getAlpha()
	{
		return alpha;
	}
	public void setAlpha(int alpha)
	{
		this.alpha = alpha;
	}
	public int getHeroInt()
	{
		return heroInt;
	}
	public void setHeroInt(int heroInt)
	{
		this.heroInt = heroInt;
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
