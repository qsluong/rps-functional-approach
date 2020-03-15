import Move.Move

object PlayerMove {
  def setMove(l:List[TurnResult]): Move = {
    val input = readInput()
    if (input.toUpperCase.equals("ROCK")) Move.ROCK
    else if (input.toUpperCase.equals("PAPER")) Move.PAPER
    else if (input.toUpperCase.equals("SCISSOR")) Move.SCISSOR
    else null
  }

  def readInput(): String = {
    val input = Console.in.readLine()
    input
  }

}
