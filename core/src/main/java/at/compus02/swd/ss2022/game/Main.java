package at.compus02.swd.ss2022.game;

import at.compus02.swd.ss2022.game.factory.MapFactory;
import at.compus02.swd.ss2022.game.gameobjects.*;
import at.compus02.swd.ss2022.game.input.GameInput;
import at.compus02.swd.ss2022.game.movementstrategy.EnemyLogic;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.viewport.ExtendViewport;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {
	private SpriteBatch batch;

	private Array<GameObject> gameObjects = new Array<>();

	private OrthographicCamera camera = new OrthographicCamera();

	private ExtendViewport viewport = new ExtendViewport(480.0f, 480.0f, camera);
	private GameInput gameInput = new GameInput();

	private EnemyLogic enemyLogic = new EnemyLogic(gameObjects);

	private final float updatesPerSecond = 60;
	private final float logicFrameTime = 1 / updatesPerSecond;
	private float deltaAccumulator = 0;
	private BitmapFont font;

	@Override
	public void create() {

		/*gameObjects.add(new Sign());
		gameObjects.add(new TileWater());
		gameObjects.add(new Player());
		font = new BitmapFont();*/
		//font.setColor(Color.WHITE);
		Gdx.input.setInputProcessor(this.gameInput);
		batch = new SpriteBatch();

		MapFactory mapFactory = new MapFactory();
		mapFactory.createMap(
				gameObjects,
				gameInput,
				camera,
				enemyLogic);
	}

	private void act(float delta) {
		for(GameObject gameObject : gameObjects) {
			gameObject.act(delta);
		}
	}

	private void draw() {
		gameObjects.sort(new GameObjectDraw());
		batch.setProjectionMatrix(viewport.getCamera().combined);
		batch.begin();
//		font.draw(batch, "Hello Game CO-02", -220, -220);
		for(GameObject gameObject : gameObjects) {
			gameObject.draw(batch);
		}

		batch.end();
	}

	@Override
	public void render() {

		Gdx.gl.glClearColor(0.15f, 0.15f, 0.2f, 1f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		float delta = Gdx.graphics.getDeltaTime();
		deltaAccumulator += delta;
		while(deltaAccumulator > logicFrameTime) {
			deltaAccumulator -= logicFrameTime;
			act(logicFrameTime);
		}
		draw();
	}

	@Override
	public void dispose() {
		batch.dispose();
	}

	@Override
	public void resize(int width, int height){
		viewport.update(width,height);
	}
}