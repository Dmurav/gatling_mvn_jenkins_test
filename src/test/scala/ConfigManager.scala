import com.typesafe.config.{Config, ConfigFactory}

object ConfigManager {

  val conf: Config = ConfigFactory.load()

}
