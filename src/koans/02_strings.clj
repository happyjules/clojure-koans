(ns koans.02-strings
  (:require [koan-engine.core :refer :all]
            [clojure.string :as string]))

(meditations
  "A string is nothing more than text surrounded by double quotes"
  (= __ "hello")

  "But double quotes are just magic on top of something deeper"
  (= __ (str 'world))

  "You can do more than create strings, you can put them together"
  (= "Cool right" (str __ __))

  "Or even count the characters"
  (= __ (count "Hello World"))

  "You may want to make sure your words are backwards"
  (= __ (string/reverse "hello"))

  "Strings are strings"
  (= true (string? __))

  "Some strings may be blank"
  (= __ (string/blank? ""))

  "However, most strings aren't blank"
  (= __ (string/blank? "hello world!")))
