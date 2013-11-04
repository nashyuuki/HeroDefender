package com.example.herodefender.sprite;

import android.graphics.Canvas;

import com.example.herodefender.GameConsts;
import com.example.herodefender.config.ImageConfig;

public class UiSprite extends Sprite
{
	public static final int BAR_START=1;
	public static final int BAR_STAY=2;
	public static final int BAR_HP=3;
	public static final int MENU_PAUSE=4;
	private int hp=0;
	private int maxHp=100;
	private boolean pause;
	private long lastTime;
	private int time;
	private int maxTime;
	
	public UiSprite(ImageConfig imageConfig)
	{
		super(imageConfig);
	}
	public void update()
	{
		if(state==BAR_START)
		{
			if(this.nextScriptInt(GameConsts.BAR_START_SCRIPT.length))
			{
				this.setState(BAR_HP);
			}
		}
		else if(state==BAR_HP)
		{
			hp=hp+(maxHp/10);
			if(hp>maxHp)
			{
				hp=maxHp;
				this.setState(BAR_STAY);
			}
		}
		else if(state==BAR_STAY)
		{
			if(time<maxTime)
			{
				long nowTime=System.currentTimeMillis();
				if(lastTime==0)
				{
					lastTime=System.currentTimeMillis();
				}
				else if((nowTime-lastTime)>1000)
				{
					time++;
					lastTime=System.currentTimeMillis();
				}
			}
		}
		else if(state==MENU_PAUSE)
		{
			this.nextScriptInt(GameConsts.MENU_PAUSE_SCRIPT.length);
		}
	}
	public void drawView(Canvas canvas)
	{
		if(state==BAR_START)
		{
			this.drawImage(canvas, GameConsts.BAR_START_SCRIPT[scriptInt], x, y);
			
		}
		else if(state==BAR_HP)
		{
			this.drawBar(canvas);
		}
		else if(state==BAR_STAY)
		{
			this.drawBar(canvas);
		}
		else if(state==MENU_PAUSE)
		{
			this.drawImage(canvas, GameConsts.MENU_PAUSE_SCRIPT[scriptInt], x, y);
		}
	}
	private void drawBar(Canvas canvas)
	{
		int i=GameConsts.BAR_START_SCRIPT.length-1;
		this.drawImage(canvas, GameConsts.BAR_START_SCRIPT[i], x, y);
		this.drawRect(canvas, 
				x+GameConsts.BAR_TIME_POSITION[0], 
				y+GameConsts.BAR_TIME_POSITION[1], 
				GameConsts.BAR_TIME_POSITION[2]*(maxTime-time)/maxTime, 
				GameConsts.BAR_TIME_POSITION[3], 255, 0, 0, 255);
		this.drawStrokeRect(canvas, 
				x+GameConsts.BAR_TIME_POSITION[0], 
				y+GameConsts.BAR_TIME_POSITION[1], 
				GameConsts.BAR_TIME_POSITION[2], 
				GameConsts.BAR_TIME_POSITION[3], 255, 0, 0, 0,
				GameConsts.BAR_TIME_POSITION[4]);
		this.drawRect(canvas, 
				x+GameConsts.BAR_HP_POSITION[0], 
				y+GameConsts.BAR_HP_POSITION[1], 
				GameConsts.BAR_HP_POSITION[2]*hp/maxHp, 
				GameConsts.BAR_HP_POSITION[3], 255, 255, 0, 0);
		this.drawStrokeRect(canvas, 
				x+GameConsts.BAR_HP_POSITION[0], 
				y+GameConsts.BAR_HP_POSITION[1], 
				GameConsts.BAR_HP_POSITION[2], 
				GameConsts.BAR_HP_POSITION[3], 255, 0, 0, 0,
				GameConsts.BAR_HP_POSITION[4]);
		if(pause)
		{
			this.drawImage(canvas, ImageConfig.BUTTON_CONTINUE, 
					x+GameConsts.BUTTON_POSITION[0], y+GameConsts.BUTTON_POSITION[1]);
		}
		else
		{
			this.drawImage(canvas, ImageConfig.BUTTON_PAUSE, 
					x+GameConsts.BUTTON_POSITION[0], y+GameConsts.BUTTON_POSITION[1]);
			
		}
	}
	public int getHp()
	{
		return hp;
	}
	public void setHp(int hp)
	{
		this.hp = hp;
	}
	public int getMaxHp()
	{
		return maxHp;
	}
	public void setMaxHp(int maxHp)
	{
		this.maxHp = maxHp;
	}
	public boolean isPause()
	{
		return pause;
	}
	public void setPause(boolean pause)
	{
		this.pause = pause;
	}
	public int getTime()
	{
		return time;
	}
	public void setTime(int time)
	{
		this.time = time;
	}

	public int getMaxTime()
	{
		return maxTime;
	}

	public void setMaxTime(int maxTime)
	{
		this.maxTime = maxTime;
	}
	public void setMaxTime(int[][] barrier)
	{
		int i=barrier.length-1;
		this.maxTime = barrier[i][0]+1;
	}
	
}
