(ns set-stuff.core-test
  (:require [clojure.test :refer :all]
            [set-stuff.core :refer :all]))

(deftest test-intersection-of-files
  (testing "It returns the intersection between the two files"    
      (is (= #{"Baz"} (intersection-files "text1.txt" "text2.txt"))))
  (testing "It returns an empty set"
    (is (= #{} (intersection-files "nonexistant.txt" "nonexistant.txt")))))

(deftest test-read-file
  (testing "It reads the file into a seq"
    (is (= '(1 2 3) (read-file "sample.txt"))))
  (testing "It returns an empty list when given an illegal argument"
    (is (= () (read-file "nonexistent.txt")))))

(deftest test-count-file-contents
  (testing "It returns the number of items in a file"
    (is (= 3 (count-file-contents "sample.txt")))))
