import Move.Move

import scala.annotation.tailrec

object LastSuccessfulMovePlayer {
  def setMove(l: List[TurnResult]): Move = {
    getLastSuccessfulMove(l)
  }

  @tailrec
  def getLastSuccessfulMove(l: List[TurnResult]): Move = {
    if (l == Nil) RandomAIPlayer.getMove
    else {
      val turnResult::tail = l
      if (turnResult.getResult.equals(Result.PLAYER1_WON)) turnResult.getMovePlayer1
      else getLastSuccessfulMove(tail)
    }
  }
}
