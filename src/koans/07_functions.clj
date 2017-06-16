(ns koans.07-functions
  (:require [koan-engine.core :refer :all]))

(defn square [n] (* n n))

(meditations
  "Calling a function is like giving it a hug with parentheses"
  (= __ (square 9))

  "But they can also be defined inline"
  (= __ ((fn [n] (* 5 n)) 2))

  "Even anonymous functions may take multiple arguments"
  (= __ (#(+ %1 %2 %3) 4 5 6))

  "Arguments can also be skipped"
  (= __ (#(str "AA" %2) "bb" "CC"))

  "Functions can also take other functions as input"
  (= 20 ((fn [f] (f 4 5))
           ___))

  "But they are often better written using the names of functions"
  (= 25 (___ square)))
