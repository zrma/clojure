(ns hacker-rank.tutorials.tutorial-10days-of-statistics-test
  (:require [clojure.test :refer :all])
  (:require [hacker-rank.tutorials.tutorial-10days-of-statistics :refer :all]))

(deftest mean-test
  (testing ["utility"
            "mean"])
  (is (= [0.0 43900.6]
         (map mean [[] [64630 11735 14216 99233 14470 4978 73429 38120 51135 67060]]))))

(deftest median-test
  (is (= [0.0 38120 44627.5]
         (map median [[]
                      [64630 11735 14216 99233 14470 4978 73429 38120 51135]
                      [64630 11735 14216 99233 14470 4978 73429 38120 51135 67060]]))))

(deftest mean-median-mode-test
  (testing ["Day 0: Mean, Median, and Mode"
            "https://www.hackerrank.com/challenges/s10-basic-statistics/problem"])
  (is (= [43900.6 44627.5 4978]
         (let [arr [64630 11735 14216 99233 14470 4978 73429 38120 51135 67060]]
           [(mean arr) (median arr) (mode arr)]))))

(deftest weighted-mean-test
  (testing ["Day 0: Weighted Mean"
            "https://www.hackerrank.com/challenges/s10-weighted-mean/problem"]
    (is (= [32.0 0.0]
           (map (fn [[nums weights]] (weighted-mean nums weights))
                [[[10 40 30 50 20] [1 2 3 4 5]] [[] []]])))))

(deftest quartiles-test
  (testing ["Day 1: Quartiles"
            "https://www.hackerrank.com/challenges/s10-quartiles/problem"]
    (is (= [[6 12 16] [7 13 15] [4 11 15]]
           (map quartiles [[3 7 8 5 12 14 21 13 18]
                           [3 7 8 5 12 14 21 15 18 14]
                           [4 17 7 14 18 12 3 16 10 4 4 12]])))))

(deftest inter-quartile-range-test
  (testing ["Day 1: Interquartile Range"
            "https://www.hackerrank.com/challenges/s10-interquartile-range/problem"]
    (is (= [9.0 5.0 20.0 8.0]
           (map (fn [[num-coll frequency-coll]] (inter-quartile-range num-coll frequency-coll))
                [[[6 12 8 10 20 16]
                  [5 4 3 2 1 5]]
                 [[10 40 30 50 20 10 40 30 50 20 1 2 3 4 5 6 7 8 9 10]
                  [1 2 3 4 5 6 7 8 9 10 10 40 30 50 20 10 40 30 50 20]]
                 [[10 40 30 50 20 10 40 30 50 20]
                  [1 2 3 4 5 6 7 8 9 10]]
                 [[6 12 8 10 20 16]
                  [5 6 7 8 9 10]]])))))
