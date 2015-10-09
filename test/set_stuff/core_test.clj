(ns set-stuff.core-test
  (:require [clojure.test :refer :all]
            [set-stuff.core :refer :all]))

(deftest test-intersection-of-files
  (testing "It returns the set"
      (is (= #{1 2 3} (intersection-files "sample.txt" "sample.txt")))))

(deftest test-read-file
  (testing "It reads the file into a seq"
    (is (= '(1 2 3) (read-file "sample.txt")))))


