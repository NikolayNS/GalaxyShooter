package galaxy.entity_data

import javafx.util.Duration

data class Enemy(
        val maxHealth: Int = 1,
        val size: Double = 64.0,
        val speed: Double = 100.0,
        val explosionDrag: Double = .99,
        val texture: String = "enemy/enemy.png",
        val explosionSound: String = "explosion_sound.wav",
        val scoreForKill: Int = 100,
        val scoreForLoose: Int = -10
)

val ENEMY = Enemy()

data class EnemySpawn(
        val spawnDelay: Duration = Duration.seconds(.5)
)

val ENEMY_SPAWN = EnemySpawn()