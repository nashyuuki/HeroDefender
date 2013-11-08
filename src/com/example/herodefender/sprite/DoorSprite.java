package com.example.herodefender.sprite;

import android.graphics.Canvas;
import com.example.herodefender.GameConsts;
import com.example.herodefender.config.ImageConfig;

public class DoorSprite extends Sprite
{
	public static final int STAY = 0;
	public static final int UP = 1;
	public static final int UP_MID = 2;
	public static final int MID_UP = 3;
	public static final int MID = 4;
	public static final int MID_DOWN = 5;
	public static final int DOWN_MID = 6;
	public static final int DOWN = 7;
	private int moveType;
	private int speed = 2;// 2以上才能碰撞

	public DoorSprite(ImageConfig imageConfig)
	{
		super(imageConfig);
	}

	@Override
	public void update()
	{
		if (state == UP)
		{
			this.setCollisionArea(GameConsts.DOOR_COLLISION[0]);
		}
		else if (state == UP_MID)
		{
			this.setCollisionArea(GameConsts.UP_MID_DOOR_COLLISION);
			if (this.nextScriptInt(speed))
			{
				this.setState(MID);
			}
		}
		else if (state == MID_UP)
		{
			this.setCollisionArea(GameConsts.UP_MID_DOOR_COLLISION);
			if (this.nextScriptInt(speed))
			{
				this.setState(UP);
			}
		}
		else if (state == MID)
		{
			this.setCollisionArea(GameConsts.DOOR_COLLISION[1]);
		}
		else if (state == MID_DOWN)
		{
			this.setCollisionArea(GameConsts.DOWN_MID_DOOR_COLLISION);
			if (this.nextScriptInt(speed))
			{
				this.setState(DOWN);
			}
		}
		else if (state == DOWN_MID)
		{
			this.setCollisionArea(GameConsts.DOWN_MID_DOOR_COLLISION);
			if (this.nextScriptInt(speed))
			{
				this.setState(MID);
			}
		}
		else if (state == DOWN)
		{
			this.setCollisionArea(GameConsts.DOOR_COLLISION[2]);
		}
	}

	@Override
	public void drawView(Canvas canvas)
	{
		if (state == UP)
		{
			this.drawImage(canvas, ImageConfig.DOOR_UP, x, y);
		}
		else if (state == UP_MID || state == MID_UP)
		{
			this.drawImage(canvas, ImageConfig.DOOR_MOVE_UP, x, y);
		}
		else if (state == MID)
		{
			this.drawImage(canvas, ImageConfig.DOOR_MID, x, y);
		}
		else if (state == MID_DOWN || state == DOWN_MID)
		{
			this.drawImage(canvas, ImageConfig.DOOR_MOVE_DOWN, x, y);
		}
		else if (state == DOWN)
		{
			this.drawImage(canvas, ImageConfig.DOOR_DOWN, x, y);
		}
	}

	public int getMoveType()
	{
		return moveType;
	}

	public void setMoveType(int moveType)
	{
		this.moveType = moveType;
	}

}
