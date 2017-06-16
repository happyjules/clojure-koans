(ns koans.03-lists
  (:require [koan-engine.core :refer :all]))

(meditations
  "Lists can be expressed by function or a quoted form"
  (= '(__ __ __ __ __) (list 1 2 3 4 5))

  "They are Clojure seqs (sequences), so they allow access to the first"
  (= __ (first '(1 2 3 4 5)))

  "As well as the rest"
  (= __ (rest '(1 2 3 4 5)))

  "Count your blessings"
  (= __ (count '(dracula dooku chocula)))

  "The rest, when nothing is left, is empty"
  (= __ (rest '(100)))

  "Construction by adding an element to the front is easy"
  (= __ (cons :a '(:b :c :d :e)))

  "Conjoining an element to a list isn't hard either"
  (= __ (conj '(:a :b :c :d) :e))

  "You can use a list like a stack to get the first element"
  (= __ (peek '(:a :b :c :d :e)))

  "Or the others"
  (= __ (pop '(:a :b :c :d :e))))
