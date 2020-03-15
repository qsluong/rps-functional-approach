import Move.Move

object LastTurnPlayer {
  def setMove(l: List[TurnResult]): Move = {
    if (l.isEmpty) {
      RandomAIPlayer.getMove
    } else {
      l.head.getMovePlayer2
    }
  }
}
