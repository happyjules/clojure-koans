(ns koans.01-equalities
  (:require [koan-engine.core :refer :all]))

(meditations
  "We shall contemplate truth by testing reality, via equality"
  (= __ true)

  "To understand reality, we must compare our expectations against reality"
  (= __ (+ 1 1))

  "You can test equality of many things"
  (= (+ 3 4) 7 (+ 2 __))

  "You cannot generally float to heavens of integers"
  (= __ (= 2 2.0))

  "Strings, and keywords, and symbols: oh my!"
  (= __ (= "hello" :hello 'hello))

  "What could be equivalent to nothing?"
  (= __ nil))
