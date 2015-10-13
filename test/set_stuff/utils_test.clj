(ns set-stuff.utils-test
  (:require [clojure.test :refer :all]
            [set-stuff.utils :refer :all]))

(deftest test-remove-non-alpha-numeric 
  (testing "It removes non-alpha-numeric characters"
    (is (= "ABC123" (remove-non-alpha-numeric "ABC!@#$%^123")))))
