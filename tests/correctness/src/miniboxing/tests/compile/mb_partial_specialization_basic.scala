package miniboxing.tests.compile

import miniboxing.plugin.minispec

class UhOh1[@minispec X, Y]{
  def foo(x: X, y: Y): X = foo(x, y)
}