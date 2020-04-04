import Move.Move
import Result.Result

import scala.annotation.tailrec

object Main {
  var isPlaying: Boolean = true
  def main(args: Array[String]): Unit = {
    val rules: (Move, Move) => Result = (x: Move, y: Move) => Rules.getResult(x, y)
    val predictRules: (Move, Move) => Result = (x: Move, y: Move) => Rules.getPredictOpponentRules(x, y)
    val game: Game = new Game(rules)
    val playerAI = CounterLastTurnPlayer

    gameLoop(game)
//    while (isPlaying) {
//      println("Your turn. Choose ROCK, PAPER or SCISSOR")
//      val p1Move: Move = PlayerMove.setMove(game.getTurnHistoryPlayer1)
//      val p2Move: Move = playerAI.setMove(game.getTurnHistoryPlayer2)
//      println("PLAYER 1: " + p1Move)
//      println("PLAYER 2: " + p2Move)
//      game.playTurn(p1Move, p2Move)
//      println("Score: " + game.getScorePlayer1 + "-" + game.getScorePlayer2)
//      val input2 = keepPlayingInput()
//      if (input2.toUpperCase.contains("N")) isPlaying = false
//    }
  }

  @tailrec
  def gameLoop(game: Game): Unit = {
    val playerAI = LastSuccessfulMovePlayer
    println("Your turn. Choose ROCK, PAPER or SCISSOR")
    val p1Move: Move = PlayerMove.setMove(game.getTurnHistoryPlayer1)
    val p2Move: Move = playerAI.setMove(game.getTurnHistoryPlayer2)
    println("PLAYER 1: " + p1Move)
    println("PLAYER 2: " + p2Move)
    game.playTurn(p1Move, p2Move)
    println("Score: " + game.getScorePlayer1 + "-" + game.getScorePlayer2)
    val input2 = keepPlayingInput()
    if (input2.toUpperCase.contains("N")) isPlaying = false
    else gameLoop(game)
  }

  def keepPlayingInput(): String = {
    println("Keep playing? Y/N")
    Console.in.readLine
  }

}
