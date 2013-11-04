package com.example.herodefender.sprite;

import android.graphics.Canvas;

import com.example.herodefender.GameConsts;
import com.example.herodefender.config.ImageConfig;

public class VampireSprite extends MonsterSprite
{
	public VampireSprite(ImageConfig imageConfig)
	{
		super(imageConfig);
	}
	public void update()
	{
		super.updateMonster();
		if(state == MOVE || state == MID_UP_DOOR || state == MID_DOWN_DOOR )
		{
			this.nextScriptInt(GameConsts.VAMPIRE_MOVE_SCRIPT.length);
		}
		else if(state == MOVE_UP || state == DOWN_MID_DOOR || state == FLY_UP_DOOR)
		{
			this.nextScriptInt(GameConsts.VAMPIRE_UP_SCRIPT.length);
		}
		else if(state == MOVE_DOWN || state == UP_MID_DOOR || state == FLY_DOWN_DOOR )
		{
			this.nextScriptInt(GameConsts.VAMPIRE_DOWN_SCRIPT.length);
		}
		else if(state==DEAD)
		{
			if(this.nextScriptInt(GameConsts.VAMPIRE_DEAD_SCRIPT.length))
			{
				alpha = 255;
				this.setState(DEAD_END);
			}
		}
		else if(state==DEAD_END)
		{
			alpha = alpha - 10;
			if (alpha < 0)
			{
				this.setState(DISABLE);
			}
		}
		else if(state==HURT_STONE)
		{
			if(this.nextScriptInt(GameConsts.VAMPIRE_STONE_SCRIPT.length))
			{
				this.setState(ATTACK);
			}
		}
		else if(state==STAY)
		{
			if(this.nextScriptInt(GameConsts.VAMPIRE_STAY_SCRIPT.length))
			{
				this.setState(ATTACK);
			}
		}
		else if(state==WOUNDED)
		{
			if(this.nextScriptInt(GameConsts.VAMPIRE_WOUNDED_SCRIPT.length))
			{
				this.setState(preState);
			}
		}
		else if(state==ATTACK)
		{
			if(this.nextScriptInt(GameConsts.VAMPIRE_ATTACK_SCRIPT.length))
			{
				this.setState(STAY);
			}
		}
		
	}
	public void drawView(Canvas canvas)
	{
		if(state == MOVE || state == MID_UP_DOOR || state == MID_DOWN_DOOR )
		{
			this.drawImage(canvas, GameConsts.VAMPIRE_MOVE_SCRIPT[scriptInt], x, y);
		}
		else if(state == MOVE_UP || state == DOWN_MID_DOOR || state == FLY_UP_DOOR )
		{
			this.drawImage(canvas, GameConsts.VAMPIRE_UP_SCRIPT[scriptInt], x, y);
		}
		else if(state == MOVE_DOWN || state == UP_MID_DOOR || state == FLY_DOWN_DOOR )
		{
			this.drawImage(canvas, GameConsts.VAMPIRE_DOWN_SCRIPT[scriptInt], x, y);
		}
		else if(state == DEAD)
		{
			this.drawImage(canvas, GameConsts.VAMPIRE_DEAD_SCRIPT[scriptInt], x, y);
		}
		else if(state == DEAD_END)
		{
			this.drawImage(canvas, ImageConfig.VAMPIRE_DEAD02, x, y, alpha);
		}
		else if(state == HURT_STONE)
		{
			this.drawImage(canvas, GameConsts.VAMPIRE_STONE_SCRIPT[scriptInt], 
					x+GameConsts.HURT_STONE_POSITION, y);
		}
		else if(state == STAY)
		{
			this.drawImage(canvas, GameConsts.VAMPIRE_STAY_SCRIPT[scriptInt], x, y);
		}
		else if(state == WOUNDED)
		{
			this.drawImage(canvas, GameConsts.VAMPIRE_WOUNDED_SCRIPT[scriptInt], x, y);
		}
		else if(state == ATTACK)
		{
			this.drawImage(canvas, GameConsts.VAMPIRE_ATTACK_SCRIPT[scriptInt][0], x, y);
		}
		super.drawMonster(canvas);
	}
	public boolean isAttackHit()
	{
		return this.isAttackHit(GameConsts.VAMPIRE_ATTACK_SCRIPT);
	}
	
}
