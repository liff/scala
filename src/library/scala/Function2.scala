
/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2002-2008, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |    http://scala-lang.org/               **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */

// $Id$

// generated by genprod on Wed Apr 16 16:26:09 CEST 2008 (with fancy comment) (with extra methods)

package scala


/** <p>
 *    Function with 2 parameters.
 *  </p>
 *  <p>
      In the following example the definition of
 *    <code>max</code> is a shorthand for the anonymous class definition
 *    <code>anonfun2</code>:
 *  </p>
 *  <pre>
 *  <b>object</b> Main <b>extends</b> Application {
 *
 *    <b>val</b> max = (x: Int, y: Int) => <b>if</b> (x < y) y <b>else</b> x
 *
 *    <b>val</b> anonfun2 = <b>new</b> Function2[Int, Int, Int] {
 *      <b>def</b> apply(x: Int, y: Int): Int = <b>if</b> (x < y) y <b>else</b> x
 *    }
 *
 *    println(max(0, 1))
 *    println(anonfun2(0, 1))
 *  }</pre>
 */
trait Function2[-T1, -T2, +R] extends AnyRef {
  def apply(v1:T1, v2:T2): R
  override def toString() = "<function>"

  /** f(x,y) == (f.uncurry)(x)(y)
   */
  def uncurry: T1 => T2 => R = { (x:T1) => (y:T2) => apply(x,y) }

}
