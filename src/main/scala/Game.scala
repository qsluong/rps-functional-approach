import Move.Move
import Result.Result

class Game(f: (Move, Move) => Result) {
  private var turnHistory: List[TurnResult] = List.empty
  var scorePlayer1: Int = 0
  var scorePlayer2: Int = 0

  def getScorePlayer1: Int = scorePlayer1
  def getScorePlayer2: Int = scorePlayer2
  def getTurnHistoryPlayer1 = turnHistory
  def getTurnHistoryPlayer2 = turnHistory.map(e => new TurnResult(e.getMovePlayer2, e.getMovePlayer1, e.getResult))
  def playTurn(p1: Move, p2: Move): TurnResult = {
    val result = f(p1, p2)
    val turnResult: TurnResult = new TurnResult(p1, p2, result)
    turnHistory = turnResult +: turnHistory
    if (result.equals(Result.PLAYER1_WON)) scorePlayer1 += 1
    else if (result.equals(Result.PLAYER2_WON)) scorePlayer2 += 1
    turnResult
  }
}
