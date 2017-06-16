(ns koans.04-vectors
  (:require [koan-engine.core :refer :all]))

(meditations
  "You can use vectors in clojure as array-like structures"
  (= __ (count [42]))

  "But you can populate it with any number of elements at once"
  (= [1 __] (vec '(1 2)))

  "Conjoining to a vector is different than to a list"
  (= __ (conj [111 222] 333))

  "You can get the first element of a vector like so"
  (= __ (first [:peanut :butter :and :jelly]))

  "And the last in a similar fashion"
  (= __ (last [:peanut :butter :and :jelly]))

  "Or any index if you wish"
  (= __ (nth [:peanut :butter :and :jelly] 3))

  "Equality with collections is in terms of values"
  (= (list 1 2 3) (vector 1 2 __)))
