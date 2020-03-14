import Move.Move
import Result.Result

class Game(p1: Move, p2: Move, f: (Move, Move) => Result) {
  var scorePlayer1: Int = 0
  var scorePlayer2: Int = 0

  def getScorePlayer1: Int = scorePlayer1
  def getScorePlayer2: Int = scorePlayer2
  def playTurn() = {
    val result = f(p1, p2)
    if (result.equals(Result.PLAYER1_WON)) scorePlayer1 += 1
    else if (result.equals(Result.PLAYER2_WON)) scorePlayer2 += 1
  }
}
