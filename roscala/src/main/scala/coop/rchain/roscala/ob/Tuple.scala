package coop.rchain.roscala.ob

case class Tuple(value: Array[Ob]) extends Ob {
  def apply(i: Int): Ob              = value(i)
  def update(arg: Int, ob: Ob): Unit = value.update(arg, ob)
}

case object Nil extends Ob
