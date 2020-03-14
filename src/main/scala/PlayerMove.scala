import Move.Move

object PlayerMove {
  def setMove(): Move = {
    val input = Console.in.readLine
    if (input.toUpperCase.equals("ROCK")) Move.ROCK
    else if (input.toUpperCase.equals("PAPER")) Move.PAPER
    else if (input.toUpperCase.equals("SCISSOR")) Move.SCISSOR
    else null
  }
}
