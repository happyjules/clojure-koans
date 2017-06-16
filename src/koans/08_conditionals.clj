(ns koans.08-conditionals
  (:require [koan-engine.core :refer :all]))

(meditations
  "You will face many decisions"
  (= __ (if (false? (= 4 5))
          :a
          :b))

  "Some of them leave you no alternative"
  (= __ (if (> 4 3)
          []))

  "And in such a situation you may have nothing"
  (= __ (if (nil? 0)
          [:a :b :c]))

  "In others your alternative may be interesting"
  (= :glory (if (not (empty? ()))
              :doom
              __))

  "Or your fate may be sealed"
  (= 'doom (if-not (zero? __)
          'doom
          'more-doom)))
