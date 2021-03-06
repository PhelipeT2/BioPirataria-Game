package com.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Sprite player;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		
		//img = new Texture("badlogic.jpg");
		player = new Sprite(new Texture("Human.jpg"));
		
	}
	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		super.resize(width, height);
	}

	@Override
	public void render () {
		
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		if(Gdx.input.isKeyPressed(Keys.W)) {
			player.setY(player.getY()+5);
		}
		if(Gdx.input.isKeyPressed(Keys.S)) {
			player.setY(player.getY()-5);
		}
		if(Gdx.input.isKeyPressed(Keys.A)) {
			player.setX(player.getX()-5);
		}
		if(Gdx.input.isKeyPressed(Keys.D)) {
			player.setX(player.getX()+5);
		}
		
		
		batch.begin();
		batch.draw(player, player.getX(), player.getY());
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
