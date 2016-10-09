package test

import com.github.fommil.netlib.BLAS.{getInstance => blas}
import com.github.fommil.netlib.LAPACK.{getInstance => lapack}

object Main extends App {

  println(blas.getClass.getName)
  println(lapack.getClass.getName)

  def test(n: Int): Long = {
    import breeze.linalg._
    val start = System.nanoTime()
    (1 to 10).foreach{i =>
      val m: DenseMatrix[Double] = DenseMatrix.rand[Double](n,n) * DenseMatrix.rand[Double](n,n)
      max(m)
    }
    (System.nanoTime() - start)/1000000L
  }

  (1 to 5).foreach{i =>
    println(test(1000))
  }
}
