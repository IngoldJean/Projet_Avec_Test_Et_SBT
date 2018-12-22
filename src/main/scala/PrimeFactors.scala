package primeFactors

class PrimeFactors {

  var retour: List[Int] = List[Int]()

  def generate (number: Int): List[Int] = {
    var valeur = number
    var candidate = 2
    while (valeur>1) {
      while (valeur % candidate == 0) {
        retour = retour ::: List(candidate)
        valeur /= candidate
        println(retour)
      }
      candidate+=1
    }

    retour
  }
}