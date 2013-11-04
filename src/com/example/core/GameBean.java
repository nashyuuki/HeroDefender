package com.example.core;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.example.herodefender.GameConsts;
import com.example.herodefender.config.ImageConfig;
import com.example.herodefender.config.ModelConfig;
import com.example.herodefender.config.MusicConfig;

public class GameBean extends Application
{
	private Context context;
	private ModelConfig modelConfig;
	private ImageConfig imageConfig;
	private MusicConfig musciConfig;
	private GameConsts gameConsts;
	private int state= -1;
	private int nextState;
	public GameBean()
	{
		Log.v("TEST", "init gameBean");
		
	}
	public void init()
	{
		Log.v("TEST", "GameBean init");
		modelConfig = new ModelConfig(this);
		imageConfig = new ImageConfig(this.context);
		musciConfig = new MusicConfig(this.context);
		gameConsts = new GameConsts(context.getResources());
		state = -1;
	}
	public void restoreGameBean()
	{
	}
	public void storeGameBean()
	{
	}
	/**
	 * @return the modelConfig
	 */
	public ModelConfig getModelConfig()
	{
		return modelConfig;
	}
	/**
	 * @param modelConfig the modelConfig to set
	 */
	public void setModelConfig(ModelConfig modelConfig)
	{
		this.modelConfig = modelConfig;
	}
	/**
	 * @return the imageConfig
	 */
	public ImageConfig getImageConfig()
	{
		return imageConfig;
	}
	/**
	 * @param imageConfig the imageConfig to set
	 */
	public void setImageConfig(ImageConfig imageConfig)
	{
		this.imageConfig = imageConfig;
	}
	/**
	 * @return the musciConfig
	 */
	public MusicConfig getMusciConfig()
	{
		return musciConfig;
	}
	/**
	 * @param musciConfig the musciConfig to set
	 */
	public void setMusciConfig(MusicConfig musciConfig)
	{
		this.musciConfig = musciConfig;
	}
	/**
	 * @return the state
	 */
	public int getState()
	{
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(int state)
	{
		this.state = state;
	}
	/**
	 * @return the nextState
	 */
	public int getNextState()
	{
		return nextState;
	}
	/**
	 * @param nextState the nextState to set
	 */
	public void setNextState(int nextState)
	{
		this.nextState = nextState;
	}
	/**
	 * @return the context
	 */
	public Context getContext()
	{
		return context;
	}
	/**
	 * @param context the context to set
	 */
	public void setContext(Context context)
	{
		this.context = context;
	}
	
}
