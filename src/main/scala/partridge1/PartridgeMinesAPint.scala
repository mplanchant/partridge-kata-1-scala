package partridge1

object PartridgeMinesAPint {

  private val partridgeTerms = List("Partridge", "PearTree", "Chat", "Dan", "Toblerone", "Lynn", "AlphaPapa", "Nomad")

  def apply(terms: List[String]): String = {
    terms.count(term => partridgeTerms.contains(term)) match {
      case 0 => "Lynn, I've pierced my foot on a spike!!"
      case noOfTerms => "Mine's a Pint" + ("!" * noOfTerms)
    }
  }
}
