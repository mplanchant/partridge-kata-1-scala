package partridge1

import org.scalatest.{FlatSpec, Matchers}

class PartridgeMinesAPintSpec extends AlanSpec with Matchers {

  "Alan" should "say Lynn, I've pierced my foot on a spike!! if the list of terms is empty" in {
    PartridgeMinesAPint(List()) shouldBe "Lynn, I've pierced my foot on a spike!!"
  }

  he should "say Lynn, I've pierced my foot on a spike!! if the list contains none of the partridge terms" in {
    PartridgeMinesAPint(List("Blue", "Green", "Yellow", "Red")) shouldBe "Lynn, I've pierced my foot on a spike!!"
  }

  he should "say Mine's a Pint! if the list contains a single partridge term" in {
    PartridgeMinesAPint(List("PearTree")) shouldBe "Mine's a Pint!"
  }

  he should "say Mine's a Pint!! if the list contains a two partridge terms" in {
    PartridgeMinesAPint(List("PearTree", "PearTree")) shouldBe "Mine's a Pint!!"
  }

  he should "say Mine's a Pint!!!!!!!! if the list contains all the partridge terms" in {
    PartridgeMinesAPint(List("Partridge", "PearTree", "Chat", "Dan", "Toblerone", "Lynn", "AlphaPapa", "Nomad")) shouldBe "Mine's a Pint!!!!!!!!"
  }

  he should "append the correct number of exclamation marks if the list contains a mixture of partridge an non-partridge terms" in {
    PartridgeMinesAPint(List("Partridge", "PearTree", "Chat", "Dan", "Blue", "Green", "Yellow", "Red", "Toblerone", "Lynn", "AlphaPapa", "Nomad")) shouldBe "Mine's a Pint!!!!!!!!"
  }
}

trait AlanSpec extends FlatSpec {
  protected val he: ItWord = it
}
