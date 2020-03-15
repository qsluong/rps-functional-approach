import Move.Move
import Result.Result

class TurnResult(movePlayer1: Move, movePlayer2: Move, result: Result) {
  private val _movePlayer1: Move = movePlayer1
  private val _movePlayer2: Move = movePlayer2
  private val _result: Result = result

  def getMovePlayer1: Move = _movePlayer1
  def getMovePlayer2: Move = _movePlayer2
  def getResult: Result = _result
}
