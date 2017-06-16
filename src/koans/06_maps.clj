(ns koans.06-maps
  (:require [koan-engine.core :refer :all]))

(meditations

  "A value must be supplied for each key"
  (= {:a 1} (hash-map :a __))

  "The size is the number of entries"
  (= __ (count {:a 1 :b 2}))

  "You can look up the value for a given key"
  (= __ (get {:a 1 :b 2} :b))

  "Maps can be used as functions to do lookups"
  (= __ ({:a 1 :b 2} :a))

  "And so can keywords"
  (= __ (:a {:a 1 :b 2}))

  "But map keys need not be keywords"
  (= __ ({2010 "Vancouver" 2014 "Sochi" 2018 "PyeongChang"} 2014))

  "You may not be able to find an entry for a key"
  (= __ (get {:a 1 :b 2} :c))

  "You can find out if a key is present"
  (= __ (contains? {:a nil :b nil} :b))

  "Maps are immutable, but you can create a new and improved version"
  (= {1 "January" 2 __} (assoc {1 "January"} 2 "February")))
