(ns prime-factors-kata.core-spec
  (:require [speclj.core :refer :all]
            [prime-factors-kata.core :refer :all]))

(describe "Prime Factors Kata"
  (it "Finds the prime factors"
    (should= [] (find-prime-factors 1))
    (should= [2] (find-prime-factors 2))
    (should= [3] (find-prime-factors 3))
    (should= [2 2] (find-prime-factors 4))
    (should= [2 3] (find-prime-factors 6))
    (should= [2 2 2] (find-prime-factors 8))
    (should= [3 3] (find-prime-factors 9))))