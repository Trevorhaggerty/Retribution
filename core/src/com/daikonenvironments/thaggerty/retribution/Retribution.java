package com.daikonenvironments.thaggerty.retribution;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import retributionTools.retributionInfo;

public class Retribution extends ApplicationAdapter {
	
	
	SpriteBatch batch;
	
	Texture dirtTile;
	Texture playerImage;
	Texture enemyImage;
	Sprite playerSprite;
	Sprite enemySprite;
	
	int tileOffsetY = 12;
	
	int tileLocationX = 0;
	int tileLocationY = 0;
	int playerSpawnX = retributionInfo.SPRITESIZE + 100;
	int playerSpawnY = retributionInfo.SPRITESIZE+ 50;
	int enemySpawnX = playerSpawnX + retributionInfo.SPRITESIZE;
	int enemySpawnY = playerSpawnY;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		dirtTile = new Texture("assets/dirtTile2.png");
		playerImage = new Texture("assets/noBelly/1.png");
		enemyImage = new Texture("assets/owlguy2.png");
		playerSprite = new Sprite(playerImage); 
		enemySprite = new Sprite(enemyImage); 
		
		
		playerSprite.setPosition(0,0);
		
		//playerSprite.setPosition(playerSpawnX - retributionInfo.SPRITESIZE / 2, playerSpawnY - retributionInfo.SPRITESIZE / 2);
		enemySprite.setPosition(enemySpawnX - retributionInfo.SPRITESIZE / 2, enemySpawnY - retributionInfo.SPRITESIZE / 2);
		
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		
		for(int loopB = 10; loopB >= 0; loopB--) {
			for(int loopA = 10; loopA >= 0; loopA--) {
			
				if (loopB % 2 == 0) {
				tileLocationY = loopA*(retributionInfo.SPRITESIZE - 40);
			} else {
				tileLocationY = loopA*(retributionInfo.SPRITESIZE - 40) + 12;	
			}
				tileLocationX = loopB*(retributionInfo.SPRITESIZE - 18);
				
				batch.draw(dirtTile, tileLocationX, tileLocationY );	
			}
		}
				
		batch.draw(playerSprite, playerSprite.getX(), playerSprite.getY());
		batch.draw(enemySprite, enemySprite.getX(), enemySprite.getY());
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		playerImage.dispose();
		enemyImage.dispose();
		dirtTile.dispose();
	}
}
//lolololololololololololo