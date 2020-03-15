import Move.Move

object CounterLastTurnPlayer {
  def setMove(l: List[TurnResult]): Move = {
    if (l.isEmpty) RandomAIPlayer.getMove
    else if (l.head.getMovePlayer2.equals(Move.ROCK)) Move.PAPER
    else if (l.head.getMovePlayer2.equals(Move.SCISSOR)) Move.ROCK
    else Move.SCISSOR
  }
}
