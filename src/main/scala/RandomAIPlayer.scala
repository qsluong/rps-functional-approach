import Move.Move

import scala.util.Random

object RandomAIPlayer {
  def getMove: Move = {
    val randomMoveInt = Random.nextInt(2)
    var move: Move = null
    for ((m, i) <- Move.values.zipWithIndex) {
      if (i == randomMoveInt) move = m
    }
    move
  }
}
