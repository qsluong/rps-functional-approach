import Move.Move
import Result.Result

object Rules {
  def getResult(p1: Move, p2: Move): Result = {
    if (p1.equals(Move.ROCK) && p2.equals(Move.SCISSOR) ||
      p1.equals(Move.SCISSOR) && p2.equals(Move.PAPER) ||
      p1.equals(Move.PAPER) && p2.equals(Move.ROCK)) Result.PLAYER1_WON
    else if (p2.equals(Move.ROCK) && p1.equals(Move.SCISSOR) ||
      p2.equals(Move.SCISSOR) && p1.equals(Move.PAPER) ||
      p2.equals(Move.PAPER) && p1.equals(Move.ROCK)) Result.PLAYER2_WON
    else Result.TIE
  }

  def getPredictOpponentRules(p1: Move, p2: Move): Result = {
    if (p1.equals(p2)) Result.PLAYER1_WON
    else Result.PLAYER2_WON
  }
}
