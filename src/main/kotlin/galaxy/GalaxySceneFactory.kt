package galaxy

import com.almasb.fxgl.app.scene.FXGLMenu
import com.almasb.fxgl.app.scene.SceneFactory
import galaxy.main_menu.GalaxyAppMainMenu

class GalaxySceneFactory : SceneFactory() {

	override fun newMainMenu(): FXGLMenu {
		return GalaxyAppMainMenu()
	}
}