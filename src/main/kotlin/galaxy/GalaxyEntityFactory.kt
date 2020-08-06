package galaxy

import com.almasb.fxgl.dsl.entityBuilder
import com.almasb.fxgl.dsl.getGameScene
import com.almasb.fxgl.dsl.texture
import com.almasb.fxgl.entity.Entity
import com.almasb.fxgl.entity.EntityFactory
import com.almasb.fxgl.entity.SpawnData
import com.almasb.fxgl.entity.Spawns
import com.almasb.fxgl.entity.components.CollidableComponent
import galaxy.components.PlayerRollAnimationComponent
import galaxy.components.PlayerMovementComponent
import javafx.scene.paint.Color


class GalaxyEntityFactory : EntityFactory {

    @Suppress("UNUSED", "UNUSED_PARAMETER")
    @Spawns("Background")
    fun newBackground(data: SpawnData): Entity {

        getGameScene().setBackgroundColor(Color.BLACK)

        return entityBuilder()
            .at(-10.0, -10.0)
            .view(texture(data.get("baseTexture"), 820.0, 620.0))
            .zIndex(-500)
            .build()
    }

    @Suppress("UNUSED")
    @Spawns("Player")
    fun newPlayer(data: SpawnData): Entity {

        return entityBuilder(SpawnData(GalaxyEntityType.PLAYER.spawnPosition))
                .type(GalaxyEntityType.PLAYER)
                .with(CollidableComponent(true))
                .with(PlayerMovementComponent())
                .with(PlayerRollAnimationComponent())
                .build()
    }
}