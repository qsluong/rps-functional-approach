import Move.Move
import Result.Result

object Main {
  var isPlaying: Boolean = true
  def main(args: Array[String]): Unit = {

    while (isPlaying) {
      println("Your turn. Choose ROCK, PAPER or SCISSOR")
      val p1Move: Move = PlayerMove.setMove()
      val p2Move: Move = RockPlayerMove.setMove()
      println("PLAYER 1: " + p1Move)
      println("PLAYER 2: " + p2Move)
      val rules: (Move, Move) => Result = (x: Move, y: Move) => Rules.getResult(x, y)
      val game: Game = new Game(p1Move, p2Move, rules)
      game.playTurn()

      println("Score: " + game.getScorePlayer1 + "-" + game.getScorePlayer2)
      val input2 = keepPlayingInput()
      if (input2.toUpperCase.contains("N")) isPlaying = false
    }
  }

  def keepPlayingInput(): String = {
    println("Keep playing? Y/N")
    Console.in.readLine
  }

}
